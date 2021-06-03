package com.example.streamlance.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.streamlance.R;

public class VerifyOtp extends AppCompatActivity {

    private Button mVerifyOtpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_otp);
        mVerifyOtpBtn = (Button)findViewById(R.id.verify_number_btn);


        mVerifyOtpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VerifyOtp.this,Password.class));
            }
        });

    }
}