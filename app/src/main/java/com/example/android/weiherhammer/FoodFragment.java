package com.example.android.weiherhammer;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */

public class FoodFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<Location> list = new ArrayList<>();
        Food.initFoodsList(list, getContext());

        Location_Adapter adapter = new Location_Adapter(getActivity(), -1, list);
        View view = inflater.inflate(R.layout.location_list, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listView);

        listView.setAdapter((ListAdapter) adapter);

        return view;
    }
}
