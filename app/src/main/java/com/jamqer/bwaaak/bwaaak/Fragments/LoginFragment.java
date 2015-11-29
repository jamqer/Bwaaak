package com.jamqer.bwaaak.bwaaak.Fragments;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.jamqer.bwaaak.bwaaak.Animations.RotateLayoutObject;
import com.jamqer.bwaaak.bwaaak.R;
import com.jamqer.bwaaak.bwaaak.Services.FetchPicturesForServices;


import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    @Bind(R.id.imageViewLogo) ImageView mImageViewLogo;

    public LoginFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View viewFragment = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this, viewFragment);

        return viewFragment;
    }

    @OnClick(R.id.buttonSignIn)
    public void signInListener(){

        new RotateLayoutObject()
                .rotateObject(getActivity(), mImageViewLogo);

        new FetchPicturesForServices().fetchPictures();

        /*
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, new ImagesViewFragment())
                .addToBackStack(null)
                .commit();
                */
    }

    @Override
    public void onResume(){
        super.onResume();

    }
}
