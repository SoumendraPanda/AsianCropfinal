package com.example.user.asiancrop;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class trip extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.trip, container, false);
        String values ="travel";
        final Spinner sp=view.findViewById(R.id.sp);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.travel,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                if (sp.getSelectedItem().toString() == "SELECT") {
                    Toast.makeText(getActivity(), "Select below options", Toast.LENGTH_LONG).show();
                }
                if (sp.getSelectedItem().toString() == "BUS/TRAIN") {
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.add(R.id.fl1, new bustrainformfrag());
                    ft.commit();
                }
                if (sp.getSelectedItem().toString() == "SELF") {
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.add(R.id.fl1, new selffrag());

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        return view;

        }

}

