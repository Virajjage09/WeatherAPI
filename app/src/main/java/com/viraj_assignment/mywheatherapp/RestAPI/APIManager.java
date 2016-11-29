package com.viraj_assignment.mywheatherapp.RestAPI;


import com.viraj_assignment.mywheatherapp.Model.WeatherData;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by viraj.jage on 26-11-2016.
 */

public class APIManager {

    private static Weatherervice weatherervice;
    private static final String URL = "http://api.openweathermap.org/data/2.5";


    public interface Weatherervice {

        /*@GET("/forecast")
        void getWeatherInfo (@Query("q") String city,
                             @Query("appid") String appid,
                             Callback<WeatherData> cb);*/
        @GET("/forecast")
        Call<WeatherData> getCurrentWeather(@Query("q") String city,
                                            @Query("appid") String apikey);
    }

   /* public static Weatherervice getApiService () {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .build();

        weatherervice = retrofit.create(Weatherervice.class);

        return weatherervice;

    }*/

}