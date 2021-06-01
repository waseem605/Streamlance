package com.example.streamlance;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

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
            R.drawable.vector_free_towing_car_illustration
    };

    public String[] slide_heading={
            "How It Works",
            "How It Will Be Helpful For You",
            "Our Customers And Garages"
    };
    public String[] slide_description={
            "Looking for a garage you can trust for a auto service or car repair? Using the Streamlane, you can find a garage near you.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas suscipit iaculis ullamcorper. Morbi ac mauris eleifend, pretium turpis ut, orci.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas suscipit iaculis ullamcorper. Morbi ac mauris eleifend, pretium turpis ut, orci."
    };

    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull @org.jetbrains.annotations.NotNull View view, @NonNull @org.jetbrains.annotations.NotNull Object o) {
        return view==(RelativeLayout) o;
    }

    @NonNull
    @NotNull
    @Override
    public Object instantiateItem(@NonNull @NotNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView slideImageView = (ImageView)view.findViewById(R.id.slide_Images);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_descrption);

        slideImageView.setImageResource(slide_Images[position]);
        slideHeading.setText(slide_heading[position]);
        slideDescription.setText(slide_description[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull @NotNull ViewGroup container, int position, @NonNull @NotNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
