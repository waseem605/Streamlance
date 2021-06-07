package com.example.streamlance.Fragments;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.streamlance.Adapter.HomeAdapter;
import com.example.streamlance.R;
import com.google.android.material.tabs.TabLayout;


public class Home extends Fragment {

    HomeAdapter homeAdapter;
    private TabLayout mtabLayout;
    private ViewPager mviewPager;
    private Toolbar mToolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



    @SuppressLint("NewApi")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v=inflater.inflate(R.layout.fragment_home, container, false);
         mtabLayout=(TabLayout) v.findViewById (R.id.tablayout);
         mviewPager=(ViewPager) v.findViewById(R.id.viewPage);

         homeAdapter =new HomeAdapter(getActivity().getSupportFragmentManager());
         mviewPager.setAdapter(homeAdapter);
         mtabLayout.setupWithViewPager(mviewPager);



         return v;

    }
}