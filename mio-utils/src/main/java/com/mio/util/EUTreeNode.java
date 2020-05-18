package com.mio.util;

import java.io.Serializable;

/*
 * 懒加载 Jquery MINIUI
 */
public class EUTreeNode implements Serializable {

	/*子节点ID*/
	private Long id;
	/*名称*/
	private String text;
	/*父节点ID*/
	private String isLeaf;
	/*是否展开*/
	private String expanded;
	/*其他属性*/
	private String attributes;

	public String getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
	}

	public String getExpanded() {
		return expanded;
	}

	public void setExpanded(String expanded) {
		this.expanded = expanded;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
}
