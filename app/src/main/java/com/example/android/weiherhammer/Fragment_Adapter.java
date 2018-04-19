package com.example.android.weiherhammer;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Paulina on 4/8/2018.
 */

public class Fragment_Adapter extends FragmentPagerAdapter {
    private Context context;

    public Fragment_Adapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlacesFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new SpeciesFragment();
        } else if (position == 3) {
            return new ActivitiesFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_places);
        } else if (position == 1) {
            return context.getString(R.string.category_food);
        } else if (position == 2) {
            return context.getString(R.string.category_species);
        } else if (position == 3) {
            return context.getString(R.string.category_activities);
        }
        return null;
    }
}
