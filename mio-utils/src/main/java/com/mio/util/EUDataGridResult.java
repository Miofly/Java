package com.mio.util;

import java.io.Serializable;
import java.util.List;

/**
 * JQuery MiniUI 分页处理
 */
public class EUDataGridResult implements Serializable {

	private long total;
	private List<?> data;


	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getData() {
		return data;
	}
	public void setData(List<?> data) {
		this.data = data;
	}
	
	
}
