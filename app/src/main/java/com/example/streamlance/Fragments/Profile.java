package com.example.streamlance.Fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.streamlance.MainPage.ChatActivity;
import com.example.streamlance.R;

public class Profile extends Fragment {
    private LinearLayout mLinearLayout;
    private TextView message;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_profile, container, false);
        mLinearLayout = (LinearLayout)view.findViewById(R.id.message_layout);
        message = (TextView)view.findViewById(R.id.messagetx);

        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this.getActivity(),ChatActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}