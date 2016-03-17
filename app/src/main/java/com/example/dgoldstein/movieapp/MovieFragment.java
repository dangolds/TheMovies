package com.example.dgoldstein.movieapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

/**
 * Created by dgoldstein on 17-Mar-16.
 */
public class MovieFragment extends Fragment {


    public MovieFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.moviefragment);
    }
}
