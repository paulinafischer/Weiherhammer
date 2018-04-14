package com.example.android.weiherhammer;

import android.content.Context;


import java.util.List;

/**
 * Created by Paulina on 4/8/2018.
 */

public class Species {
    public static void initSpeciesList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.species_piltze_name),
                context.getString(R.string.species_piltze_description),
                null,
                 null,
                null,
                null,
                R.drawable.steinpiltze

        ));

        list.add(new Location(
                context.getString(R.string.species_swan_name),
                context.getString(R.string.species_swan_description),
                null,
                null,
                null,
                null,
                R.drawable.cisne
                ));

        list.add(new Location(
                context.getString(R.string.species_Birch_name),
                context.getString(R.string.species_Birch_description),
                null,
                null,
                null,
                null,
                R.drawable.birke
        ));
    }
}
