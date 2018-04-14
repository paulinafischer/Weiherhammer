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
                context.getString(R.string.place_fishing_name),
                context.getString(R.string.place_fishing_description),
                null,
                null,
                context.getString(R.string.place_fishing_schedule),
                context.getString(R.string.price),
                R.drawable.angeln
        ));

        list.add(new Location(
                context.getString(R.string.place_photography_name),
                context.getString(R.string.place_photography_description),
                null,
              null,
                context.getString(R.string.place_photography_schedule),
                context.getString(R.string.price),
                R.drawable.weiherhammer
        ));
    }
}
