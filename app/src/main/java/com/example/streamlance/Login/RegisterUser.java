package com.example.streamlance.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.streamlance.MainPage.MainActivity;
import com.example.streamlance.R;

public class RegisterUser extends AppCompatActivity {
    private Button mStartBtn,mSkipBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        mStartBtn=(Button)findViewById(R.id.lets_start_btn);
        mSkipBtn=(Button)findViewById(R.id.button_skip);


        mStartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterUser.this, MainActivity.class));
                finish();
            }
        });

        mSkipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterUser.this,MainActivity.class));
            }
        });
    }
}