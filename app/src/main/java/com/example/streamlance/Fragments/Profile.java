package com.example.streamlance.Fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.streamlance.MainPage.ChatActivity;
import com.example.streamlance.Payments.Payment_Method;
import com.example.streamlance.R;

public class Profile extends Fragment {
    private RelativeLayout mMessageLink,paymentmethod;

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
        mMessageLink = (RelativeLayout) view.findViewById(R.id.message_RL);
        paymentmethod=(RelativeLayout) view.findViewById(R.id.payment_RL);
        message = (TextView)view.findViewById(R.id.messagetx);

        mMessageLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this.getActivity(),ChatActivity.class);
                startActivity(intent);
            }
        });
        paymentmethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Payment_Method dialog=new Payment_Method();
                dialog.show(getFragmentManager(),dialog.getTag());
            }
        });
        return view;
    }
}