package com.example.streamlance.Services;

import androidx.annotation.RequiresApi;
import androidx.core.util.Pair;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.streamlance.FlowTwo.Diagonosis;
import com.example.streamlance.MainPage.ProvidersQuotes;
import com.example.streamlance.R;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

public class Services_Summary extends Activity {

    private TextView mStartDate, mEndDate,service,servicetype;
    private ImageView mBackArrow;
    private Spinner spinner;

    LinearLayout linearDate,llsamplecar;


    MaterialDatePicker.Builder<Pair<Long, Long>> builder = MaterialDatePicker.Builder.dateRangePicker();
    final MaterialDatePicker materialDatePicker = builder.build();
    private Button mViewQuotaBtn;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_services_summary);
        llsamplecar=findViewById(R.id.samplecar);
        llsamplecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.rounded_white));
        service=findViewById(R.id.service);
        service.setVisibility(View.INVISIBLE);
        servicetype=findViewById(R.id.servicetype);
        servicetype.setVisibility(View.INVISIBLE);
        mStartDate = (TextView)findViewById(R.id.start_date_tx);
        mBackArrow = (ImageView) findViewById(R.id.back_arrow_ss);
        mViewQuotaBtn = (Button)findViewById(R.id.view_quota_btn);
        linearDate = (LinearLayout)findViewById(R.id.datePic_layout);

        mEndDate = (TextView)findViewById(R.id.end_date_tx);
        spinner = (Spinner)findViewById(R.id.select_hours_range);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Services_Summary.this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.prefer_hours));
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        //spinner.setOnItemClickListener((AdapterView.OnItemClickListener) this);


       /* linearDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialDatePicker.show(materialDatePicker.getChildFragmentManager(), "date");
            }
        });*/


        mBackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Services_Summary.this,Choose_services.class);
                startActivity(intent);
            }
        });
    }




    //button click listener
    public void callQuotasubmited(View view) {

        Dialog dialog = new Dialog(Services_Summary.this);
        dialog.setContentView(R.layout.quata_submited_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        mViewQuotaBtn = (Button)dialog.findViewById(R.id.view_quota_btn);
        dialog.show();

        mViewQuotaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Services_Summary.this, ProvidersQuotes.class);
                startActivity(intent);
            }
        });


    }

    public void cllAddionalServicesS(View view) {


        Dialog dialog = new Dialog(Services_Summary.this);
        dialog.setContentView(R.layout.dialog_additonal_services);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        //mViewQuotaBtn = (Button)dialog.findViewById(R.id.view_quota_btn);
        dialog.show();
    }
}