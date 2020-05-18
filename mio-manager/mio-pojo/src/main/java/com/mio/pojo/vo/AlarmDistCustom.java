package com.mio.pojo.vo;

import com.mio.pojo.AlarmDist;

import java.io.Serializable;

public class AlarmDistCustom extends AlarmDist implements Serializable {
    private String longitude;
    private String latitude;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
