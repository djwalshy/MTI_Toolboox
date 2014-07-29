package com.example.actionbartest;

import java.util.ArrayList;
import java.util.List; 

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
 
public class MainActivity extends Activity {
 
      private DrawerLayout mDrawerLayout;
      private ListView mDrawerList;
      private ActionBarDrawerToggle mDrawerToggle;
 
      private CharSequence mDrawerTitle;
      private CharSequence mTitle;
      CustomDrawerAdapter adapter;
 
      List<DrawerItem> dataList;
 
      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
 
            // Initializing
            dataList = new ArrayList<DrawerItem>();
            mTitle = mDrawerTitle = getTitle();
            mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
            mDrawerList = (ListView) findViewById(R.id.left_drawer);
 
            mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
                        GravityCompat.START);
 
            // Add Drawer Item to dataList
            dataList.add(new DrawerItem("Home", R.drawable.ic_action_email)); // Case 0
            dataList.add(new DrawerItem("Phonebook", R.drawable.ic_action_email)); // Case 1
            dataList.add(new DrawerItem("Heat Stress", R.drawable.ic_action_good));  // Case 2
            dataList.add(new DrawerItem("Regulations", R.drawable.ic_action_gamepad)); // Case 3
            dataList.add(new DrawerItem("WF/HF Calculator", R.drawable.ic_action_labels));  // Case 4
            dataList.add(new DrawerItem("Progress Checks", R.drawable.ic_action_search)); // Case 5
            dataList.add(new DrawerItem("TEST TABS", R.drawable.ic_action_cloud)); // Case 6
            dataList.add(new DrawerItem("WAS", R.drawable.ic_action_camera)); // Case 7
            dataList.add(new DrawerItem("Dorm", R.drawable.ic_action_video)); // Case 8
            dataList.add(new DrawerItem("Drill", R.drawable.ic_action_group)); // Case 9
            dataList.add(new DrawerItem("Accountability",
                        R.drawable.ic_action_import_export)); // Case 10
            dataList.add(new DrawerItem("About", R.drawable.ic_action_about)); // Case 11
            dataList.add(new DrawerItem("Settings", R.drawable.ic_action_settings)); // Case 12
            dataList.add(new DrawerItem("Help", R.drawable.ic_action_help)); // Case 13
 
            adapter = new CustomDrawerAdapter(this, R.layout.custom_drawer_item,
                        dataList);
 
            mDrawerList.setAdapter(adapter);
 
            mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
 
            getActionBar().setDisplayHomeAsUpEnabled(true);
            getActionBar().setHomeButtonEnabled(true);
 
            mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                        R.drawable.ic_drawer, R.string.drawer_open,
                        R.string.drawer_close) {
                  public void onDrawerClosed(View view) {
                        getActionBar().setTitle(mTitle);
                        invalidateOptionsMenu(); // creates call to
                                                                  // onPrepareOptionsMenu()
                  }
 
                  public void onDrawerOpened(View drawerView) {
                        getActionBar().setTitle(mDrawerTitle);
                        invalidateOptionsMenu(); // creates call to
                                                                  // onPrepareOptionsMenu()
                  }
            };
 
            mDrawerLayout.setDrawerListener(mDrawerToggle);
 
            if (savedInstanceState == null) {
                  SelectItem(0);
            }
 
      }
 
      @Override
      public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
      }
 
      public void SelectItem(int possition) {
 
            Fragment fragment = null;
            Intent intent = null;
            Bundle args = new Bundle();
            switch (possition) {
            case 0:
                  fragment = new FragmentOne();
                  args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
                              .getItemName());
                  args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
                              .getImgResID());
                  break;
            case 1:
            	  break;
            case 2:
                  fragment = new FragmentThree();
                  break;
            case 3:
                  fragment = new FragmentFour();
                  args.putString(FragmentFour.ITEM_NAME, dataList.get(possition)
                              .getItemName());
                  args.putInt(FragmentFour.IMAGE_RESOURCE_ID, dataList.get(possition)
                              .getImgResID());
                  break;
            case 4:
            	 fragment = new FragmentFour();
                  break;
            case 5:
                  fragment = new FragmentSix();
                  args.putString(FragmentSix.ITEM_NAME, dataList.get(possition)
                              .getItemName());
                  args.putInt(FragmentSix.IMAGE_RESOURCE_ID, dataList.get(possition)
                              .getImgResID());
                  break;
            case 6:
                  fragment = new FragmentSeven();        

                 break;
            case 7:
                  fragment = new FragmentEight();
                  args.putString(FragmentEight.ITEM_NAME, dataList.get(possition)
                              .getItemName());
                  args.putInt(FragmentEight.IMAGE_RESOURCE_ID, dataList.get(possition)
                              .getImgResID());
                  break;
            case 8:
                  fragment = new FragmentNine();
                  args.putString(FragmentNine.ITEM_NAME, dataList.get(possition)
                              .getItemName());
                  args.putInt(FragmentNine.IMAGE_RESOURCE_ID, dataList.get(possition)
                              .getImgResID());
                  break;
            case 9:
                  fragment = new FragmentTen();
                  args.putString(FragmentTen.ITEM_NAME, dataList.get(possition)
                              .getItemName());
                  args.putInt(FragmentTen.IMAGE_RESOURCE_ID, dataList.get(possition)
                              .getImgResID());
                  break;
            case 10:
                  fragment = new FragmentEleven();
                  args.putString(FragmentEleven.ITEM_NAME, dataList.get(possition)
                              .getItemName());
                  args.putInt(FragmentEleven.IMAGE_RESOURCE_ID, dataList.get(possition)
                              .getImgResID());
                  break;
            case 11:
                  fragment = new FragmentTwelve();
                  args.putString(FragmentTwelve.ITEM_NAME, dataList.get(possition)
                              .getItemName());
                  args.putInt(FragmentTwelve.IMAGE_RESOURCE_ID, dataList.get(possition)
                              .getImgResID());
                  break;
            case 12:
                  fragment = new FragmentThirteen();
                  args.putString(FragmentThirteen.ITEM_NAME, dataList.get(possition)
                              .getItemName());
                  args.putInt(FragmentThirteen.IMAGE_RESOURCE_ID, dataList.get(possition)
                              .getImgResID());
                  break;
            case 13:
                fragment = new FragmentFourteen();
                args.putString(FragmentFourteen.ITEM_NAME, dataList.get(possition)
                            .getItemName());
                args.putInt(FragmentFourteen.IMAGE_RESOURCE_ID, dataList.get(possition)
                            .getImgResID());
                break;
            default:
                  break;
            }
 
            fragment.setArguments(args);
            FragmentManager frgManager = getFragmentManager();
            frgManager.beginTransaction().replace(R.id.content_frame, fragment)
                        .commit();
 
            mDrawerList.setItemChecked(possition, true);
            setTitle(dataList.get(possition).getItemName());
            mDrawerLayout.closeDrawer(mDrawerList);
 
      }
 
	@Override
      public void setTitle(CharSequence title) {
            mTitle = title;
            getActionBar().setTitle(mTitle);
      }
 
      @Override
      protected void onPostCreate(Bundle savedInstanceState) {
            super.onPostCreate(savedInstanceState);
            // Sync the toggle state after onRestoreInstanceState has occurred.
            mDrawerToggle.syncState();
      }
 
      @Override
      public void onConfigurationChanged(Configuration newConfig) {
            super.onConfigurationChanged(newConfig);
            // Pass any configuration change to the drawer toggles
            mDrawerToggle.onConfigurationChanged(newConfig);
      }
 
      @Override
      public boolean onOptionsItemSelected(MenuItem item) {
            // The action bar home/up action should open or close the drawer.
            // ActionBarDrawerToggle will take care of this.
            if (mDrawerToggle.onOptionsItemSelected(item)) {
                  return true;
            }
 
            return false;
      }
 
        private class DrawerItemClickListener implements
                  ListView.OnItemClickListener {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                        long id) {
            	if (position == 1) {
                	Intent a = new Intent(MainActivity.this, PhoneBookFragment.class);
                    startActivity(a);
            	} else {
            	SelectItem(position);
            	}
            	
            }
      }
 
}