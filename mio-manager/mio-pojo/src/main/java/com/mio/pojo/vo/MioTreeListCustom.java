package com.mio.pojo.vo;

import com.mio.pojo.MioTreeList;

import java.io.Serializable;

public class MioTreeListCustom extends MioTreeList implements Serializable {

    public String isParents;
    public String state;

    public String getIsParents() {
        return isParents;
    }

    public void setIsParents(String isParents) {
        this.isParents = isParents;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
