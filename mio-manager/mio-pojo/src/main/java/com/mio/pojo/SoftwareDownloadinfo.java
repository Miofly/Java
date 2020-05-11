package com.mio.pojo;

import java.io.Serializable;
import java.util.Date;

public class SoftwareDownloadinfo implements Serializable {
    private Integer softwareId;

    private String downloadUser;

    private Date downloadTime;

    private String downloadIp;

    private static final long serialVersionUID = 1L;

    public Integer getSoftwareId() {
        return softwareId;
    }

    public void setSoftwareId(Integer softwareId) {
        this.softwareId = softwareId;
    }

    public String getDownloadUser() {
        return downloadUser;
    }

    public void setDownloadUser(String downloadUser) {
        this.downloadUser = downloadUser == null ? null : downloadUser.trim();
    }

    public Date getDownloadTime() {
        return downloadTime;
    }

    public void setDownloadTime(Date downloadTime) {
        this.downloadTime = downloadTime;
    }

    public String getDownloadIp() {
        return downloadIp;
    }

    public void setDownloadIp(String downloadIp) {
        this.downloadIp = downloadIp == null ? null : downloadIp.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", softwareId=").append(softwareId);
        sb.append(", downloadUser=").append(downloadUser);
        sb.append(", downloadTime=").append(downloadTime);
        sb.append(", downloadIp=").append(downloadIp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}