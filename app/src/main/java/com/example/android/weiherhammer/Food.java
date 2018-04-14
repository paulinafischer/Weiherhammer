package com.example.android.weiherhammer;

import android.content.Context;
import java.util.List;

/**
 * Created by Paulina on 4/8/2018.
 */

public class Food {
    public static void initFoodsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.food_nahkauf_name),
                context.getString(R.string.food_nahkauf_description),
                context.getString(R.string.food_nahkauf_address),
                context.getString(R.string.food_nahkauf_phone),
                context.getString(R.string.food_nahkauf_schedule),
                context.getString(R.string.food_price),
                R.drawable.nahkauf
        ));

        list.add(new Location(
                context.getString(R.string.food_manuela_name),
                context.getString(R.string.food_manuela_description),
                context.getString(R.string.food_manuela_address),
                context.getString(R.string.food_manuela_phone),
                context.getString(R.string.food_manuela_schedule),
                context.getString(R.string.food_price),
                R.drawable.manuela
        ));

        list.add(new Location(
                context.getString(R.string.food_tapas_name),
                context.getString(R.string.food_tapas_description),
                context.getString(R.string.food_tapas_address),
                context.getString(R.string.food_tapas_phone),
                context.getString(R.string.food_tapas_schedule),
                context.getString(R.string.food_price),
                R.drawable.tapas
        ));
    }
}

