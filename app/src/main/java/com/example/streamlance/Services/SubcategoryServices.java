package com.example.streamlance.Services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.streamlance.R;

public class SubcategoryServices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subcategory_services);
    }

    //continue btn
    public void callToServicSummary(View view) {
        startActivity(new Intent(SubcategoryServices.this,Services_Summary.class));
    }
}