package com.example.streamlance.Services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.streamlance.R;

public class Choose_services extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_services);
    }

    public void callSubservience(View view) {
        startActivity(new Intent(Choose_services.this,SubcategoryServices.class));
    }
}