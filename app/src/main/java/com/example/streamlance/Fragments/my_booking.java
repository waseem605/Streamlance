package com.example.streamlance.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.streamlance.GarageFragments.Quote_Details;
import com.example.streamlance.R;

public class my_booking extends Fragment {

 Button btnbooking;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v=inflater.inflate(R.layout.fragment_my_booking, container, false);
       btnbooking=(Button)v.findViewById(R.id.btnbooking);
       btnbooking.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(my_booking.this.getActivity(), Quote_Details.class);
               startActivity(intent);
           }
       });
       return v;
    }

}