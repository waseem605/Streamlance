package com.example.streamlance.Fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.nfc.cardemulation.HostApduService;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.streamlance.Adapter.HomeAdapter;
import com.example.streamlance.MainPage.ChatActivity;
import com.example.streamlance.R;
import com.google.android.material.tabs.TabLayout;


public class Home extends Fragment {
    Button messagebtn;

    HomeAdapter homeAdapter;
    private TabLayout mtabLayout;
    private ViewPager mviewPager;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requireActivity().getWindow().setStatusBarColor(getResources().getColor(R.color.white));
       requireActivity().getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

    }



    @SuppressLint("NewApi")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v=inflater.inflate(R.layout.fragment_home, container, false);
         mtabLayout=(TabLayout) v.findViewById (R.id.tablayout);
         mviewPager=(ViewPager) v.findViewById(R.id.viewPage);
         messagebtn=(Button)v.findViewById(R.id.btnmessage);
         messagebtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(Home.this.getActivity(), ChatActivity.class);
                 startActivity(intent);
             }
         });


         homeAdapter =new HomeAdapter(getActivity().getSupportFragmentManager());
         mviewPager.setAdapter(homeAdapter);
         mtabLayout.setupWithViewPager(mviewPager);



         return v;

    }
}