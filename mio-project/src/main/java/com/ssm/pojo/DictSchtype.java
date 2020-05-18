package com.ssm.pojo;

import java.io.Serializable;

public class DictSchtype implements Serializable {
    private String schType;

    private String schTypename;

    private String schColor;

    private String resField1;

    private String resField2;

    private String resField3;

    private static final long serialVersionUID = 1L;

    public String getSchType() {
        return schType;
    }

    public void setSchType(String schType) {
        this.schType = schType == null ? null : schType.trim();
    }

    public String getSchTypename() {
        return schTypename;
    }

    public void setSchTypename(String schTypename) {
        this.schTypename = schTypename == null ? null : schTypename.trim();
    }

    public String getSchColor() {
        return schColor;
    }

    public void setSchColor(String schColor) {
        this.schColor = schColor == null ? null : schColor.trim();
    }

    public String getResField1() {
        return resField1;
    }

    public void setResField1(String resField1) {
        this.resField1 = resField1 == null ? null : resField1.trim();
    }

    public String getResField2() {
        return resField2;
    }

    public void setResField2(String resField2) {
        this.resField2 = resField2 == null ? null : resField2.trim();
    }

    public String getResField3() {
        return resField3;
    }

    public void setResField3(String resField3) {
        this.resField3 = resField3 == null ? null : resField3.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schType=").append(schType);
        sb.append(", schTypename=").append(schTypename);
        sb.append(", schColor=").append(schColor);
        sb.append(", resField1=").append(resField1);
        sb.append(", resField2=").append(resField2);
        sb.append(", resField3=").append(resField3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}