package com.example.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class AFragment extends Fragment {


    public AFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView fragA = view.findViewById(R.id.fragA);
        return view;
    }
}