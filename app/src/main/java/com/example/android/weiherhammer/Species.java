package com.example.android.weiherhammer;

import android.content.Context;
import android.location.Location;

import java.util.List;

/**
 * Created by Paulina on 4/8/2018.
 */

public class Species {
    public static void initShopsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.species_piltze_name),
                context.getString(R.string.species_piltze_description),
                null,
                R.drawable.steinpiltze
        ));

        list.add(new Location(
                context.getString(R.string.species_swan_name),
                context.getString(R.string.species_swan_description),
                null,
                R.drawable.cisne
        ));

        list.add(new Location(
                context.getString(R.string.species_Birch_name),
                context.getString(R.string.species_Birch_description),
                null,
                R.drawable.birke
        ));
    }
}
