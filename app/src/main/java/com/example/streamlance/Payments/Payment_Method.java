package com.example.streamlance.Payments;

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


public class Payment_Method extends BottomSheetDialogFragment {
    Button addcard;
    public Payment_Method()
    {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_payment__method, container, false);
        addcard=(Button)v.findViewById(R.id.addcard);
        addcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Payment_Method.this.getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
        return v;
    }
}