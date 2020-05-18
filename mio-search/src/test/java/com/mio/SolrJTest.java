package com.mio;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class SolrJTest {

	@Test
	public void addDocument() throws Exception {
		//创建一连接
//		HttpSolrClient  solrServer = new HttpSolrClient.Builder("http://192.168.192.128:8983/solr/mio").build();

		HttpSolrClient solrServer = new HttpSolrClient.Builder("http://192.168.192.128:8983/solr/mio")
				.withConnectionTimeout(10000)
				.withSocketTimeout(60000)
				.build();
		//创建一个文档对象
		SolrInputDocument document = new SolrInputDocument();
		document.addField("id", "test001");
	/*	document.addField("item_title", "测试商品2");
		document.addField("item_price", 54321);*/
		//把文档对象写入索引库
		solrServer.add(document);
		//提交
		solrServer.commit();
	}
	
	@Test
	public void deleteDocument() throws Exception {
		//创建一连接
		HttpSolrClient  solrServer = new HttpSolrClient.Builder("http://192.168.192.128:8983/solr/mio")
				.withConnectionTimeout(10000)
				.withSocketTimeout(60000)
				.build();
		//solrServer.deleteById("test001");
		solrServer.deleteByQuery("*:*");
		solrServer.commit();
	}


	@Test
	public void deleteDocument1() throws Exception {
		//创建一连接
		HttpSolrClient  solrServer = new HttpSolrClient.Builder("http://192.168.192.128:8983/solr/mio")
				.withConnectionTimeout(10000)
				.withSocketTimeout(60000)
				.build();
		solrServer.deleteById("86");
		solrServer.commit();
	}
	@Test
	public void deleteDocument2() throws Exception {
		//创建一连接
		HttpSolrClient  solrServer = new HttpSolrClient.Builder("http://192.168.192.128:8983/solr/mio")
				.withConnectionTimeout(10000)
				.withSocketTimeout(60000)
				.build();
		List<String> list = new ArrayList<>();
		list.add("87");
		list.add("88");
		list.add("89");
		System.out.println(list);
		solrServer.deleteById(list);
		solrServer.commit();
	}

	@Test
	public void deleteDocument3() throws Exception {
		//创建一连接
		HttpSolrClient  solrServer = new HttpSolrClient.Builder("http://192.168.192.128:8983/solr/mio")
				.withConnectionTimeout(10000)
				.withSocketTimeout(60000)
				.build();

		solrServer.deleteByQuery("淘淘");
		solrServer.commit();
	}

	@Test
	public void queryDocument() throws Exception {


		HttpSolrClient  solrServer = new HttpSolrClient.Builder("http://192.168.192.128:8983/solr/mio")
				.withConnectionTimeout(10000)
				.withSocketTimeout(60000)
				.build();
		SolrQuery query = new SolrQuery();
		//设置查询条件
		query.setQuery("id:910");
		query.setStart(0);
		query.setRows(50);
		//执行查询
		QueryResponse response = solrServer.query(query);
		//取查询结果
		SolrDocumentList solrDocumentList = response.getResults();
		System.out.println("共查询到记录：" + solrDocumentList.getNumFound());

	}



	/*solr7*/
	/*集群版测试*/
	@Test
	public void addCloud() throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-solr.xml");
		CloudSolrClient solrClient = context.getBean(CloudSolrClient.class);

		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");



		solrClient.commit();
		solrClient.close();
	}


}
