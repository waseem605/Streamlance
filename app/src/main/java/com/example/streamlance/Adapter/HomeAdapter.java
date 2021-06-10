package com.example.streamlance.Adapter;


import android.renderscript.ScriptGroup;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.streamlance.Fragments.Completed;
import com.example.streamlance.Fragments.Home;
import com.example.streamlance.Fragments.Notification;
import com.example.streamlance.Fragments.Profile;
import com.example.streamlance.Fragments.Search;
import com.example.streamlance.Fragments.my_booking;
import com.example.streamlance.Fragments.mygarage;

import org.jetbrains.annotations.NotNull;

public class HomeAdapter extends FragmentPagerAdapter {

    public HomeAdapter(@NonNull @NotNull FragmentManager fm) {
        super(fm);
    }



    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new mygarage();
            case 1: return new my_booking();
            case 2: return new Completed();
            default:return new mygarage();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=null;
        if(position==0)
        {
            title="MY GARAGE";
        }
        if(position==1)
        {
            title="MY BOOKINGS";
        }
        if(position==2)
        {
            title="COMPLETED";
        }
        return title;
    }
}

