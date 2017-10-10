package com.example.user.filmhouse.rest;

import com.example.user.filmhouse.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by user on 10/8/2017.
 */

public interface ApiInterface {
    @GET("movie/top_rated")
    Call<MovieResponse>getTopRatedMovies(@Query("api_key") String apiKey);
    @GET("movie/{id}")
    Call<MovieResponse>getMoviesdetails(@Path("id") int id, @Query("api_key") String apiKey);
}
