package com.dragonxu.weather.gson;

import com.google.gson.annotations.SerializedName;

public class AQI {
    @SerializedName("city")
    public AQICity mCity;
    public class AQICity {
        @SerializedName("aqi")
        public String api;
        @SerializedName("pm25")
        public String pm25;
    }
}
