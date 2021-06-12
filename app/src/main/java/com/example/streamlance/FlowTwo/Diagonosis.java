package com.example.streamlance.FlowTwo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.streamlance.Fragments.Home;
import com.example.streamlance.Fragments.Notification;
import com.example.streamlance.Fragments.Profile;
import com.example.streamlance.Fragments.Search;
import com.example.streamlance.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class Diagonosis extends AppCompatActivity {

    private Button mRequestbtn;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagonosis);
        mRequestbtn = (Button)findViewById(R.id.request_btn_D);
        linearLayout = findViewById(R.id.diagonos_layout_mini);


        mRequestbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Diagonosis.this,DiagnosisReport.class));
            }
        });

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_main_navigation);
        //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Home()).commit();


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {

                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.home_nav:
                        linearLayout.setVisibility(View.INVISIBLE);
                        fragment = new Home();
                        break;

                    case R.id.search_nav:
                        linearLayout.setVisibility(View.INVISIBLE);
                        fragment = new Search();
                        break;

                    case R.id.notification_nav:
                        linearLayout.setVisibility(View.INVISIBLE);
                        fragment = new Notification();
                        break;

                    case R.id.user_nav:
                        linearLayout.setVisibility(View.INVISIBLE);
                        fragment = new Profile();
                        break;
                }
                //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
                getSupportFragmentManager().beginTransaction().replace(R.id.diagonos_layout, fragment).commit();
                return true;
            }
        });


    }
}