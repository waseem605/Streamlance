package com.example.streamlance.Services;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.streamlance.R;

public class Services_Summary extends AppCompatActivity {

    private Button mViewQuotaBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_summary);
    }

    //button click listener
    public void callQuotasubmited(View view) {

        Dialog dialog = new Dialog(Services_Summary.this);
        dialog.setContentView(R.layout.quata_submited_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));

        mViewQuotaBtn = (Button)findViewById(R.id.view_quota_btn);
        mViewQuotaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        dialog.show();

    }
}