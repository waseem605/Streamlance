package com.example.streamlance.MainPage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Build;
import android.os.Bundle;

import com.example.streamlance.R;

public class ChatActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        mToolbar=(Toolbar)findViewById(R.id.main_appbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Messages");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.back_color_drawable));
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}