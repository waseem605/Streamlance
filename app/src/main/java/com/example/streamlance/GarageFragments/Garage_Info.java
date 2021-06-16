package com.example.streamlance.GarageFragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.streamlance.Adapter.GarageInfoAdapter;
import com.example.streamlance.R;
import com.example.streamlance.common.SliderAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class Garage_Info extends AppCompatActivity {
    GarageInfoAdapter mgarageInfoAdapter;
    ViewPager mviewPager;
    TabLayout mtabLayout;

    RelativeLayout relativeLayout;
    private ViewPager mSlideViewPager;
    private RelativeLayout mDotLinearLayout;
    private TextView[] mDots;
    private SliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage_info);
        mgarageInfoAdapter=new GarageInfoAdapter(getSupportFragmentManager());
        mviewPager=(ViewPager)findViewById(R.id.viewpagergarageinfo);
        mtabLayout=(TabLayout)findViewById(R.id.tablayoutgarageinfo);


        ImageSlider imageSlider =findViewById(R.id.slide_garage_images);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.carimport_imagere));
        slideModels.add(new SlideModel(R.drawable.car_import_image));
        slideModels.add(new SlideModel(R.drawable.car_m_import_image));
        imageSlider.setImageList(slideModels,true);

        /*
        mviewPager.setAdapter(mgarageInfoAdapter);
        mtabLayout.setupWithViewPager(mviewPager);

        mSlideViewPager=(ViewPager)findViewById(R.id.slide_viewpager_garage);
        mDotLinearLayout=(RelativeLayout)findViewById(R.id.dot_layout_garage);

        sliderAdapter =new SliderAdapter(this);

        mSlideViewPager.setAdapter(sliderAdapter);

        addDotsIndicator(0);
        mDotLinearLayout.setVisibility(View.VISIBLE);

        mSlideViewPager.addOnPageChangeListener(onPageChangeListener);
*/
    }

    ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

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
}