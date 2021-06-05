package com.example.streamlance.common;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.streamlance.R;

public class Onboarding extends AppCompatActivity {
    private ViewPager mSlideViewPager;
    private LinearLayout mDotLinearLayout;
    private TextView[] mDots;
    private Button mGetStarted;

    private SliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        mSlideViewPager=(ViewPager)findViewById(R.id.slide_viewpager);
        mDotLinearLayout=(LinearLayout)findViewById(R.id.dot_layout);
        mGetStarted = (Button)findViewById(R.id.get_started_btn);

        sliderAdapter =new SliderAdapter(this);

        mSlideViewPager.setAdapter(sliderAdapter);

        addDotsIndicator(0);
        mDotLinearLayout.setVisibility(View.VISIBLE);
        mGetStarted.setVisibility(View.INVISIBLE);

        mSlideViewPager.addOnPageChangeListener(onPageChangeListener);


        mGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Onboarding.this, OTP_Screen.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void addDotsIndicator(int position)
    {
        mDots = new TextView[4];
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
                mGetStarted.setVisibility(View.INVISIBLE);
            }
            else if(i==1){
                mGetStarted.setVisibility(View.INVISIBLE);
            }
            else if(i==2){
                mGetStarted.setVisibility(View.INVISIBLE);
            }
            else
            {
                mDotLinearLayout.setVisibility(View.INVISIBLE);
                mGetStarted.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}