package com.ssm.pojo;

import java.io.Serializable;

public class DictSchholiday implements Serializable {
    private String holidayDate;

    private String holidayName;

    private static final long serialVersionUID = 1L;

    public String getHolidayDate() {
        return holidayDate;
    }

    public void setHolidayDate(String holidayDate) {
        this.holidayDate = holidayDate == null ? null : holidayDate.trim();
    }

    public String getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName == null ? null : holidayName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", holidayDate=").append(holidayDate);
        sb.append(", holidayName=").append(holidayName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
