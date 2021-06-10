package com.example.streamlance.MainPage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.streamlance.GarageFragments.Garage_Info;
import com.example.streamlance.R;

public class ProvidersQuotes extends AppCompatActivity {
    Button mbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_providers_quotes);
        mbtn=(Button)findViewById(R.id.viewquotes);
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProvidersQuotes.this, Garage_Info.class);
                startActivity(intent);
            }
        });

    }
}