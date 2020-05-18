package com.ssm.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ssm.pojo.CommonDev;
import com.ssm.pojo.CommonUserDev;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * describe:
 *
 * @author wfd
 * @date 2019/05/14
 */
public class CommonUserDevCustomVo extends CommonDev implements Serializable {
    private String devId;
    private Date bindingTime;

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getBindingTime() {
        return bindingTime;
    }

    public void setBindingTime(Date bindingTime) {
        this.bindingTime = bindingTime;
    }
}
