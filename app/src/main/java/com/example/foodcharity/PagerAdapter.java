package com.example.foodcharity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mychatapptutorial.callFragment;
import com.example.mychatapptutorial.chatFragment;
import com.example.mychatapptutorial.statusFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    int tabcount;




    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new chatFragment();

            case 1:
                return new statusFragment();

            case 2:
                return new callFragment();

            default:
                return null;
        }



    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
