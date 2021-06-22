package com.example.streamlance.Services;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.streamlance.R;

public class SubcategoryServices extends AppCompatActivity {

    private ImageView mBack_arrow;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
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