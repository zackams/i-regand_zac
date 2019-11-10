package com.sugema.i_regand;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    private int numOfTabs;
    public PageAdapter(FragmentManager fm, int numOfTabs) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Fragment_TimeSeries();
            case 1:
                return new Fragment_CrossSection();
            case 2:
                return new Fragment_Panel();
            default:
                return null;
        }
    }


    public Fragment getItemsrch(int position){
        switch (position){
            case 0:
                return new Fragment_src_xls();
            case 1:
                return new Fragment_src_csv();
            case 2:
                return new Fragment_src_txt();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}