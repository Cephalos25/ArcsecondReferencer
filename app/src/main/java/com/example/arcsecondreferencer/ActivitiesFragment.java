package com.example.arcsecondreferencer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class ActivitiesFragment extends Fragment {

    Button buttonGetActivities;
    EditText specificActivity;
    Button buttonFindActivities;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_activities, container);

        buttonGetActivities = rootView.findViewById(R.id.button_activities_get);
        specificActivity = rootView.findViewById(R.id.editText_activities_individual);
        buttonFindActivities = rootView.findViewById(R.id.button_activities_find);

        setListeners();

        return rootView;
    }

    private void setListeners() {
        buttonGetActivities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
