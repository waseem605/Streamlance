package com.example.streamlance.Services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.streamlance.R;

public class SubcategoryServices extends AppCompatActivity {

    private ImageView mBack_arrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subcategory_services);
        mBack_arrow = (ImageView)findViewById(R.id.back_arrow_Sbs);


        mBack_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SubcategoryServices.this,Choose_services.class));
            }
        });

    }

    //continue btn
    public void callToServicSummary(View view) {
        startActivity(new Intent(SubcategoryServices.this,Services_Summary.class));
    }
}