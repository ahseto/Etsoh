package com.etsoh.etsoh_v2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by aseto on 3/31/17.
 */

public class VehiclesFragment extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragactivity_myvehicles, container, false);

        Button addbutton = (Button) view.findViewById(R.id.newVehicle);
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AddvehicleActivity.class);
                startActivity(intent);
            }
            });

        return view;
    }

    @Override
    public void onClick(View view) {

    }
}
