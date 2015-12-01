package com.jamqer.bwaaak.bwaaak.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jamqer.bwaaak.bwaaak.Adapters.MyRecyclerAdapter;
import com.jamqer.bwaaak.bwaaak.R;

import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImagesViewFragment extends Fragment {


    private RecyclerView mRecyclerView;
    private MyRecyclerAdapter adapter;

    public ImagesViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View inputViewFragment = inflater.inflate(R.layout.fragment_images_view, container, false);

        ButterKnife.bind(this,inputViewFragment);


        mRecyclerView = (RecyclerView) inputViewFragment.findViewById(R.id.recycler_view);


        new FetchPicturesForServices().fetchPictures(mRecyclerView);


        return inputViewFragment;
    }


}
