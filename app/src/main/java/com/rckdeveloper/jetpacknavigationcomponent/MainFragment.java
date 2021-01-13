package com.rckdeveloper.jetpacknavigationcomponent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MainFragment extends Fragment {

    Button viewTransaction,sendMoney,viewBalance;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        viewTransaction = view.findViewById(R.id.view_transaction);
        viewTransaction.setOnClickListener(new
                                                   View.OnClickListener() {
                                                       @Override
                                                       public void onClick(View v) {
                                                           Navigation.findNavController(v).navigate(R.id.action_mainFragment_to_transactionFragment);
                                                       }
                                                   });

        sendMoney= view.findViewById(R.id.send_money);
        sendMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_mainFragment_to_recipientFragment);
            }
        });

        viewBalance=view.findViewById(R.id.view_balance);
        viewBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_mainFragment_to_viewBalanceFragment);
            }
        });


        return view;
    }
}