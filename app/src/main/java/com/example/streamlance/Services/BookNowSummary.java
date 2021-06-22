package com.example.streamlance.Services;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.streamlance.MainPage.MainActivity;
import com.example.streamlance.MainPage.ProvidersQuotes;
import com.example.streamlance.R;

public class BookNowSummary extends AppCompatActivity {

    private Button mScheduleBtn;
    private ImageView mBackArrow;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_book_now_summary);

        mScheduleBtn = (Button)findViewById(R.id.requestquote);
        mBackArrow =(ImageView)findViewById(R.id.back_arrow_QS);


        mScheduleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BookNowSummary.this, MainActivity.class));
            }
        });

        mBackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BookNowSummary.this, ProvidersQuotes.class));
            }
        });


    }
}