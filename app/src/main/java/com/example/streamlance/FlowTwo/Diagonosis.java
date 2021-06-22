package com.example.streamlance.FlowTwo;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.streamlance.Fragments.Home;
import com.example.streamlance.Fragments.Notification;
import com.example.streamlance.Fragments.Profile;
import com.example.streamlance.Fragments.Search;
import com.example.streamlance.MainPage.MainActivity;
import com.example.streamlance.R;
import com.example.streamlance.Services.Services_Summary;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class Diagonosis extends AppCompatActivity {

    private Button mRequestbtn;
    LinearLayout linearLayout,mAddition_service;
    private ImageView mBackLink;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.white));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_diagonosis);
        mRequestbtn = (Button)findViewById(R.id.request_btn_D);
        linearLayout = (LinearLayout) findViewById(R.id.diagonos_layout_mini);
        mAddition_service = (LinearLayout) findViewById(R.id.addition_service_lt);
        mBackLink = (ImageView) findViewById(R.id.back_arrow_diag);


        mBackLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Diagonosis.this, MainActivity.class));
            }
        });



        mRequestbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Diagonosis.this,DiagnosisReport.class));
            }
        });

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_main_navigation);

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

    public void cllAddionalServices(View view) {
        Dialog dialog = new Dialog(Diagonosis.this);
        dialog.setContentView(R.layout.dialog_additonal_services);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        //mViewQuotaBtn = (Button)dialog.findViewById(R.id.view_quota_btn);
        dialog.show();

    }


}