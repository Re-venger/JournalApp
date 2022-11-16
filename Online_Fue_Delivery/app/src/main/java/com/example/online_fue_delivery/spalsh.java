package com.example.online_fue_delivery;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class spalsh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle intent = getIntent().getExtras();
        String s1 = intent.getString("TAG");
        String s2 = intent.getString("TAG");


    }
}