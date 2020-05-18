package com.ssm.pojo.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class CommScheduleDetailVo implements Serializable {
    private BigDecimal id;
    private String sch_type;
    private String title;
    private String start;
    private String end;
    private String backgroundColor;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getSch_type() {
        return sch_type;
    }

    public void setSch_type(String sch_type) {
        this.sch_type = sch_type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}