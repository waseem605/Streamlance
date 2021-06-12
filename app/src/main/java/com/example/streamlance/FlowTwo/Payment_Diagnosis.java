package com.example.streamlance.FlowTwo;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.streamlance.MainPage.MainActivity;
import com.example.streamlance.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class Payment_Diagnosis extends BottomSheetDialogFragment {

    private Button mAdd_card;

    public Payment_Diagnosis()
    {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_payment__diagnosis, container, false);
        mAdd_card = (Button)v.findViewById(R.id.add_card_btn);

        mAdd_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




            }
        });

      return v;
    }
}