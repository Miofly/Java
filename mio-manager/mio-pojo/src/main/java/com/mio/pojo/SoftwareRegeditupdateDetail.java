package com.mio.pojo;

import java.io.Serializable;

public class SoftwareRegeditupdateDetail implements Serializable {
    private Integer stepId;

    private Integer detailId;

    private String detailName;

    private String vAction;

    private String vPath;

    private String vKey;

    private String vKeytype;

    private String vValue;

    private static final long serialVersionUID = 1L;

    public Integer getStepId() {
        return stepId;
    }

    public void setStepId(Integer stepId) {
        this.stepId = stepId;
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName == null ? null : detailName.trim();
    }

    public String getvAction() {
        return vAction;
    }

    public void setvAction(String vAction) {
        this.vAction = vAction == null ? null : vAction.trim();
    }

    public String getvPath() {
        return vPath;
    }

    public void setvPath(String vPath) {
        this.vPath = vPath == null ? null : vPath.trim();
    }

    public String getvKey() {
        return vKey;
    }

    public void setvKey(String vKey) {
        this.vKey = vKey == null ? null : vKey.trim();
    }

    public String getvKeytype() {
        return vKeytype;
    }

    public void setvKeytype(String vKeytype) {
        this.vKeytype = vKeytype == null ? null : vKeytype.trim();
    }

    public String getvValue() {
        return vValue;
    }

    public void setvValue(String vValue) {
        this.vValue = vValue == null ? null : vValue.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stepId=").append(stepId);
        sb.append(", detailId=").append(detailId);
        sb.append(", detailName=").append(detailName);
        sb.append(", vAction=").append(vAction);
        sb.append(", vPath=").append(vPath);
        sb.append(", vKey=").append(vKey);
        sb.append(", vKeytype=").append(vKeytype);
        sb.append(", vValue=").append(vValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}