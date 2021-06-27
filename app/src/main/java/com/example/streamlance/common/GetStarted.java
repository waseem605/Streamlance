package com.example.streamlance.common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.streamlance.MainPage.MainActivity;
import com.example.streamlance.R;

public class GetStarted extends AppCompatActivity {

    private Button mGetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.Back_color));
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        mGetButton = (Button)findViewById(R.id.get_start_btn);

        mGetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GetStarted.this, OTP_Screen.class));
                finish();
            }
        });


    }
}