package com.ssm.pojo.vo;

import java.io.Serializable;

public class TreeSelect implements Serializable {
    /*名称*/
    private String label;

    /*子节点ID*/
    private String id;

    private String[] children;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getChildren() {
        return children;
    }

    public void setChildren(String[] children) {
        this.children = children;
    }
}
