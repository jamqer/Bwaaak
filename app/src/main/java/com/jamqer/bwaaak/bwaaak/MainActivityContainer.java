package com.jamqer.bwaaak.bwaaak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jamqer.bwaaak.bwaaak.Fragments.LoginFragment;


public class MainActivityContainer extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_main_activity);

        if (savedInstanceState == null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragmentContainer, new LoginFragment())
                    .commit();

        }
    }

    @Override
    public void onBackPressed() {
            if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
                this.finish();
            } else {
                getSupportFragmentManager().popBackStack();
            }
        }

}
