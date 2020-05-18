package com.mio.search.service.impl;


import com.mio.global.CommonResultUtil;
import com.mio.global.Config;
import com.mio.result.ResultUtil;
import com.mio.search.pojo.Items;
import com.mio.search.service.SearchDao;
import com.mio.util.EUDataGridResults;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Repository
public class SearchDaoImpl implements SearchDao {

    /*单机*/
    @Autowired
    private SolrClient solrClient;

    /*集群*/
//	@Autowired
//	private CloudSolrClient solrClient;

    @Override
    public EUDataGridResults search(SolrQuery query) throws Exception {
        //返回值对象
        EUDataGridResults result = new EUDataGridResults();
        //根据查询条件查询索引库
        QueryResponse queryResponse = solrClient.query(query);
        //取查询结果
        SolrDocumentList solrDocumentList = queryResponse.getResults();
        //取查询结果总数量
        result.setTotal(solrDocumentList.getNumFound());
        //商品列表
        List<Items> itemList = new ArrayList<>();
        //取高亮显示
        Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();
        //取商品列表
        for (SolrDocument solrDocument : solrDocumentList) {
            //创建一商品对象
            Items item = new Items();
            item.setId((String) solrDocument.get("id"));
            //取高亮显示的结果
            List<String> list = highlighting.get(solrDocument.get("id")).get("tree_name");
            String name = "";
            if (list != null && list.size() > 0) {
                name = list.get(0);
            } else {
                name = (String) solrDocument.get("tree_name");
            }
            item.setName(name);
            item.setAttribute((String) solrDocument.get("tree_attribute"));
            item.setIsParent((String) solrDocument.get("tree_isParent"));
            item.setParentId((String) solrDocument.get("tree_parentId"));
            item.setCreated((Date) solrDocument.get("tree_created"));
            item.setUpdated((Date) solrDocument.get("tree_updated"));
            item.setSortOrder(Integer.parseInt(String.valueOf(solrDocument.get("tree_sortOrder"))));
            item.setStatus(Integer.parseInt(String.valueOf(solrDocument.get("tree_status"))));
            //添加的商品列表
            itemList.add(item);
        }
        result.setData(itemList);
        return result;

    }


    public void deleteAll() throws Exception {
        solrClient.deleteByQuery("*:*");
        solrClient.commit();
    }

    public void deleteById(String id) throws Exception {

        SolrQuery query = new SolrQuery();
        //设置查询条件
        query.setQuery("id:" + id + "");
        //执行查询
        QueryResponse response = solrClient.query(query);
        //取查询结果
        SolrDocumentList solrDocumentList = response.getResults();
        if (solrDocumentList.getNumFound() == 0) {
            CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, null, 900, null));

        }

        solrClient.deleteById(id);
        solrClient.commit();
    }

    public void deleteByIds(List<String> ids) throws Exception {
        solrClient.deleteById(ids);
        solrClient.commit();
    }
}
