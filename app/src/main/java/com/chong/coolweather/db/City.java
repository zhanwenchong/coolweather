package com.chong.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wenchong on 2017/12/24.
 */

public class City extends DataSupport {
    private int id;
    private int cityCode;
    private int provinceId;
    private String cityName;

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
