package com.rckdeveloper.jetpacknavigationcomponent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ConfirmationFragment extends Fragment {

    TextView Amount,Name;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_confirmation, container, false);
        Amount= view.findViewById(R.id.amount);
        Name=view.findViewById(R.id.name);


        Amount.setText(ConfirmationFragmentArgs.fromBundle(getArguments()).getAmount());
        Name.setText(ConfirmationFragmentArgs.fromBundle(getArguments()).getName());

        return view;
    }
}