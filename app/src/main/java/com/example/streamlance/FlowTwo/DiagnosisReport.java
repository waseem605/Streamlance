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
import android.widget.ImageView;

import com.example.streamlance.R;
import com.example.streamlance.Services.Services_Summary;

public class DiagnosisReport extends AppCompatActivity {

    private Button mConfirmBtn,mViewDiagonosBtn;
    Dialog request_dialog;
    private ImageView mCross;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.white));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
                setContentView(R.layout.activity_diagnosis_report);

        mConfirmBtn = (Button)findViewById(R.id.confirm_request_diagonos);
        mCross = (ImageView) findViewById(R.id.cross_icon);


        mCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DiagnosisReport.this,Diagonosis.class));
            }
        });



        mConfirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(DiagnosisReport.this);
                dialog.setContentView(R.layout.request_submitted_dialog);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                mViewDiagonosBtn = (Button)dialog.findViewById(R.id.view_diagonos_quota_btn);
                dialog.show();

                mViewDiagonosBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(DiagnosisReport.this,Diagnosis_Proivider_Quotes.class));
                    }
                });
            }
        });
    }
}