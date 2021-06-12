package com.example.streamlance.Fragments;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.ContentView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.streamlance.FlowTwo.Diagonosis;
import com.example.streamlance.R;
import com.example.streamlance.Services.Choose_services;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class Bottom_Sheet extends BottomSheetDialogFragment {
    LinearLayout mlinearLayout, mHelpLinear;
    public Bottom_Sheet ()
    {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("ResourceType")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom__sheet, container, false);
        mHelpLinear = (LinearLayout)view.findViewById(R.id.help_me_fix_car);
        mlinearLayout = (LinearLayout)view.findViewById(R.id.choose_service);
        mlinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Choose_services.class);
                startActivity(intent);
            }
        });

        mHelpLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Diagonosis.class);
                startActivity(intent);
            }
        });

        return view;
    }
}