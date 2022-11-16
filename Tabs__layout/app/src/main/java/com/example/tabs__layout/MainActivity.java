package com.example.tabs__layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tablayout;
        ViewPager viewpager;

        viewpager = findViewById(R.id.viewpager);
        tablayout = findViewById(R.id.tablayout);


        ViewPAgerAdapter vpa = new ViewPAgerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(vpa);

        tablayout.setupWithViewPager(viewpager);




    }
}