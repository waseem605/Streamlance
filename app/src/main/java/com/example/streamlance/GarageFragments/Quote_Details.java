package com.example.streamlance.GarageFragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.streamlance.MainPage.MainActivity;
import com.example.streamlance.R;

public class Quote_Details extends AppCompatActivity {


    private ImageView mBacklink;
    private TextView mCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_details);
        mBacklink =(ImageView)findViewById(R.id.back_arrow_Qdiag);
        mCancel =(TextView)findViewById(R.id.cancel_Text);


        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Quote_Details.this, MainActivity.class));
            }
        });

        mBacklink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Quote_Details.this, MainActivity.class));
            }
        });

    }
}