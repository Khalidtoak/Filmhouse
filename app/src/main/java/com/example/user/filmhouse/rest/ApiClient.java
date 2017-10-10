package com.example.user.filmhouse.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by user on 10/8/2017.
 */

public class ApiClient {
    public static  final String BASE_URL = "http://api.themoviedb.org/3/";
    public static Retrofit retrofit = null;
    public static Retrofit getApiClient()
    {
        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }



}
