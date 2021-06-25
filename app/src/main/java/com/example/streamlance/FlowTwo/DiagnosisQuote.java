package com.example.streamlance.FlowTwo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.streamlance.Fragments.Completed;
import com.example.streamlance.MainPage.MainActivity;
import com.example.streamlance.R;
import com.example.streamlance.Services.Services_Summary;

public class DiagnosisQuote extends AppCompatActivity {

    private Button mRejectService,mAcceptservic,mViewHistory;
    TextView service,servicetype;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.white));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_diagnosis_quote);


        mRejectService = (Button)findViewById(R.id.rejectServices_btn);
        mAcceptservic = (Button)findViewById(R.id.accept_services);
        service=findViewById(R.id.service);
        service.setVisibility(View.INVISIBLE);
        servicetype=findViewById(R.id.servicetype);
        servicetype.setVisibility(View.INVISIBLE);

        mRejectService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(DiagnosisQuote.this);
                dialog.setContentView(R.layout.dialog_view_history);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                mViewHistory = (Button)dialog.findViewById(R.id.view_history_btn);
                dialog.show();

                mViewHistory.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(DiagnosisQuote.this, MainActivity.class));
                    }
                });
            }
        });

        mAcceptservic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Diagnosis_Review_Pay dialog_pay=new Diagnosis_Review_Pay();
                dialog_pay.show(getSupportFragmentManager(),dialog_pay.getTag());
            }
        });





    }
}