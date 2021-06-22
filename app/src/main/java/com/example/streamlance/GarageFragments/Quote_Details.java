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

import com.example.streamlance.MainPage.ChatDetails;
import com.example.streamlance.MainPage.MainActivity;
import com.example.streamlance.R;

public class Quote_Details extends AppCompatActivity {


    private ImageView mBacklink;
    private TextView mCancel;
    private LinearLayout mLinearSample;
    private Button mCompleteBtn,mMessageSend;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_quote_details);

        mBacklink =(ImageView)findViewById(R.id.back_arrow_Qdiag);
        mCancel =(TextView)findViewById(R.id.cancel_Text);
        mLinearSample =(LinearLayout)findViewById(R.id.samplecar);
        mLinearSample.setBackgroundDrawable(getResources().getDrawable(R.drawable.top_round));
        mCompleteBtn =(Button)findViewById(R.id.complete_quote_btn);
        mMessageSend =(Button)findViewById(R.id.viewquotesend);




        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Quote_Details.this, MainActivity.class));
            }
        });

        mMessageSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Quote_Details.this, ChatDetails.class));
            }
        });

        mCompleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Quote_Details.this,MainActivity.class);
                intent.putExtra("ide",2);
                startActivity(intent);
                finish();
            }
        });

        mBacklink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Quote_Details.this,MainActivity.class);
                intent.putExtra("ide",1);
                startActivity(intent);
                finish();
            }
        });

    }
}