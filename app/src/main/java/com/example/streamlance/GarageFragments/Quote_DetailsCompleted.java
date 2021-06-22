package com.example.streamlance.GarageFragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.streamlance.MainPage.MainActivity;
import com.example.streamlance.R;
import com.example.streamlance.Services.Services_Summary;

public class Quote_DetailsCompleted extends AppCompatActivity {
Button requestbtn;

private ImageView mBacklink;
private TextView mCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_details_completed);
        requestbtn=(Button)findViewById(R.id.requestquote);
        mBacklink= (ImageView)findViewById(R.id.back_arrow_QdC);
        mCancel= (TextView)findViewById(R.id.cancel_QDC);



        mBacklink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Quote_DetailsCompleted.this, MainActivity.class);
                startActivity(intent);
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