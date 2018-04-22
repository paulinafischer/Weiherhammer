package com.example.android.weiherhammer;

import android.content.Context;
import java.util.List;

/**
 * Created by Paulina on 4/8/2018.
 */

public class Places {
    public static void initPlacesList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.place_lake_name),
                context.getString(R.string.place_lake_description),
                null,
                null,
                context.getString(R.string.place_lake_schedule),
                context.getString(R.string.price),
                R.drawable.lake
        ));

        list.add(new Location(
                context.getString(R.string.place_bhs_name),
                context.getString(R.string.place_bhs_description),
                context.getString(R.string.place_bhs_address),
                context.getString(R.string.place_bhs_phone),
                context.getString(R.string.place_bhs_schedule),
                context.getString(R.string.price),
                R.drawable.bhs
        ));

        list.add(new Location(
                context.getString(R.string.place_kirche_name),
                context.getString(R.string.place_kirche_description),
                context.getString(R.string.place_kirche_address),
                context.getString(R.string.place_kirche_phone),
                context.getString(R.string.place_kirche_schedule),
                context.getString(R.string.price),
                R.drawable.kirche
        ));
        list.add(new Location(
                context.getString(R.string.place_platz_name),
                context.getString(R.string.place_platz_description),
                context.getString(R.string.place_platz_address),
                context.getString(R.string.place_platz_phone),
                context.getString(R.string.place_platz_schedule),
                context.getString(R.string.price),
                R.drawable.spielplatz
        ));
    }
}
