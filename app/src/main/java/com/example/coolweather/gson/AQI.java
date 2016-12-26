package com.example.coolweather.gson;

/**AQI类
 * Created by Administrator on 2016/12/25.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }

}
