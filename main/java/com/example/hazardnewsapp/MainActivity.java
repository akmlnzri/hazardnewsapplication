package com.example.hazardnewsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnNews, btnMaps, btnAbout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNews = (Button) findViewById(R.id.btnNews);
        btnMaps = (Button) findViewById(R.id.btnMaps);
        btnAbout = (Button) findViewById(R.id.btnAbout);

        btnNews.setOnClickListener(this);
        btnMaps.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnMaps:
                Intent intent1 = new Intent();
                intent1.setClass(getApplicationContext(), MapsActivity.class);
                startActivity(intent1);
                break;
            case R.id.btnNews:
                Intent intent2 = new Intent();
                intent2.setClass(getApplicationContext(), NewsJson.class);
                startActivity(intent2);
                break;

            case R.id.btnAbout:
                Intent intent3 = new Intent();
                intent3.setClass(getApplicationContext(), AboutActivity.class);
                startActivity(intent3);
                break;

        }
    }



}