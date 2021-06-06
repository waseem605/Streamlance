package com.example.streamlance.Fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import com.example.streamlance.Adapter.FragementAdapter;
import com.example.streamlance.R;
import com.google.android.material.tabs.TabLayout;

import java.util.zip.Inflater;


public class Home extends Fragment {

    FragementAdapter fragementAdapter;
    private TabLayout mtabLayout;
    private ViewPager mviewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v=inflater.inflate(R.layout.fragment_home, container, false);
         mtabLayout=(TabLayout) v.findViewById (R.id.tablayout);
         mviewPager=(ViewPager) v.findViewById(R.id.viewPage);
         fragementAdapter=new FragementAdapter(getActivity().getSupportFragmentManager());
         mviewPager.setAdapter(fragementAdapter);
         mtabLayout.setupWithViewPager(mviewPager);

       return v;

    }
}