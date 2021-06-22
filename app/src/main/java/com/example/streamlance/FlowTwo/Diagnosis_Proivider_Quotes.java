package com.example.streamlance.FlowTwo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.streamlance.MainPage.ChatActivity;
import com.example.streamlance.MainPage.Map_Activity;
import com.example.streamlance.MainPage.ProvidersQuotes;
import com.example.streamlance.R;
import com.example.streamlance.Services.BookNowSummary;

public class Diagnosis_Proivider_Quotes extends AppCompatActivity {

    private Button mViewquotes,mSort,mChatButton;

    LinearLayout mMapLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis_proivider_quotes);
        mViewquotes = (Button)findViewById(R.id.viewquotes);
        mChatButton = (Button)findViewById(R.id.chat_btn);
        mSort = (Button)findViewById(R.id.sort_button);
        mMapLink = (LinearLayout)findViewById(R.id.map_link);


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