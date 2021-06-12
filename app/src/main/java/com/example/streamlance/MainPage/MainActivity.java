package com.example.streamlance.MainPage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.streamlance.Fragments.Home;
import com.example.streamlance.Fragments.Notification;
import com.example.streamlance.Fragments.Profile;
import com.example.streamlance.Fragments.Search;
import com.example.streamlance.Fragments.mygarage;
import com.example.streamlance.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_main_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Home()).commit();


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {

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
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
                return true;
            }
        });

    }
}