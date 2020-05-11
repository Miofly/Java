package com.ssm.pojo.vo;


import com.ssm.pojo.CommScheduleManage;

import java.io.Serializable;

public class CommScheduleManageVo extends CommScheduleManage implements Serializable {
    public String getSchTypename() {
        return schTypename;
    }

    public void setSchTypename(String schTypename) {
        this.schTypename = schTypename;
    }

    private String schTypename;


    public String getTimeStr() {
        return timeStr;
    }

    public void setTimeStr(String timeStr) {
        this.timeStr = timeStr;
    }

    private String timeStr;


}
