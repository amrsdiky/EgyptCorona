package com.example.egyptcorona;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("countries/Egypt")
    public Call<API> getapi();

    @GET("posts/1")
    public Call<Apitest> getapi2();

}

