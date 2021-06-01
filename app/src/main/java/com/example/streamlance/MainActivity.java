package com.example.streamlance;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Intent intent;
    private final static int SPLASH_TIME = 3000;

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               intent=new Intent(MainActivity.this,Onboarding.class);
               startActivity(intent);
               finish();
           }
       },SPLASH_TIME);
    }
}