package com.example.streamlance.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.streamlance.Fragments.Completed;
import com.example.streamlance.Fragments.my_booking;
import com.example.streamlance.Fragments.mygarage;
import com.example.streamlance.GarageFragments.AboutGarage;
import com.example.streamlance.GarageFragments.BusinessHours;
import com.example.streamlance.GarageFragments.ReviewsFragment;
import com.example.streamlance.GarageFragments.ServicesFragment;

import org.jetbrains.annotations.NotNull;

public class GarageInfoAdapter extends FragmentPagerAdapter {
    public GarageInfoAdapter(@NonNull @NotNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AboutGarage();
            case 1:
                return new ServicesFragment();
            case 2:
                return new ReviewsFragment();
            case 3:
                return new BusinessHours();
            default:
                return new AboutGarage();


        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if(position==0)
        {
            title="ABOUT";
        }
        if(position==1)
        {
            title="SERVICES";
        }
        if(position==2)
        {
            title="REVIEWS";
        }
        if(position==3)
        {
            title="BUSINESS HOURS";
        }
        return title;
    }
}

