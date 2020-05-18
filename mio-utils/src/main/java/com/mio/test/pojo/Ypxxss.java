package com.mio.test.pojo;
public class Ypxxss {
	private String bm;
	private String mc;
	private String price;

	public Ypxxss(String bm,String mc,String price){
		this.bm = bm;
		this.mc = mc;
		this.price = price;
	}
	public String getBm() {
		return bm;
	}
	public void setBm(String bm) {
		this.bm = bm;
	}
	public String getMc() {
		return mc;
	}
	public void setMc(String mc) {
		this.mc = mc;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Ypxx [bm=" + bm + ", mc=" + mc + ", price=" + price + "]";
	}


}
