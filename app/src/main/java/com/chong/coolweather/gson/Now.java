package com.chong.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wenchong on 2017/12/25.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
