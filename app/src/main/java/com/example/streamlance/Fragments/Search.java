package com.example.streamlance.Fragments;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.streamlance.GarageFragments.Garage_Info;
import com.example.streamlance.MainPage.Map_Activity;
import com.example.streamlance.R;
import com.example.streamlance.common.Filter_Activity;


public class Search extends Fragment {
    ImageView imageView,filter_icon;
    private RelativeLayout mMapLink;



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requireActivity().getWindow().setStatusBarColor(getResources().getColor(R.color.Back_color));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_search, container, false);
        imageView=(ImageView)v.findViewById(R.id.imageclick);
        filter_icon=(ImageView)v.findViewById(R.id.filter_icon);
        mMapLink = (RelativeLayout)v.findViewById(R.id.map_link_search);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Search.this.getActivity(), Garage_Info.class);
                startActivity(intent);
            }
        });
        filter_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Search.this.getActivity(), Filter_Activity.class);
                startActivity(intent);
            }
        });

        mMapLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Search.this.getActivity(), Map_Activity.class);
                startActivity(intent);
            }
        });
        return v;
    }
}