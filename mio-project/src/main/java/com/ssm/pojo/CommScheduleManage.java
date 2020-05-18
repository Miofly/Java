package com.ssm.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CommScheduleManage implements Serializable {
    private BigDecimal schId;

    private String schType;

    private String schSubscribe;

    private String schTitle;

    private String schDesc;

    private Date beginTime;

    private Date endTime;

    private Date createdTime;

    private String createdUserid;

    private String createdUsername;

    private String resField1;

    private String resField2;

    private String resField3;

    private String resField4;

    private String resField5;

    private String schSubtype;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSchId() {
        return schId;
    }

    public void setSchId(BigDecimal schId) {
        this.schId = schId;
    }

    public String getSchType() {
        return schType;
    }

    public void setSchType(String schType) {
        this.schType = schType == null ? null : schType.trim();
    }

    public String getSchSubscribe() {
        return schSubscribe;
    }

    public void setSchSubscribe(String schSubscribe) {
        this.schSubscribe = schSubscribe == null ? null : schSubscribe.trim();
    }

    public String getSchTitle() {
        return schTitle;
    }

    public void setSchTitle(String schTitle) {
        this.schTitle = schTitle == null ? null : schTitle.trim();
    }

    public String getSchDesc() {
        return schDesc;
    }

    public void setSchDesc(String schDesc) {
        this.schDesc = schDesc == null ? null : schDesc.trim();
    }
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getCreatedUserid() {
        return createdUserid;
    }

    public void setCreatedUserid(String createdUserid) {
        this.createdUserid = createdUserid == null ? null : createdUserid.trim();
    }

    public String getCreatedUsername() {
        return createdUsername;
    }

    public void setCreatedUsername(String createdUsername) {
        this.createdUsername = createdUsername == null ? null : createdUsername.trim();
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

    public String getSchSubtype() {
        return schSubtype;
    }

    public void setSchSubtype(String schSubtype) {
        this.schSubtype = schSubtype == null ? null : schSubtype.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schId=").append(schId);
        sb.append(", schType=").append(schType);
        sb.append(", schSubscribe=").append(schSubscribe);
        sb.append(", schTitle=").append(schTitle);
        sb.append(", schDesc=").append(schDesc);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", createdUserid=").append(createdUserid);
        sb.append(", createdUsername=").append(createdUsername);
        sb.append(", resField1=").append(resField1);
        sb.append(", resField2=").append(resField2);
        sb.append(", resField3=").append(resField3);
        sb.append(", resField4=").append(resField4);
        sb.append(", resField5=").append(resField5);
        sb.append(", schSubtype=").append(schSubtype);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}