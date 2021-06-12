package com.example.streamlance.FlowTwo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.streamlance.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class Diagnosis_Review_Pay extends BottomSheetDialogFragment {
    public  Diagnosis_Review_Pay()
    {

    }





    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_diagnosis__review__pay, container, false);
        return v;
    }
}