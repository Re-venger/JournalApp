package com.example.androidfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ExampleFragment extends Fragment {

    public ExampleFragment() {
        // Required empty public constructor
        // to create a fragment that has its own layout we specify the layout it should use
        super(R.layout.fragment_example);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int someInt = requireArguments().getInt("SomeInteger");
        return inflater.inflate(R.layout.fragment_example, container, false);
    }
}