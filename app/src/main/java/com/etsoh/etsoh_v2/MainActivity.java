package com.etsoh.etsoh_v2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    DrawerLayout mDLayout;
    NavigationView nView;
    FragmentManager mFragManager;
    FragmentTransaction mFragTransaction;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        nView = (NavigationView) findViewById(R.id.shtuffs);

        mFragManager = getSupportFragmentManager();
        mFragTransaction = mFragManager.beginTransaction();
        mFragTransaction.replace(R.id.containerView, new TabFragment()).commit();
        /**
         * Setup click events on the Navigation View Items.
         */

        nView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDLayout.closeDrawers();

                if (menuItem.getItemId() == R.id.mSettings) {
                    FragmentTransaction fragmentTransaction = mFragManager.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView, new SettingsFragment()).commit();

                }

                if (menuItem.getItemId() == R.id.mHelp) {
                    FragmentTransaction xfragmentTransaction = mFragManager.beginTransaction();
                    xfragmentTransaction.replace(R.id.containerView, new HelpFragment()).commit();
                }

                if (menuItem.getItemId() == R.id.mHome) {
                    FragmentTransaction fragmentTransaction =mFragManager.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView, new TabFragment()).commit();
                }

                if (menuItem.getItemId() == R.id.mVehicles) {
                    FragmentTransaction fragmentTransaction = mFragManager.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView, new VehiclesFragment()).commit();
                }
                return false;
            }

        });

        /**
         * Setup Drawer Toggle of the Toolbar
         */

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this, mDLayout, toolbar, R.string.app_name,
            R.string.app_name);

        mDLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();

        //Button button1 = (Button) findViewById(R.id.newVehicle);
        //button1.setOnClickListener(onClickListener);
    }


    //View.OnClickListener onClickListener = new View.OnClickListener() {
        //@Override
        //public void onClick(View view) {
            //switch(view.getId()) {
            //    case R.id.newVehicle:
            //        Intent intent = new Intent(MainActivity.this, AddvehicleActivity.class);
            //        startActivity(intent);
            //}
        //}
    //};
}