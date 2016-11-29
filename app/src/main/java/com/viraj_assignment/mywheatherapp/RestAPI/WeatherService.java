package com.viraj_assignment.mywheatherapp.RestAPI;

import com.google.gson.JsonObject;
import com.viraj_assignment.mywheatherapp.Model.WeatherData;

import org.json.JSONObject;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * Created by viraj.jage on 27-11-2016.
 */
public interface WeatherService {

    @GET("forecast")
    Call<WeatherData> getCurrentWeather(@Query("q") String city,
                                        @Query("mode") String mode,
                                        @Query("appid") String apikey);
}
