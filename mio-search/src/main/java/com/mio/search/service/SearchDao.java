package com.mio.search.service;

import com.mio.util.EUDataGridResults;
import org.apache.solr.client.solrj.SolrQuery;

import java.util.List;

public interface SearchDao {

	EUDataGridResults search(SolrQuery query) throws Exception;

	public void deleteAll() throws Exception;
	public void deleteById(String id) throws Exception;
	public void deleteByIds(List<String> ids) throws Exception;
}
