package com.ssm.pojo;

import java.io.Serializable;

public class SoftwareTab implements Serializable {
    private String tabCode;

    private String tabName;

    private Integer tabOrder;

    private String tabStatus;

    private String tabDesc;

    private static final long serialVersionUID = 1L;

    public String getTabCode() {
        return tabCode;
    }

    public void setTabCode(String tabCode) {
        this.tabCode = tabCode == null ? null : tabCode.trim();
    }

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName == null ? null : tabName.trim();
    }

    public Integer getTabOrder() {
        return tabOrder;
    }

    public void setTabOrder(Integer tabOrder) {
        this.tabOrder = tabOrder;
    }

    public String getTabStatus() {
        return tabStatus;
    }

    public void setTabStatus(String tabStatus) {
        this.tabStatus = tabStatus == null ? null : tabStatus.trim();
    }

    public String getTabDesc() {
        return tabDesc;
    }

    public void setTabDesc(String tabDesc) {
        this.tabDesc = tabDesc == null ? null : tabDesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tabCode=").append(tabCode);
        sb.append(", tabName=").append(tabName);
        sb.append(", tabOrder=").append(tabOrder);
        sb.append(", tabStatus=").append(tabStatus);
        sb.append(", tabDesc=").append(tabDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}