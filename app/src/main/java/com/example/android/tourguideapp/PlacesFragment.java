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


public class PlacesFragment extends Fragment {


        public PlacesFragment() {
            // Required empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View rootView = inflater.inflate(R.layout.fragment_places, container, false);

            ArrayList<TourItem> tourItems = new ArrayList<>();

            tourItems.add(new TourItem(getString(R.string.place_name1), getString(R.string.about_kasubi), getString(R.string.place_addr1), R.drawable.kasubitombs));
            tourItems.add(new TourItem(getString(R.string.place_name2), getString(R.string.about_nile), getString(R.string.place_addr2), R.drawable.sourceofthenile));

            ListView listView = (ListView) rootView.findViewById(R.id.places);
            TourAdapter tourAdapter = new TourAdapter(rootView.getContext(), tourItems);
            listView.setAdapter(tourAdapter);

            return rootView;
        }
}
