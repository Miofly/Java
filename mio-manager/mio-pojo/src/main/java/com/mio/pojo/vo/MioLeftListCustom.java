package com.mio.pojo.vo;


import com.mio.pojo.MioLeftList;

import java.io.Serializable;

public class MioLeftListCustom extends MioLeftList implements Serializable {

    private String isParent;
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIsParent() {
        return isParent;
    }

    public void setIsParent(String isParent) {
        this.isParent = isParent;
    }
}
