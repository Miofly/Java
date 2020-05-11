package com.mio.search.service.impl;

import com.mio.search.mapper.ItemsMapper;
import com.mio.search.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private ItemsMapper itemsMapper;
	
//	@Autowired
//	private SolrServer solrServer;
	/*@Autowired
	private SolrClient solrClient;

	@Override
	public String importAllItems()  throws Exception {
			//查询商品列表
			List<Items> list = itemsMapper.getItemList();
			//把商品信息写入索引库
			for (Items items : list) {
				//创建一个SolrInputDocument对象
				SolrInputDocument document = new SolrInputDocument();
				document.setField("id", items.getId());
				document.setField("tree_parentId", items.getParentId());
				document.setField("tree_name", items.getName());
				document.setField("tree_state", items.getStatus());
				document.setField("tree_sortOrder", items.getSortOrder());
				document.setField("tree_isParents", items.getIsParent());
				document.setField("tree_attribute", items.getAttribute());
				//写入索引库
				solrClient.add(document);
			}
			//提交修改
		solrClient.commit();

		return "success";
	}*/

}
