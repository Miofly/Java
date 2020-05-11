package com.mio.pojo.vo;


import java.io.Serializable;

public class InfoQueryVo implements Serializable {

    private InfoCustom infoCustom;
    private String departName;

    public InfoCustom getInfoCustom() {
        return infoCustom;
    }

    public void setInfoCustom(InfoCustom infoCustom) {
        this.infoCustom = infoCustom;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }
}