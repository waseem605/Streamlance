package com.example.streamlance.common;

import android.content.Context;
import android.support.*;
import android.support.*;
import android.support.v4.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.example.streamlance.R;

import org.jetbrains.annotations.NotNull;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    //Array
    public int[]slide_Images = {
            R.drawable.gradient_overlay,
            R.drawable.isometric_garage_vector,
            R.drawable.vector_free_towing_car_illustration,
            R.drawable.gradient_man
    };

    public int slide_heading[]={
            R.string.slide_heading1,
            R.string.slide_heading2,
            R.string.slide_heading3,
            R.string.slide_heading4

    };
    public int[] slide_description={
            R.string.slide_description1,
            R.string.slide_description2,
            R.string.slide_description3,
            R.string.slide_description4
    };

    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull @org.jetbrains.annotations.NotNull View view, @NonNull @org.jetbrains.annotations.NotNull Object o) {
        return view==(ConstraintLayout) o;
    }

    @NonNull
    @NotNull
    @Override
    public Object instantiateItem(@NonNull @NotNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView slideImageView = (ImageView)view.findViewById(R.id.slide_Images);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_description);

        slideImageView.setImageResource(slide_Images[position]);
        slideHeading.setText(slide_heading[position]);
        slideDescription.setText(slide_description[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull @NotNull ViewGroup container, int position, @NonNull @NotNull Object object) {
        container.removeView((ConstraintLayout)object);
    }
}
