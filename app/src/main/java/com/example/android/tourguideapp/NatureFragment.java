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


public class NatureFragment extends Fragment {
    public NatureFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_nature, container, false);

        ArrayList<TourItem> tourItems = new ArrayList<>();

        tourItems.add(new TourItem(getString(R.string.nature_name1), getString(R.string.about_nile), getString(R.string.nature_addr1), R.drawable.sourceofthenile));
        tourItems.add(new TourItem(getString(R.string.nature_name12), getString(R.string.about_ssese), getString(R.string.nature_addr2),R.drawable.ssese));

        ListView listView = (ListView) rootView.findViewById(R.id.nature);
        TourAdapter tourAdapter = new TourAdapter(rootView.getContext(), tourItems);
        listView.setAdapter(tourAdapter);

        return rootView;
    }
}
