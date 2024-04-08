package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import java.util.Objects;


public class top_row extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_top_row, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        // Finding views
        ImageView backArrowImageView = view.findViewById(R.id.backArrowImageView);
        TextView titleTextView = view.findViewById(R.id.titleTextView);
        CardView tab1CardView = view.findViewById(R.id.tab1);
        CardView tab2CardView = view.findViewById(R.id.tab2);


        backArrowImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {


                requireActivity().onBackPressed();
            }
        });

        //Setting click listener for Tab 1 CardView
        tab1CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2)
            {

                Fragment currentFragment = getActivity().getSupportFragmentManager().findFragmentById(R.id.botframe);


                Fragment desiredFragment = new BlankFragment_1();


                if (currentFragment != null && !currentFragment.getClass().equals(desiredFragment.getClass()))
                {

                    getActivity().getSupportFragmentManager().beginTransaction()
                            .replace(R.id.botframe, desiredFragment)
                            .commit();
                }
            }

        });

        // Setting click listener for Tab 2 CardView
        tab2CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment currentFragment = getActivity().getSupportFragmentManager().findFragmentById(R.id.botframe);


                Fragment desiredFragment = new BlankFragment_2();


                if (currentFragment != null && !currentFragment.getClass().equals(desiredFragment.getClass()))
                {
                    //replacing the current fragment with the desired fragment
                    getActivity().getSupportFragmentManager().beginTransaction()
                            .replace(R.id.botframe, desiredFragment)
                            .commit();
                }
            }
        });


    }
}


