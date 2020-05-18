package com.mio.pojo;

import java.io.Serializable;

public class LanInfo implements Serializable {
    private Integer lanId;

    private String lanCode;

    private String lanName;

    private String pinyin;

    private Integer orderMarks;

    private String x;

    private String y;

    private Short orderId;

    private String lanIdSd;

    private Short weight;

    private Short cityIdSd;

    private String bigArea;

    private static final long serialVersionUID = 1L;

    public Integer getLanId() {
        return lanId;
    }

    public void setLanId(Integer lanId) {
        this.lanId = lanId;
    }

    public String getLanCode() {
        return lanCode;
    }

    public void setLanCode(String lanCode) {
        this.lanCode = lanCode == null ? null : lanCode.trim();
    }

    public String getLanName() {
        return lanName;
    }

    public void setLanName(String lanName) {
        this.lanName = lanName == null ? null : lanName.trim();
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    public Integer getOrderMarks() {
        return orderMarks;
    }

    public void setOrderMarks(Integer orderMarks) {
        this.orderMarks = orderMarks;
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

    public Short getOrderId() {
        return orderId;
    }

    public void setOrderId(Short orderId) {
        this.orderId = orderId;
    }

    public String getLanIdSd() {
        return lanIdSd;
    }

    public void setLanIdSd(String lanIdSd) {
        this.lanIdSd = lanIdSd == null ? null : lanIdSd.trim();
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public Short getCityIdSd() {
        return cityIdSd;
    }

    public void setCityIdSd(Short cityIdSd) {
        this.cityIdSd = cityIdSd;
    }

    public String getBigArea() {
        return bigArea;
    }

    public void setBigArea(String bigArea) {
        this.bigArea = bigArea == null ? null : bigArea.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lanId=").append(lanId);
        sb.append(", lanCode=").append(lanCode);
        sb.append(", lanName=").append(lanName);
        sb.append(", pinyin=").append(pinyin);
        sb.append(", orderMarks=").append(orderMarks);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", orderId=").append(orderId);
        sb.append(", lanIdSd=").append(lanIdSd);
        sb.append(", weight=").append(weight);
        sb.append(", cityIdSd=").append(cityIdSd);
        sb.append(", bigArea=").append(bigArea);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}