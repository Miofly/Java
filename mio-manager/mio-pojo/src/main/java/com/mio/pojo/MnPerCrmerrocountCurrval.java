package com.mio.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MnPerCrmerrocountCurrval implements Serializable {
    private Long id;

    private Date dataTime;

    private String objectCode;

    private String objectName;

    private String kpiCode;

    private String kpiName;

    private String perValue;

    private String status;

    private BigDecimal alarmId;

    private Date createdTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public String getObjectCode() {
        return objectCode;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode == null ? null : objectCode.trim();
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    public String getKpiCode() {
        return kpiCode;
    }

    public void setKpiCode(String kpiCode) {
        this.kpiCode = kpiCode == null ? null : kpiCode.trim();
    }

    public String getKpiName() {
        return kpiName;
    }

    public void setKpiName(String kpiName) {
        this.kpiName = kpiName == null ? null : kpiName.trim();
    }

    public String getPerValue() {
        return perValue;
    }

    public void setPerValue(String perValue) {
        this.perValue = perValue == null ? null : perValue.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public BigDecimal getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(BigDecimal alarmId) {
        this.alarmId = alarmId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dataTime=").append(dataTime);
        sb.append(", objectCode=").append(objectCode);
        sb.append(", objectName=").append(objectName);
        sb.append(", kpiCode=").append(kpiCode);
        sb.append(", kpiName=").append(kpiName);
        sb.append(", perValue=").append(perValue);
        sb.append(", status=").append(status);
        sb.append(", alarmId=").append(alarmId);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}