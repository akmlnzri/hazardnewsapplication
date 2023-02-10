package com.example.hazardnewsapp;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

interface MyAPI {
    @GET("news.json")
    Call<ArrayList<News>> callNewsJson();
}
