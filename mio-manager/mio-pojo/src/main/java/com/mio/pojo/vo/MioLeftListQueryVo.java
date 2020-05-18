package com.mio.pojo.vo;


import java.io.Serializable;

public class MioLeftListQueryVo implements Serializable {

    private MioLeftListCustom mioLeftListCustom;

    private String ids;

    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public MioLeftListCustom getMioLeftListCustom() {
        return mioLeftListCustom;
    }

    public void setMioLeftListCustom(MioLeftListCustom mioLeftListCustom) {
        this.mioLeftListCustom = mioLeftListCustom;
    }
}