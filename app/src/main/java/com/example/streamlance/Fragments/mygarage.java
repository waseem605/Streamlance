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


public class mygarage extends Fragment {
    Button mbtn,mbtnadd;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_mygarage, container, false);
        mbtn=(Button)v.findViewById(R.id.add_vehicle);
        mbtnadd=(Button)v.findViewById(R.id.addvehicle);

        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mygarage.this.getActivity(), ByMake.class);
                startActivity(intent);
            }
        });
        mbtnadd=(Button)v.findViewById(R.id.addvehicle);
        mbtnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mygarage.this.getActivity(), ByMake.class);
                startActivity(intent);
            }
        });
        return v;
    }
}
