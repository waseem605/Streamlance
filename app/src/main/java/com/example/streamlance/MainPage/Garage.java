package com.example.streamlance.MainPage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.nfc.Tag;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.streamlance.Adapter.CarRecyclerAdapter;
import com.example.streamlance.Fragments.Bottom_Sheet;
import com.example.streamlance.Fragments.Home;
import com.example.streamlance.Fragments.Notification;
import com.example.streamlance.Fragments.Profile;
import com.example.streamlance.Fragments.Search;
import com.example.streamlance.Models.Cars;
import com.example.streamlance.R;
import com.example.streamlance.databinding.ActivityGarageBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Garage extends AppCompatActivity {

    LinearLayout mlinearLayout;

    RecyclerView recyclerView;
    String carname,carpic,carmodel;
    ArrayList<Cars> list=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);
        recyclerView=(RecyclerView)findViewById(R.id.carrecyclerview);
        mlinearLayout=(LinearLayout)findViewById(R.id.addmorevehicle);
        final CarRecyclerAdapter adapter=new CarRecyclerAdapter(list,getApplicationContext());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        carname="BMW";
        carmodel="1234567";
        Cars cars=new Cars(carname,carpic,carmodel);
        list.add(cars);
        adapter.notifyDataSetChanged();
        mlinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Bottom_Sheet bottom_sheet=new Bottom_Sheet();
               bottom_sheet.show(getSupportFragmentManager(),bottom_sheet.getTag());

            }
        });

    }
}