package com.chong.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wenchong on 2017/12/24.
 */

public class County extends DataSupport {
    private int id;
    private int cityId;
    private String countryName;
    private String weatherId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
