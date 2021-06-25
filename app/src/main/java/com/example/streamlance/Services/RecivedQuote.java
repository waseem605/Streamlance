package com.example.streamlance.Services;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.streamlance.Payments.Payment_Method;
import com.example.streamlance.Payments.ReviewAndPay;
import com.example.streamlance.R;

public class RecivedQuote extends AppCompatActivity {
    Button btnrecieved;
    TextView service,servicetype;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.white));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_recived_quote);
        btnrecieved=findViewById(R.id.btnscheduleservice);
        service=findViewById(R.id.service);
        service.setVisibility(View.INVISIBLE);
        servicetype=findViewById(R.id.servicetype);
        servicetype.setVisibility(View.INVISIBLE);




        btnrecieved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RecivedQuote.this, ReviewAndPay.class);
                startActivity(intent);
            }
        });
    }
}