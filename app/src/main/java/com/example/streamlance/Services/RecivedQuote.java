package com.example.streamlance.Services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.streamlance.Payments.Payment_Method;
import com.example.streamlance.Payments.ReviewAndPay;
import com.example.streamlance.R;

public class RecivedQuote extends AppCompatActivity {
    Button btnrecieved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recived_quote);
        btnrecieved=findViewById(R.id.btnscheduleservice);




        btnrecieved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RecivedQuote.this, ReviewAndPay.class);
                startActivity(intent);
            }
        });
    }
}