package com.mio.pojo;

import java.io.Serializable;

public class AreaInfo implements Serializable {
    private Long areaId;

    private String areaCode;

    private String areaName;

    private Long ptAreaId;

    private Integer lanId;

    private String x;

    private String y;

    private String bareaName;

    private String sdAreaId;

    private Short weight;

    private static final long serialVersionUID = 1L;

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Long getPtAreaId() {
        return ptAreaId;
    }

    public void setPtAreaId(Long ptAreaId) {
        this.ptAreaId = ptAreaId;
    }

    public Integer getLanId() {
        return lanId;
    }

    public void setLanId(Integer lanId) {
        this.lanId = lanId;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x == null ? null : x.trim();
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y == null ? null : y.trim();
    }

    public String getBareaName() {
        return bareaName;
    }

    public void setBareaName(String bareaName) {
        this.bareaName = bareaName == null ? null : bareaName.trim();
    }

    public String getSdAreaId() {
        return sdAreaId;
    }

    public void setSdAreaId(String sdAreaId) {
        this.sdAreaId = sdAreaId == null ? null : sdAreaId.trim();
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", areaId=").append(areaId);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", areaName=").append(areaName);
        sb.append(", ptAreaId=").append(ptAreaId);
        sb.append(", lanId=").append(lanId);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", bareaName=").append(bareaName);
        sb.append(", sdAreaId=").append(sdAreaId);
        sb.append(", weight=").append(weight);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}