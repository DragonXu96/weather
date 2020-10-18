package com.dragonxu.weather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")
    public String cityname;
    @SerializedName("id")
    public String weatherId;
    @SerializedName("update")
    public Update mUpdate;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }


}
