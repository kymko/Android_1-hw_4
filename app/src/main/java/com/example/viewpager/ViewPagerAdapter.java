package com.example.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return FirstFragment.newInstance("value 1", "value 2");

            case 1:
                return SecondFragment.newInstance("value 1, ", "value 2");
            case 2:
                return ProfileFragment.newInstance("value 1","value 2");

            default:
                return FirstFragment.newInstance("value 1", "value 2");
        }
    }


    @Override
    public int getCount() {

        return 3;
    }
}
