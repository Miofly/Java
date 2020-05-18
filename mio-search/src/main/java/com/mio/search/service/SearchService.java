package com.mio.search.service;


import com.mio.util.EUDataGridResults;

public interface SearchService {
	EUDataGridResults search(String queryString, int pageIndex, int pageSize) throws Exception;
}
