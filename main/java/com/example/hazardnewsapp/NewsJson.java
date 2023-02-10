package com.example.hazardnewsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NewsJson extends AppCompatActivity {

    ListView lv;
    private String URL = "http://192.168.0.8/app/public/";
    MyAPI MyApi;
    private ArrayList<News>modelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_json);

        lv = (ListView) findViewById(R.id.lv);
        modelArrayList = new ArrayList<>();

        displayRetrofitData();
    }

    private void displayRetrofitData() {
        Retrofit retrofit = new Retrofit.Builder ()
                .baseUrl ( URL )
                .addConverterFactory ( GsonConverterFactory.create () )
                .build ();
        MyApi = retrofit.create ( MyAPI.class );
        Call<ArrayList<News>> arrayListCall = MyApi.callNewsJson ();
        arrayListCall.enqueue ( new Callback<ArrayList<News>>() {

            @Override
            public void onResponse(Call<ArrayList<News>> call, Response<ArrayList<News>> response) {
                modelArrayList = response.body ();
                for (int i=0; i<modelArrayList.size ();i++);
                //create adapter
                Custom custom = new Custom(modelArrayList,NewsJson.this,R.layout.singleview);
                lv.setAdapter ( custom );
            }

            @Override
            public void onFailure(Call<ArrayList<News>> call, Throwable t) {
                Toast.makeText ( NewsJson.this, "Failed to load data", Toast.LENGTH_SHORT ).show ();
            }
        } );
    }
}