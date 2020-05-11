package com.mio.pojo.vo;

import java.io.Serializable;

public class SsythMap implements Serializable {


    private String bareaName;
    private String x;
    private String y;
    private String distSroce;
    private String cityName;
    private String oll;
    private String zl;
    private String time;
    private String alarmContent;

    public String getAlarmContent() {
        return alarmContent;
    }

    public void setAlarmContent(String alarmContent) {
        this.alarmContent = alarmContent;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    private String isNew;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBusicount() {
        return busicount;
    }

    public void setBusicount(String busicount) {
        this.busicount = busicount;
    }

    private String busicount;

    public String getOll() {
        return oll;
    }

    public void setOll(String oll) {
        this.oll = oll;
    }

    public String getZl() {
        return zl;
    }

    public void setZl(String zl) {
        this.zl = zl;
    }

    public String getOnlineper() {
        return onlineper;
    }

    public void setOnlineper(String onlineper) {
        this.onlineper = onlineper;
    }

    private String onlineper;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getBareaName() {
        return bareaName;
    }

    public void setBareaName(String bareaName) {
        this.bareaName = bareaName;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getDistSroce() {
        return distSroce;
    }

    public void setDistSroce(String distSroce) {
        this.distSroce = distSroce;
    }


}
