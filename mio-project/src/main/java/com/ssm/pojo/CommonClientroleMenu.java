package com.ssm.pojo;

import java.io.Serializable;

public class CommonClientroleMenu extends CommonClientroleMenuKey implements Serializable {
    private Integer status;

    private String resField1;

    private String resField2;

    private String resField3;

    private String resField4;

    private String resField5;

    private static final long serialVersionUID = 1L;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getResField4() {
        return resField4;
    }

    public void setResField4(String resField4) {
        this.resField4 = resField4 == null ? null : resField4.trim();
    }

    public String getResField5() {
        return resField5;
    }

    public void setResField5(String resField5) {
        this.resField5 = resField5 == null ? null : resField5.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", status=").append(status);
        sb.append(", resField1=").append(resField1);
        sb.append(", resField2=").append(resField2);
        sb.append(", resField3=").append(resField3);
        sb.append(", resField4=").append(resField4);
        sb.append(", resField5=").append(resField5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}