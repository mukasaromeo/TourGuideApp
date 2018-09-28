package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourGuidePagerAdapter extends FragmentPagerAdapter {

    private final int PAGE_COUNT = 4;

    private Context mContext;

    public TourGuidePagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = Fragment.instantiate(mContext, NatureFragment.class.getName());
                break;
            case 1:
                fragment = Fragment.instantiate(mContext, GeneralFragment.class.getName());
                break;
            case 2:
                fragment = Fragment.instantiate(mContext, PlacesFragment.class.getName());
                break;
            case 3:
                fragment = Fragment.instantiate(mContext, FoodFragment.class.getName());
                break;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.hotels);
            case 1:
                return mContext.getString(R.string.schools);
            case 2:
                return mContext.getString(R.string.malls);
            default:
                return mContext.getString(R.string.restaurants);
        }
    }

}
