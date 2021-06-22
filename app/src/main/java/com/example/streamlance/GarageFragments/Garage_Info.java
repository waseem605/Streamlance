package com.example.streamlance.GarageFragments;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

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

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.streamlance.Adapter.GarageInfoAdapter;
import com.example.streamlance.Fragments.Garage;
import com.example.streamlance.MainPage.ChatDetails;
import com.example.streamlance.MainPage.ProvidersQuotes;
import com.example.streamlance.R;
import com.example.streamlance.common.SliderAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class Garage_Info extends AppCompatActivity {
    GarageInfoAdapter mgarageInfoAdapter;
    ViewPager mviewPager;
    private Button mChat;
    TabLayout mtabLayout;

    RelativeLayout relativeLayout;
    private ViewPager mSlideViewPager;
    private RelativeLayout mDotLinearLayout;
    private TextView[] mDots;
    ImageView leftarrow;
    private SliderAdapter sliderAdapter;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage_info);
        getWindow().setStatusBarColor(getResources().getColor(R.color.black));
        mgarageInfoAdapter = new GarageInfoAdapter(getSupportFragmentManager());
        mviewPager = (ViewPager) findViewById(R.id.viewpagergarageinfo);
        mtabLayout = (TabLayout) findViewById(R.id.tablayoutgarageinfo);
        leftarrow=findViewById(R.id.left_arrow);
        mChat = (Button) findViewById(R.id.chat_garage);
        mviewPager.setAdapter(mgarageInfoAdapter);
        mtabLayout.setupWithViewPager(mviewPager);

        ImageSlider imageSlider = findViewById(R.id.slide_garage_images);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.carimport_imagere));
        slideModels.add(new SlideModel(R.drawable.car_import_image));
        slideModels.add(new SlideModel(R.drawable.car_m_import_image));
        imageSlider.setImageList(slideModels, true);



        mChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Garage_Info.this, ChatDetails.class));
            }
        });
        leftarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Garage_Info.this, ProvidersQuotes.class));
            }
        });

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
}