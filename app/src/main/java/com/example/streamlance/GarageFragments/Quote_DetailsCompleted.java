package com.example.streamlance.GarageFragments;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.streamlance.MainPage.MainActivity;
import com.example.streamlance.R;
import com.example.streamlance.Services.Services_Summary;

public class Quote_DetailsCompleted extends AppCompatActivity {
Button requestbtn;

private LinearLayout mLinearSample;
private ImageView mBacklink;
private TextView mCancel;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_quote_details_completed);
        requestbtn=(Button)findViewById(R.id.requestquote);
        mBacklink= (ImageView)findViewById(R.id.back_arrow_QdC);
        mCancel= (TextView)findViewById(R.id.cancel_QDC);
        mLinearSample =(LinearLayout)findViewById(R.id.samplecar);
        mLinearSample.setBackgroundDrawable(getResources().getDrawable(R.drawable.top_round));


        mBacklink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Quote_DetailsCompleted.this,MainActivity.class);
                intent.putExtra("ide",2);
                startActivity(intent);
                finish();

            }
        });


        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Quote_DetailsCompleted.this,MainActivity.class);
                startActivity(intent);
            }
        });

        requestbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Quote_DetailsCompleted.this,Services_Summary.class);
                startActivity(intent);
            }
        });
    }
}