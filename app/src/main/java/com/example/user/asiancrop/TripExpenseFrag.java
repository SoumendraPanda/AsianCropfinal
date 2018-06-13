package com.example.user.asiancrop;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class TripExpenseFrag extends Fragment {
    ImageButton bt1;
    ImageButton bt2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tripexpense, container, false);
        ImageButton bt1=view.findViewById(R.id.expense);
        ImageButton bt2=view.findViewById(R.id.order);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return view;
    }



}
