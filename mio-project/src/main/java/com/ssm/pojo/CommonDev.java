package com.ssm.pojo;

import java.io.Serializable;
import java.util.Date;

public class CommonDev implements Serializable {
    private String devid;

    private String devname;

    private String devip;

    private String devmac;

    private String devtype;

    private Date devfoundtime;

    private String resField1;

    private String resField2;

    private String resField3;

    private String resField4;

    private String resField5;

    private static final long serialVersionUID = 1L;

    public String getDevid() {
        return devid;
    }

    public void setDevid(String devid) {
        this.devid = devid == null ? null : devid.trim();
    }

    public String getDevname() {
        return devname;
    }

    public void setDevname(String devname) {
        this.devname = devname == null ? null : devname.trim();
    }

    public String getDevip() {
        return devip;
    }

    public void setDevip(String devip) {
        this.devip = devip == null ? null : devip.trim();
    }

    public String getDevmac() {
        return devmac;
    }

    public void setDevmac(String devmac) {
        this.devmac = devmac == null ? null : devmac.trim();
    }

    public String getDevtype() {
        return devtype;
    }

    public void setDevtype(String devtype) {
        this.devtype = devtype == null ? null : devtype.trim();
    }

    public Date getDevfoundtime() {
        return devfoundtime;
    }

    public void setDevfoundtime(Date devfoundtime) {
        this.devfoundtime = devfoundtime;
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
        sb.append(", devid=").append(devid);
        sb.append(", devname=").append(devname);
        sb.append(", devip=").append(devip);
        sb.append(", devmac=").append(devmac);
        sb.append(", devtype=").append(devtype);
        sb.append(", devfoundtime=").append(devfoundtime);
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