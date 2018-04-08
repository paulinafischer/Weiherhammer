package com.example.android.weiherhammer;

import android.content.Context;
import android.location.Location;

import java.util.List;

/**
 * Created by Paulina on 4/8/2018.
 */

public class Places {
    public static void initSightsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.place_lake_name),
                context.getString(R.string.place_lake_description),
                context.getString(R.string.place_lake_address),
                R.drawable.lake
        ));

        list.add(new Location(
                context.getString(R.string.place_fishing_name),
                context.getString(R.string.place_fishing_description),
                R.drawable.angeln
        ));

        list.add(new Location(
                context.getString(R.string.place_hunting_name),
                context.getString(R.string.place_hunting_description),
                R.drawable.jagen
        ));
    }
}
