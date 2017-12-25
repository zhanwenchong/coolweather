package com.chong.coolweather.gson;

/**
 * Created by wenchong on 2017/12/25.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
