package com.example.streamlance.Services;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.streamlance.Fragments.Garage;
import com.example.streamlance.MainPage.MainActivity;
import com.example.streamlance.R;

public class Choose_services extends AppCompatActivity {

    private ImageView mBack_arrow;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_choose_services);


        mBack_arrow = (ImageView)findViewById(R.id.back_arrow_Cs);


        mBack_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Choose_services.this, MainActivity.class));
            }
        });
    }

    public void callSubservience(View view) {
        startActivity(new Intent(Choose_services.this, SubcategoryServices.class));
    }
}