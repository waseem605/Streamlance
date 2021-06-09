package com.example.streamlance.Fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.streamlance.MainPage.ByMake;
import com.example.streamlance.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;


public class mygarage extends Fragment {
    Button mbtn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_mygarage, container, false);
        mbtn=(Button)v.findViewById(R.id.add_vehicle);

        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


/*
                ByMakeFragment byMakeFragment = new ByMakeFragment();
                getActivity().getSupportFragmentManager().beginTransaction().add(R.id.by_make_container,byMakeFragment).addToBackStack(null).commit();

                // travel from fragment to fragment

                */

                startActivity(new Intent(getActivity(), ByMake.class));

                //Bottom_Sheet dialog=new Bottom_Sheet();
               //dialog.show(getFragmentManager(),dialog.getTag());

            }

        });




        return v;
    }
}
