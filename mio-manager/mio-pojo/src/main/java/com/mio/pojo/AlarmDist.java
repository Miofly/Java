package com.mio.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class AlarmDist implements Serializable {
    private String distType;

    private String distName;

    private BigDecimal distSroce;

    private Integer distCount;

    private String inTime;

    private String inId;

    private String inIdSd;

    private static final long serialVersionUID = 1L;

    public String getDistType() {
        return distType;
    }

    public void setDistType(String distType) {
        this.distType = distType == null ? null : distType.trim();
    }

    public String getDistName() {
        return distName;
    }

    public void setDistName(String distName) {
        this.distName = distName == null ? null : distName.trim();
    }

    public BigDecimal getDistSroce() {
        return distSroce;
    }

    public void setDistSroce(BigDecimal distSroce) {
        this.distSroce = distSroce;
    }

    public Integer getDistCount() {
        return distCount;
    }

    public void setDistCount(Integer distCount) {
        this.distCount = distCount;
    }

    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime == null ? null : inTime.trim();
    }

    public String getInId() {
        return inId;
    }

    public void setInId(String inId) {
        this.inId = inId == null ? null : inId.trim();
    }

    public String getInIdSd() {
        return inIdSd;
    }

    public void setInIdSd(String inIdSd) {
        this.inIdSd = inIdSd == null ? null : inIdSd.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", distType=").append(distType);
        sb.append(", distName=").append(distName);
        sb.append(", distSroce=").append(distSroce);
        sb.append(", distCount=").append(distCount);
        sb.append(", inTime=").append(inTime);
        sb.append(", inId=").append(inId);
        sb.append(", inIdSd=").append(inIdSd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}