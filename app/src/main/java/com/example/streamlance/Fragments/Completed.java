package com.example.streamlance.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.streamlance.GarageFragments.Quote_DetailsCompleted;
import com.example.streamlance.R;


public class Completed extends Fragment {
 Button btncompleted;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_completed, container, false);
        btncompleted=(Button)v.findViewById(R.id.btncompleted);
        btncompleted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Completed.this.getActivity(), Quote_DetailsCompleted.class);
                startActivity(intent);
            }
        });
        return v;
    }
}