package com.etsoh.etsoh_v2;

import android.support.v4.app.Fragment;

/**
 * Created by aseto on 3/15/17.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class HelpFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragactivity_help, container,false);
        return view;

    }
}