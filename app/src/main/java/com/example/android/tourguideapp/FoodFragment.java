package com.example.android.tourguideapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;




public class FoodFragment extends Fragment {
    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_food, container, false);

        ArrayList<TourItem> tourItems = new ArrayList<>();

        tourItems.add(new TourItem(getString(R.string.food_place1), getString(R.string.about_kfc), getString(R.string.contact), R.drawable.kfc));
        tourItems.add(new TourItem(getString(R.string.food_place2), getString(R.string.about_cafejava), getString(R.string.contact),R.drawable.cafejava));

        ListView listView = (ListView) rootView.findViewById(R.id.food);
        TourAdapter tourAdapter = new TourAdapter(rootView.getContext(), tourItems);
        listView.setAdapter(tourAdapter);

        return rootView;
    }
}
