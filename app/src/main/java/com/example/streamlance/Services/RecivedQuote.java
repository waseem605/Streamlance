package com.example.streamlance.Services;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.streamlance.FlowTwo.DiagnosisQuote;
import com.example.streamlance.FlowTwo.Diagnosis_Proivider_Quotes;
import com.example.streamlance.MainPage.MainActivity;
import com.example.streamlance.Payments.Payment_Method;
import com.example.streamlance.Payments.ReviewAndPay;
import com.example.streamlance.R;

public class RecivedQuote extends AppCompatActivity {
    Button btnrecieved,btnviewquote;
    TextView service,servicetype;
    LinearLayout llsamplecar;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.white));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_recived_quote);
        btnrecieved=findViewById(R.id.btnscheduleservice);
        llsamplecar=findViewById(R.id.samplecar);
        llsamplecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.rounded_white));
        service=findViewById(R.id.service);
        btnviewquote=findViewById(R.id.view_quota_btn);
        service.setVisibility(View.INVISIBLE);
        servicetype=findViewById(R.id.servicetype);
        servicetype.setVisibility(View.INVISIBLE);




        btnrecieved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(RecivedQuote.this);
                dialog.setContentView(R.layout.appointment_scheduled_dialog);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                Button mok = (Button)dialog.findViewById(R.id.view_quota_btn);
                dialog.show();

                mok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent =new Intent(RecivedQuote.this,MainActivity.class);
                        intent.putExtra("ide",1);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });
    /*    btnviewquote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecivedQuote.this,ReviewAndPay.class));
            }
        });*/
    }
}