package com.etsoh.etsoh_v2;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

/**
 * Created by aseto on 3/7/17.
 */



public class DiagnosticsFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragactivity_diagnostics, null);
    }

}
