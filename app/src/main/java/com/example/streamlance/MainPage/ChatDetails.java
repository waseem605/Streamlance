package com.example.streamlance.MainPage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.streamlance.GarageFragments.Quote_Details;
import com.example.streamlance.R;

public class ChatDetails extends AppCompatActivity {

    ImageView mBack_arrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_details);
        mBack_arrow = (ImageView)findViewById(R.id.back_arrow_Cd);



        mBack_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChatDetails.this, Quote_Details.class));
            }
        });
    }
}