package com.mio.pojo;

import java.io.Serializable;
import java.util.Date;

public class DepartInfo implements Serializable {
    private String departId;

    private String areaId;

    private String departName;

    private String chnlType;

    private String departType;

    private String longitude;

    private String latitude;

    private Short weight;

    private Date updateTime;

    private String preAreaId;

    private String chnlId;

    private String status;

    private String toBomc;

    private String address;

    private String responsible;

    private String respMobile;

    private static final long serialVersionUID = 1L;

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId == null ? null : departId.trim();
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }

    public String getChnlType() {
        return chnlType;
    }

    public void setChnlType(String chnlType) {
        this.chnlType = chnlType == null ? null : chnlType.trim();
    }

    public String getDepartType() {
        return departType;
    }

    public void setDepartType(String departType) {
        this.departType = departType == null ? null : departType.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getPreAreaId() {
        return preAreaId;
    }

    public void setPreAreaId(String preAreaId) {
        this.preAreaId = preAreaId == null ? null : preAreaId.trim();
    }

    public String getChnlId() {
        return chnlId;
    }

    public void setChnlId(String chnlId) {
        this.chnlId = chnlId == null ? null : chnlId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getToBomc() {
        return toBomc;
    }

    public void setToBomc(String toBomc) {
        this.toBomc = toBomc == null ? null : toBomc.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible == null ? null : responsible.trim();
    }

    public String getRespMobile() {
        return respMobile;
    }

    public void setRespMobile(String respMobile) {
        this.respMobile = respMobile == null ? null : respMobile.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", departId=").append(departId);
        sb.append(", areaId=").append(areaId);
        sb.append(", departName=").append(departName);
        sb.append(", chnlType=").append(chnlType);
        sb.append(", departType=").append(departType);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", weight=").append(weight);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", preAreaId=").append(preAreaId);
        sb.append(", chnlId=").append(chnlId);
        sb.append(", status=").append(status);
        sb.append(", toBomc=").append(toBomc);
        sb.append(", address=").append(address);
        sb.append(", responsible=").append(responsible);
        sb.append(", respMobile=").append(respMobile);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}