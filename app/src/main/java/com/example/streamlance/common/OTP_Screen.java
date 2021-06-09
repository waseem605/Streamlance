package com.example.streamlance.common;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.streamlance.Login.VerifyOtp;
import com.example.streamlance.R;

public class OTP_Screen extends AppCompatActivity {
    private Button mGetOtpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_screen);
        mGetOtpBtn = (Button)findViewById(R.id.get_otp_btn);

        mGetOtpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OTP_Screen.this, VerifyOtp.class));
                finish();
            }
        });

    }
}