package com.example.streamlance.common;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.streamlance.R;

public class Onboarding extends AppCompatActivity {
    private ViewPager mSlideViewPager;
    private LinearLayout mDotLinearLayout;
    private TextView[] mDots;
    private ImageView mNextBtn;
    RelativeLayout relativeLayout;

    private SliderAdapter sliderAdapter;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.Back_color));
        setContentView(R.layout.activity_onboarding);
        mNextBtn = (ImageView)findViewById(R.id.Next_btn);
        mSlideViewPager=(ViewPager)findViewById(R.id.slide_viewpager);
        mDotLinearLayout=(LinearLayout)findViewById(R.id.dot_layout);
        relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);

        sliderAdapter =new SliderAdapter(this);

        mSlideViewPager.setAdapter(sliderAdapter);

        addDotsIndicator(0);
        mDotLinearLayout.setVisibility(View.VISIBLE);
        mNextBtn.setVisibility(View.INVISIBLE);

        mSlideViewPager.addOnPageChangeListener(onPageChangeListener);

/*
        mGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Onboarding.this, OTP_Screen.class);
                startActivity(intent);
                finish();
            }
        });*/
    }


    public void addDotsIndicator(int position)
    {
        mDots = new TextView[3];
        mDotLinearLayout.removeAllViews();

        for (int i = 0; i < mDots.length; i++) {

            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            //mDots[i].setTextColor(getResources().getColor(R.color.white));

            mDotLinearLayout.addView(mDots[i]);
        }

        if(mDots.length > 0)
        {
            mDots[position].setTextColor(getResources().getColor(R.color.orange));
        }
    }

    ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

            addDotsIndicator(i);
            if(i==0){
                mNextBtn.setVisibility(View.INVISIBLE);
            }
            else if(i==1){
                mNextBtn.setVisibility(View.INVISIBLE);
            }
            else if(i==2){
                next();
                mNextBtn.setVisibility(View.VISIBLE);
            }/*
            else if(i==3)
            {
                mDotLinearLayout.setVisibility(View.INVISIBLE);
                mGetStarted.setVisibility(View.VISIBLE);
            }*/
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }


    };
    public void next()
    {
        mNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Onboarding.this,GetStarted.class));

            }
        });

    }
}