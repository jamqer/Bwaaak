package com.jamqer.bwaaak.bwaaak.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jamqer.bwaaak.bwaaak.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImagesViewFragment extends Fragment {


    public ImagesViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View inputViewFragment = inflater.inflate(R.layout.fragment_images_view, container, false);




        return inputViewFragment;
    }


}
