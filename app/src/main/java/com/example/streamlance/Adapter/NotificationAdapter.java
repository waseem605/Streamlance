package com.example.streamlance.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.streamlance.Fragments.Activities;
import com.example.streamlance.Fragments.Promotions;

import org.jetbrains.annotations.NotNull;

public class NotificationAdapter extends FragmentPagerAdapter {
    public NotificationAdapter(@NonNull @NotNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:return new Activities();
            case 1:return new Promotions();
            default:return new Activities();
        }
    }

    @Override
    public int getCount() { return 2;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=null;
        if(position==0)
        {
            title="Activities";
        }
        if(position==1)
        {
           title="Promotions";
        }
        return title;
    }
}
