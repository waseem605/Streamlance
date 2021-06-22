package com.example.streamlance.MainPage;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.streamlance.Fragments.Profile;
import com.example.streamlance.R;

public class ChatActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.Back_color));
        setContentView(R.layout.activity_chat);
        linearLayout=(LinearLayout)findViewById(R.id.samplemessage);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChatActivity.this,ChatDetails.class);
                startActivity(intent);
            }
        });



    }
}