package com.example.streamlance.GarageFragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.streamlance.Adapter.GarageInfoAdapter;
import com.example.streamlance.R;
import com.google.android.material.tabs.TabLayout;

public class Garage_Info extends AppCompatActivity {
    GarageInfoAdapter mgarageInfoAdapter;
    ViewPager mviewPager;
    TabLayout mtabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage_info);
        mgarageInfoAdapter=new GarageInfoAdapter(getSupportFragmentManager());
        mviewPager=(ViewPager)findViewById(R.id.viewpagergarageinfo);
        mtabLayout=(TabLayout)findViewById(R.id.tablayoutgarageinfo);
        mviewPager.setAdapter(mgarageInfoAdapter);
        mtabLayout.setupWithViewPager(mviewPager);
    }
}