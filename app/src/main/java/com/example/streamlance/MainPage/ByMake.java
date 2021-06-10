package com.example.streamlance.MainPage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.streamlance.Fragments.mygarage;
import com.example.streamlance.R;

import java.util.ArrayList;
import java.util.Arrays;

public class ByMake extends AppCompatActivity {

    private Spinner mNameSpinner,mYearSpinner,mModelSpinner,mTrimSpinner;
    Button mbtn,mbtnadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_by_make);
        mbtn=(Button)findViewById(R.id.bymake_vehicle);
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ByMake.this, mygarage.class);
                startActivity(intent);
            }
        });



        mNameSpinner = (Spinner)findViewById(R.id.spinner_car_name);
        mYearSpinner = (Spinner)findViewById(R.id.spinner_car_year);
        mModelSpinner = (Spinner)findViewById(R.id.vehical_model);
        mTrimSpinner = (Spinner)findViewById(R.id.vehical_trim);

        String[] carname ={"BMW","AUDi"};
        String[] carModel ={"A8","A9",""};
        String[] carvehicalYear ={"2009","2011","2013"};
        String[] carvehicalTrim ={"4.2L","2.2L"};
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(carname));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,arrayList);
        mNameSpinner.setAdapter(arrayAdapter);

        ArrayList<String> arrayList1 = new ArrayList<String>(Arrays.asList(carModel));
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,arrayList1);
        mModelSpinner.setAdapter(arrayAdapter1);

        ArrayList<String> arrayList2 = new ArrayList<String>(Arrays.asList(carvehicalYear));
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,arrayList2);
        mYearSpinner.setAdapter(arrayAdapter2);

        ArrayList<String> arrayList3 = new ArrayList<String>(Arrays.asList(carvehicalTrim));
        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,arrayList3);
        mTrimSpinner.setAdapter(arrayAdapter3);


    }
}