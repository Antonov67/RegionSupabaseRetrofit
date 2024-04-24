package com.example.regionsupabaseretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface API {

    @GET("region24users")
    Call<List<User>> getUsers(@Header("apikey") String apikey, @Query("select") String select);
}
