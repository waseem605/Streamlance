package com.example.streamlance.MainPage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.streamlance.Fragments.Home;
import com.example.streamlance.Fragments.Notification;
import com.example.streamlance.Fragments.Profile;
import com.example.streamlance.Fragments.Search;
import com.example.streamlance.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class Garage extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_main_navigation_garage);
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {


                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.home_nav:
                        fragment = new Home();
                        break;

                    case R.id.search_nav:
                        fragment = new Search();
                        break;

                    case R.id.notification_nav:
                        fragment = new Notification();
                        break;

                    case R.id.user_nav:
                        fragment = new Profile();
                        break;
                }


            }
        });
    }
}