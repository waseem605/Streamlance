package com.example.streamlance.Fragments;

import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.streamlance.R;
import com.example.streamlance.Services.Choose_services;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class Bottom_Sheet extends BottomSheetDialogFragment {
    public Bottom_Sheet ()
    {

    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout mlinearLayout;
        View v= inflater.inflate(R.layout.fragment_bottom__sheet, container, false);
        mlinearLayout=(LinearLayout)v.findViewById(R.id.choose_service);
        mlinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Choose_services.class);
                startActivity(intent);
            }
        });
        return v;
    }


}