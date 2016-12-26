package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**Basic类
 * Created by Administrator on 2016/12/25.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}
