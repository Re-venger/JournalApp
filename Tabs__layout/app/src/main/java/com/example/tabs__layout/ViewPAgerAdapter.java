package com.example.tabs__layout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPAgerAdapter extends FragmentPagerAdapter {

    public ViewPAgerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new chatFragment();
        }
        else if(position == 1){
            return new StatusFragment();
        }
        else{
            return new callsFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "Chats";
        }
        else if(position == 1){
            return "Status";
        }
        else{
            return "Class";
        }
    }
}
