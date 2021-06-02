package com.example.streamlance;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_Screen extends AppCompatActivity {
    private Intent intent;
    private final static int SPLASH_TIME = 3000;

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

       new Handler().postDelayed(() -> {
           intent=new Intent(Splash_Screen.this,Onboarding.class);
           startActivity(intent);
           finish();
       },SPLASH_TIME);
    }
}