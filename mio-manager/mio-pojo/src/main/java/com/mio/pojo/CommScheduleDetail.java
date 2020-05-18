package com.mio.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CommScheduleDetail implements Serializable {
    private BigDecimal schId;

    private String detailId;

    private String detailType;

    private String detailContent;

    private String detailDesc;

    private Date beginTime;

    private Date endTime;

    private Date createdTime;

    private String createdUserid;

    private String createdUsername;

    private String detailResp;

    private String detailRespname;

    private String detailState;

    private Date updateTime;

    private String resField1;

    private String resField2;

    private String resField3;

    private String resField4;

    private String resField5;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSchId() {
        return schId;
    }

    public void setSchId(BigDecimal schId) {
        this.schId = schId;
    }

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId == null ? null : detailId.trim();
    }

    public String getDetailType() {
        return detailType;
    }

    public void setDetailType(String detailType) {
        this.detailType = detailType == null ? null : detailType.trim();
    }

    public String getDetailContent() {
        return detailContent;
    }

    public void setDetailContent(String detailContent) {
        this.detailContent = detailContent == null ? null : detailContent.trim();
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc == null ? null : detailDesc.trim();
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

    public String getDetailResp() {
        return detailResp;
    }

    public void setDetailResp(String detailResp) {
        this.detailResp = detailResp == null ? null : detailResp.trim();
    }

    public String getDetailRespname() {
        return detailRespname;
    }

    public void setDetailRespname(String detailRespname) {
        this.detailRespname = detailRespname == null ? null : detailRespname.trim();
    }

    public String getDetailState() {
        return detailState;
    }

    public void setDetailState(String detailState) {
        this.detailState = detailState == null ? null : detailState.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        sb.append(", schId=").append(schId);
        sb.append(", detailId=").append(detailId);
        sb.append(", detailType=").append(detailType);
        sb.append(", detailContent=").append(detailContent);
        sb.append(", detailDesc=").append(detailDesc);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", createdUserid=").append(createdUserid);
        sb.append(", createdUsername=").append(createdUsername);
        sb.append(", detailResp=").append(detailResp);
        sb.append(", detailRespname=").append(detailRespname);
        sb.append(", detailState=").append(detailState);
        sb.append(", updateTime=").append(updateTime);
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