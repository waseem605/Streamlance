package com.example.streamlance.GarageFragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.streamlance.R;
import com.example.streamlance.Services.Services_Summary;

public class Quote_DetailsCompleted extends AppCompatActivity {
Button requestbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_details_completed);
        requestbtn=(Button)findViewById(R.id.requestquote);
        requestbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Quote_DetailsCompleted.this,Services_Summary.class);
                startActivity(intent);
            }
        });
    }
}