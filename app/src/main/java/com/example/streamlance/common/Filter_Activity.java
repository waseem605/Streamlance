package com.example.streamlance.common;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.DrawableCompat;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;

import com.example.streamlance.Fragments.Search;
import com.example.streamlance.MainPage.MainActivity;
import com.example.streamlance.R;
import com.google.android.material.slider.RangeSlider;
import com.iarcuschin.simpleratingbar.SimpleRatingBar;

import org.florescu.android.rangeseekbar.RangeSeekBar;
import org.jetbrains.annotations.NotNull;

public class Filter_Activity extends AppCompatActivity {
    TextView lowrange,highrange;
    private ImageView mCrossLink;
    private SimpleRatingBar ratingBar;
    private TextView mStarText;

    private Button mShowFilter;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);


        lowrange=findViewById(R.id.low_range);
        highrange=findViewById(R.id.high_range);
        mCrossLink =(ImageView)findViewById(R.id.cross_icon_f);
        RangeSlider rs2=findViewById(R.id.distance_range);
        RangeSlider rs=(RangeSlider)findViewById(R.id.range);
        mShowFilter =(Button)findViewById(R.id.btnshowrslt);
        ratingBar = findViewById(R.id.ratingbar);
        mStarText = (TextView)findViewById(R.id.star_id);

        ratingBar.setOnRatingBarChangeListener(new SimpleRatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(SimpleRatingBar simpleRatingBar, float rating, boolean fromUser) {
                {
                    mStarText.setText("" + rating);
            }
        }
        });



        // Range Slider $
        rs.setThumbTintList(getColorStateList(R.color.white));
        rs.setTrackHeight(20);
        rs.setThumbStrokeColor(getColorStateList(R.color.Back_color));
        rs.setThumbStrokeWidth(8);
        rs.setTrackTintList(getColorStateList(R.color.Filter_track));
        rs.setHaloTintList(getColorStateList(R.color.Back_color));
        rs.setTrackActiveTintList(getColorStateList(R.color.Back_color));
        // Range Slider Distance
        rs2.setTrackHeight(20);
        rs2.setThumbTintList(getColorStateList(R.color.white));
        rs2.setThumbStrokeColor(getColorStateList(R.color.Back_color));
        rs2.setThumbStrokeWidth(8);
        rs2.setTrackTintList(getColorStateList(R.color.Filter_track));
        rs2.setTrackActiveTintList(getColorStateList(R.color.Back_color));
        rs2.setHaloTintList(getColorStateList(R.color.Back_color));

/*
        rs.addOnChangeListener(new RangeSlider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull @NotNull RangeSlider slider, float value, boolean fromUser) {
                lowrange.setText(""+value);
                highrange.setText(""+value);
            }
        });
        */



        mCrossLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Filter_Activity.this, MainActivity.class));
            }
        });
        mShowFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Search search=new Search();
                Intent intent=new Intent(Filter_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }




}