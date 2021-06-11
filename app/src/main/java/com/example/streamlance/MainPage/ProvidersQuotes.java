package com.example.streamlance.MainPage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.streamlance.GarageFragments.Garage_Info;
import com.example.streamlance.R;
import com.example.streamlance.Services.Services_Summary;

public class ProvidersQuotes extends AppCompatActivity {
    Button mbtn, mSortBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_providers_quotes);
        mSortBtn = (Button)findViewById(R.id.sort_button);

        mbtn=(Button)findViewById(R.id.viewquotes);
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProvidersQuotes.this, Garage_Info.class);
                startActivity(intent);
            }
        });

    }

    public void callSortdata(View view) {

        Dialog dialog = new Dialog(ProvidersQuotes.this);
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
}