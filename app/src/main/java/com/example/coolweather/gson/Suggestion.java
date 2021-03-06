package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**Suggestion类
 * Created by Administrator on 2016/12/25.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }


    public class CarWash {
        @SerializedName("txt")
        public String info;
    }


    public class Sport {
        @SerializedName("txt")
        public String info;
    }

}
