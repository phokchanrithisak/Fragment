package com.example.phokchanrithisak.fragmentattempt1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Fragment fgmt;
    public void fragmentOne(View view){
        fgmt = new FragmentOne();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frag, fgmt);
        ft.commit();
    }
    public void fragmentTwo(View view){
        fgmt = new FragmentTwo();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frag, fgmt);
        ft.commit();
    }
    public void fragmentThree(View view){
        fgmt = new FragmentThree();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.anotherFrag, fgmt);
        ft.commit();
    }
    public void fragmentFour (View view){
        fgmt = new FragmentFour();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.anotherFrag, fgmt);
        ft.commit();
    }
}
