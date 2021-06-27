package com.example.streamlance.FlowTwo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.streamlance.MainPage.ChatActivity;
import com.example.streamlance.MainPage.MainActivity;
import com.example.streamlance.MainPage.Map_Activity;
import com.example.streamlance.MainPage.ProvidersQuotes;
import com.example.streamlance.R;
import com.example.streamlance.Services.BookNowSummary;
import com.example.streamlance.common.Filter_Activity;

public class Diagnosis_Proivider_Quotes extends AppCompatActivity {

    private Button mViewquotes,mChatButton;
    private RelativeLayout mSort,mMapLink,mFilterLink;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.white));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_diagnosis_proivider_quotes);

        mViewquotes = (Button)findViewById(R.id.viewquotes);
        mChatButton = (Button)findViewById(R.id.chat_btn);

        mSort = (RelativeLayout)findViewById(R.id.sort_button);
        mFilterLink = (RelativeLayout)findViewById(R.id.filter_link);
        mMapLink = (RelativeLayout) findViewById(R.id.map_link);


        callIntents();




    }

    public void callIntents()
    {

        mViewquotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Diagnosis_Proivider_Quotes.this,DiagnosisQuote.class));
            }
        });

        mMapLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Diagnosis_Proivider_Quotes.this, Map_Activity.class));
            }
        });

        mChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Diagnosis_Proivider_Quotes.this, ChatActivity.class));
            }
        });


        mFilterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Diagnosis_Proivider_Quotes.this, Filter_Activity.class));
            }
        });


        // dialog
        mSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(Diagnosis_Proivider_Quotes.this);
                dialog.setContentView(R.layout.dialog_sort);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                Button mok = (Button)dialog.findViewById(R.id.ok_button_dialog);
                dialog.show();

                mok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

            }
        });

    }
}