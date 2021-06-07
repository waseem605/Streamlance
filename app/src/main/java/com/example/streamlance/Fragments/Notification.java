package com.example.streamlance.Fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.example.streamlance.Adapter.HomeAdapter;
import com.example.streamlance.Adapter.NotificationAdapter;
import com.example.streamlance.R;
import com.google.android.material.tabs.TabLayout;


public class Notification extends Fragment {
    TabLayout mTabLayout;
    ViewPager mViewPager;
    NotificationAdapter mNotificationAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_notification, container, false);
        mTabLayout=(TabLayout) v.findViewById(R.id.Ntablayout);
        mViewPager=(ViewPager) v.findViewById(R.id.NviewPage);
        mNotificationAdapter =new NotificationAdapter(getActivity().getSupportFragmentManager());
        mViewPager.setAdapter(mNotificationAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        return v;
    }
}