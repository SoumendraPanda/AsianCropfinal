package com.example.user.asiancrop;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

public class EmployeeFrag extends Fragment {
    private DrawerLayout dl;
    private Toolbar mToolbar;
    private ActionBarDrawerToggle mDrawerToggle;
    private NavigationView navigationView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.employee, container, false);
        mDrawerToggle.setDrawerIndicatorEnabled(true);
        android.support.v7.widget.Toolbar myToolbar = (android.support.v7.widget.Toolbar) view.findViewById(R.id.toolbar);
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(myToolbar);
        dl = (DrawerLayout) view.findViewById(R.id.drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(
                getActivity(), dl, R.string.open, R.string.close);
        dl.addDrawerListener(mDrawerToggle);
        // Where do I put this?
        mDrawerToggle.syncState();
        NavigationView nav_view = (NavigationView) view.findViewById(R.id.nav_view);
        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.dashboard:
                        FragmentManager fmm = getFragmentManager();
                        FragmentTransaction ftt = fmm.beginTransaction();
                        ftt.add(R.id.fl1, new trip());
                        ftt.commit();

                }


                return false;
            }
        });
        return view;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return mDrawerToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
}








