package com.example.phearun.fragementdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.astuetz.PagerSlidingTabStrip;

/**
 * Created by Phearun on 1/5/2017.
 */

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter /*implements PagerSlidingTabStrip.IconTabProvider*/{

    private String tabTitles[] = new String[] { "Home", "Downloaded", "Favourite","Home", "Downloaded", "Favourite","Home", "Downloaded", "Favourite" };

 //   private int tabTitles[] = new int[] { R.drawable.ic_home_black_24dp, R.drawable.ic_file_download_black_24dp, R.drawable.ic_favorite_black_24dp };

    public SampleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }


    /*@Override
    public int getPageIconResId(int position) {
        return tabTitles[position];
    }*/
}