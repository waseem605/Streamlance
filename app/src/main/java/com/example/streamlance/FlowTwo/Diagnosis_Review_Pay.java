package com.example.streamlance.FlowTwo;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.streamlance.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class Diagnosis_Review_Pay extends BottomSheetDialogFragment {

    private LinearLayout mConfirmPay;
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

        mConfirmPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Payment_Diagnosis payment_diagnosis = new Payment_Diagnosis();
                Diagnosis_Review_Pay diagnosis_review_pay = new Diagnosis_Review_Pay();
                payment_diagnosis.show(getFragmentManager(),payment_diagnosis.getTag());
                getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
        });


        return v;
    }
}