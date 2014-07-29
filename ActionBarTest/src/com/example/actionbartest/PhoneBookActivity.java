package com.example.actionbartest;

import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class PhoneBookActivity extends FragmentActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
 
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        
        /** Getting fragment manager */
        FragmentManager fm = getSupportFragmentManager();
 
        /** Instantiating FragmentPagerAdapter */
        TabFragmentPagerAdapter pagerAdapter = new TabFragmentPagerAdapter(fm);
 
        /** Setting the pagerAdapter to the pager object */
        pager.setAdapter(pagerAdapter);
        
 	}
}
