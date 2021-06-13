package com.example.streamlance.FlowTwo;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.streamlance.MainPage.MainActivity;
import com.example.streamlance.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class Diagnosis_Review_Pay extends BottomSheetDialogFragment {

    private LinearLayout mConfirmPay;
    ImageView addcreditimage;
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
        mConfirmPay = (LinearLayout)v.findViewById(R.id.linearreviewandpay);
        addcreditimage=(ImageView)v.findViewById(R.id.addcreditcard);

        mConfirmPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Diagnosis_Review_Pay.this.getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
        addcreditimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Payment_Diagnosis dialog=new Payment_Diagnosis();
                dialog.show(getFragmentManager(),dialog.getTag());
            }
        });


        return v;
    }
}