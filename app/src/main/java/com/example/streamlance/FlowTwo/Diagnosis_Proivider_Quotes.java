package com.example.streamlance.FlowTwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.streamlance.R;

public class Diagnosis_Proivider_Quotes extends AppCompatActivity {

    private Button mViewquotes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis_proivider_quotes);
        mViewquotes = (Button)findViewById(R.id.viewquotes);

        mViewquotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Diagnosis_Proivider_Quotes.this,DiagnosisQuote.class));
            }
        });
    }

    public void callSortdata(View view) {
    }
}