package com.mio.pojo.vo;

import com.mio.pojo.DepartInfo;

import java.io.Serializable;

public class InfoCustom extends DepartInfo implements Serializable {

    private String area;
    private String cityName;
    private String city;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
