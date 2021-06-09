package com.example.streamlance.Fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.streamlance.MainPage.Garage;
import com.example.streamlance.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.function.IntToDoubleFunction;


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
                Intent intent = new Intent(mygarage.this.getActivity(), Garage.class);
                startActivity(intent);
            }
        });
        return v;
    }
}
