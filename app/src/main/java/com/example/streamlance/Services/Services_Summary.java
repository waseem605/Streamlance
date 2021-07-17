package com.example.streamlance.Services;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.fonts.SystemFonts;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;

import com.example.streamlance.MainPage.ProvidersQuotes;
import com.example.streamlance.R;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.savvi.rangedatepicker.CalendarPickerView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Services_Summary extends FragmentActivity {

    private TextView mStartDate, service,servicetype;
    private ImageView mBackArrow;
    private Spinner spinner;

    private Button mDatePickerBtn;
    private Button mViewQuotaBtn;
    LinearLayout linearDate,llsamplecar;

    CalendarPickerView calendarPickerView;



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_services_summary);
        Services_Summary services_summary=new Services_Summary();


        mDatePickerBtn = (Button)findViewById(R.id.date_picker_btn);
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

        spinner = (Spinner)findViewById(R.id.select_hours_range);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Services_Summary.this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.prefer_hours));
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        //spinner.setOnItemClickListener((AdapterView.OnItemClickListener) this);

/*
            savvi date range

        mDatePickerBtn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(Services_Summary.this);
                dialog.setContentView(R.layout.dialog_date_range);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
               Button selectDate = (Button)dialog.findViewById(R.id.date_btn);
                dialog.show();

                final Calendar nextYear = Calendar.getInstance();
                final Calendar lastYear = Calendar.getInstance();
                nextYear.add(Calendar.YEAR,10);
                lastYear.add(Calendar.YEAR,-10);

                calendarPickerView = (CalendarPickerView)dialog.findViewById(R.id.date);

                ArrayList<Integer> list = new ArrayList<>();

                list.add(1);
                calendarPickerView.deactivateDates(list);
                ArrayList<Date> arrayList = new ArrayList<>();
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
                    String strDate = "22-2-2019";
                    String strDate2 = "27-2-2019";
                    Date newDate = dateFormat.parse(strDate);
                    Date newDate2 = dateFormat.parse(strDate2);

                    arrayList.add(newDate);
                    arrayList.add(newDate2);
                }catch (ParseException p)
                {
                    p.printStackTrace();
                }
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    calendarPickerView.init(lastYear.getTime(),nextYear.getTime(),new SimpleDateFormat("MM,yy"))
                            .inMode(CalendarPickerView.SelectionMode.RANGE).withHighlightedDates(arrayList);

                    selectDate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String var = calendarPickerView.getSelectedDates().toString();
                            Toast.makeText(Services_Summary.this,"date selected"+var,Toast.LENGTH_LONG).show();

                        }
                    });
                }


            }
        });
*/








        MaterialDatePicker.Builder<androidx.core.util.Pair<Long, Long>> builder = MaterialDatePicker.Builder.dateRangePicker()
                .setTheme(R.style.MaterialCalendarTheme);
        MaterialDatePicker<androidx.core.util.Pair<Long, Long>> materialDatePicker = builder.build();
        mDatePickerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                materialDatePicker.show(getSupportFragmentManager(),"date");

            }
        });
        materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
            @Override
            public void onPositiveButtonClick(Object selection) {
                mStartDate.setText(materialDatePicker.getHeaderText());
            }
        });




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