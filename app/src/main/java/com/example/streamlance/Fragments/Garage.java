package com.example.streamlance.Fragments;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.streamlance.MainPage.ByMake;
import com.example.streamlance.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;


public class Garage extends Fragment {

   Button mbtnadd;
   TextView service,servicetype;

   private LinearLayout carlinearLayout,btnlinearLayout,llsamplecar;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_garage, container, false);
        carlinearLayout=(LinearLayout)v.findViewById(R.id.samplecar);
        btnlinearLayout=(LinearLayout)v.findViewById(R.id.addmorevehicle);
        mbtnadd = (Button) v.findViewById(R.id.addvehicle);
        llsamplecar=v.findViewById(R.id.samplecar);
        llsamplecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.rounded_white));
        service=v.findViewById(R.id.service);
        servicetype=v.findViewById(R.id.servicetype);
        service.setVisibility(View.INVISIBLE);
        servicetype.setVisibility(View.INVISIBLE);

        mbtnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Garage.this.getActivity(), ByMake.class);
                startActivity(intent);
            }
        });

       carlinearLayout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Bottom_Sheet dialog=new Bottom_Sheet();
               dialog.show(getFragmentManager(),dialog.getTag());
           }
       });

        btnlinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(Garage.this.getActivity(),ByMake.class);
               startActivity(intent);
            }
        });
        return v;
    }

}