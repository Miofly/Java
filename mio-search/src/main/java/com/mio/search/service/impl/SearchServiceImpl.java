package com.mio.search.service.impl;

import com.mio.search.service.SearchDao;
import com.mio.search.service.SearchService;
import com.mio.util.EUDataGridResults;
import org.apache.solr.client.solrj.SolrQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	private SearchDao searchDao;
	@Override
	public EUDataGridResults search(String queryString, int pageIndex, int pageSize) throws Exception {
		//创建查询对象
		SolrQuery query = new SolrQuery();
		//设置查询条件
		query.setQuery(queryString);
		//设置分页
		query.setStart((pageIndex - 1) * pageSize);
		query.setRows(pageSize);
		//设置默认搜素域
		query.set("df", "tree_keywords");
		//设置高亮显示
		query.setHighlight(true);
		query.addHighlightField("tree_name");
		query.setHighlightSimplePre("<em style=\"color:red\">");
		query.setHighlightSimplePost("</em>");
		//执行查询
		EUDataGridResults searchResult = searchDao.search(query);
		//计算查询结果总页数
		long recordCount = searchResult.getTotal();
		int pageCount = (int) (recordCount / pageSize);
		if (recordCount % pageSize > 0) {
			pageCount++;
		}
		searchResult.setPageSize(pageCount);
		searchResult.setPageIndex(pageIndex);
		return searchResult;
	}

}

