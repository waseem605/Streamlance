package com.example.streamlance.Payments;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.streamlance.MainPage.MainActivity;
import com.example.streamlance.R;

public class ReviewAndPay extends AppCompatActivity {
LinearLayout linearLayoutReviewAndPay,llsamplecar;
TextView service,servicetype;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.white));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_review_and_pay);
        llsamplecar=findViewById(R.id.samplecar);
        llsamplecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.rounded_white));
        service=findViewById(R.id.service);
        service.setVisibility(View.INVISIBLE);
        servicetype=findViewById(R.id.servicetype);
        servicetype.setVisibility(View.INVISIBLE);
        linearLayoutReviewAndPay=findViewById(R.id.linearreviewandpay);
        linearLayoutReviewAndPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ReviewAndPay.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}