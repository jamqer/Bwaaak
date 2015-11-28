package com.jamqer.bwaaak.bwaaak.Animations;

import android.content.Context;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.jamqer.bwaaak.bwaaak.R;

/**
 * Created by Piotras on 2015-11-27.
 */
public class RotateLayoutObject {

    public void rotateObject(Context context, ImageView imageView){

        Animation rotation = AnimationUtils.loadAnimation(context, R.anim.rotate_centre);
        rotation.setRepeatCount(Animation.INFINITE);
        imageView.startAnimation(rotation);

    }
}
