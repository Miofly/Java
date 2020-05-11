package com.mio.global;

import java.io.Serializable;

/**
 * describe: 统一返回类
 * @author wfd
 * @date 2019/05/14
 */
public class CommonResultInfo implements Serializable {


    public static final String STATUS_SUCCESS = "success"; // 成功
    public static final String STATUS_FAIL = "fail"; // 失败
    public static final String STATUS_INFO = "info"; // 提醒

    private String status; // 返回提示
    private Object data; // 返回数据
    private String message; // 提示信息
    private Integer messageCode; // 提示代码（自定义）

    public CommonResultInfo() {
    }

    public CommonResultInfo(String status, Object data, String message, Integer messageCode) {
        this.status = status;
        this.data = data;
        this.message = message;
        this.messageCode = messageCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(Integer messageCode) {
        this.messageCode = messageCode;
    }

    @Override
    public String toString() {
        return "CommonResultInfo{" +
                "status='" + status + '\'' +
                ", data=" + data +
                ", message='" + message + '\'' +
                ", messageCode=" + messageCode +
                '}';
    }

}
