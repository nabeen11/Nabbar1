package com.example.nabbar.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nabbar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class UpdateCourseFragment extends Fragment {


    public UpdateCourseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_update_course, container, false);
    }

}
