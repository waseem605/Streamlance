package com.example.streamlance.common;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.streamlance.Login.VerifyOtp;
import com.example.streamlance.R;

public class OTP_Screen extends AppCompatActivity {
    private Button mGetOtpBtn;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.white));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_otp_screen);
        mGetOtpBtn = (Button)findViewById(R.id.get_otp_btn);

        mGetOtpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(OTP_Screen.this, VerifyOtp.class);
                startActivity(intent);
                finish();

            }
        });

    }
}