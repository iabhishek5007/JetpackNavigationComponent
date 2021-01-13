package com.rckdeveloper.jetpacknavigationcomponent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class RecipientFragment extends Fragment {

    Button Send,Cancel;
    EditText editText;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_recipient, container, false);

        Send= view.findViewById(R.id.send);
        Cancel= view.findViewById(R.id.cancel);
        editText= view.findViewById(R.id.editText);

        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavDirections directions= RecipientFragmentDirections.actionRecipientFragmentToSpecifyAmountFragment(editText.getText().toString());
                Navigation.findNavController(v).navigate(directions);
            }
        });

        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigateUp();
            }
        });


        return view;
    }
}