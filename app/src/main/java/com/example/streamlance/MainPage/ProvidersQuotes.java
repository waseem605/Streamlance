package com.example.streamlance.MainPage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.streamlance.FlowTwo.Diagnosis_Proivider_Quotes;
import com.example.streamlance.GarageFragments.Garage_Info;
import com.example.streamlance.R;
import com.example.streamlance.Services.BookNowSummary;
import com.example.streamlance.Services.RecivedQuote;
import com.example.streamlance.Services.Services_Summary;

public class ProvidersQuotes extends AppCompatActivity {
    Button mbtn, mSortBtn,mChatButton;
    LinearLayout map;

    private ImageView mPicture_pq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_providers_quotes);
        mSortBtn = (Button)findViewById(R.id.sort_button);
        mChatButton = (Button)findViewById(R.id.chat_btn);
        mPicture_pq = (ImageView)findViewById(R.id.picture_pq);
        map=(LinearLayout)findViewById(R.id.linearmap);

        callSortData();
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProvidersQuotes.this,Map_Activity.class);
                startActivity(intent);
            }
        });



        mChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProvidersQuotes.this, ChatActivity.class));
            }
        });


        mPicture_pq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProvidersQuotes.this,Garage_Info.class));
            }
        });

        mbtn=(Button)findViewById(R.id.viewquotes);
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProvidersQuotes.this, RecivedQuote.class);
                startActivity(intent);
            }
        });

    }

    public void callSortData() {
        mSortBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(ProvidersQuotes.this);
                dialog.setContentView(R.layout.dialog_sort);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                Button mok = (Button)dialog.findViewById(R.id.ok_button_dialog);
                dialog.show();

                mok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(ProvidersQuotes.this, BookNowSummary.class));
                    }
                });


            }
        });


    }
}