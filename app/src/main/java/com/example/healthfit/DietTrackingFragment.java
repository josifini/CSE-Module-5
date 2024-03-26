package com.example.healthfit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class DietTrackingFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_diet_tracking, container, false);

        // Example of setting text in a TextView
        TextView textView = view.findViewById(R.id.text_diet_tracking);
        textView.setText("Diet tracking details will be displayed here.");

        return view;
    }
}

