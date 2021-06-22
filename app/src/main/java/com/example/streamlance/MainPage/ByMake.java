package com.example.streamlance.MainPage;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.streamlance.Fragments.Garage;
import com.example.streamlance.Fragments.Home;
import com.example.streamlance.Fragments.mygarage;
import com.example.streamlance.R;

import java.util.ArrayList;
import java.util.Arrays;

public class ByMake extends AppCompatActivity {

    private Spinner mNameSpinner,mYearSpinner,mModelSpinner,mTrimSpinner;
    Button mbtn;
    ImageView mBack_arrow;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_by_make);
        mbtn=(Button)findViewById(R.id.bymake_vehicle);
        mBack_arrow=(ImageView)findViewById(R.id.back_arrow_bm);




        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ByMake.this,MainActivity.class);
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



        mBack_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ByMake.this,MainActivity.class));
            }
        });
    }



}