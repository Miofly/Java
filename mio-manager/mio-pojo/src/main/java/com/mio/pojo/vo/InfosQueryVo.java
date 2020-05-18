package com.mio.pojo.vo;


import java.io.Serializable;

public class InfosQueryVo implements Serializable {

    private InfosCustom infosCustom;
    private String departNames;

    public InfosCustom getInfosCustom() {
        return infosCustom;
    }

    public void setInfosCustom(InfosCustom infosCustom) {
        this.infosCustom = infosCustom;
    }

    public String getDepartNames() {
        return departNames;
    }

    public void setDepartNames(String departNames) {
        this.departNames = departNames;
    }
}