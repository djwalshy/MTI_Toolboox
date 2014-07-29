package com.example.actionbartest;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.Toast;

public class DrawerLayoutTest extends Activity implements OnChildClickListener {

private DrawerLayout drawer;
private ExpandableListView drawerList;
private ActionBarDrawerToggle actionBarDrawerToggle;
private CharSequence mTitle;

@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_drawer_layout_test);
	
	setGroupData();
	setChildGroupData();

initDrawer();
}

@Override
public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
getMenuInflater().inflate(R.menu.drawer_layout_test, menu);
return true;
}

private void initDrawer() {
drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

drawerList = (ExpandableListView) findViewById(R.id.left_drawer);

drawerList.setAdapter(new NewAdapter(this, groupItem, childItem));

drawerList.setOnChildClickListener(this);

// actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawer,
// R.drawable.ic_drawer, R.string.open_drawer,
// R.string.close_drawer) {
// public void onDrawerClosed(View view) {
// getActionBar().setSubtitle("open");
// }
//
// /** Called when a drawer has settled in a completely open state. */
// public void onDrawerOpened(View drawerView) {
// getActionBar().setSubtitle("close");
// }
//
// };
//
// drawer.setDrawerListener(actionBarDrawerToggle);

}

public void setGroupData() {
groupItem.add("Home");
groupItem.add("Phone Book");
groupItem.add("Heat Stress");
groupItem.add("Regulations");
groupItem.add("WF/HF Calculator");
groupItem.add("Progress Checks");
groupItem.add("Acountability");
groupItem.add("About");
}

ArrayList<String> groupItem = new ArrayList<String>();
ArrayList<Object> childItem = new ArrayList<Object>();

public void setChildGroupData() {
/**
* Add Data For Home
*/
ArrayList<String> child = new ArrayList<String>();
child.add("Test1");
child.add("Test2");
child.add("Test3");
child.add("Test4");
childItem.add(child);

/**
* Add Data For Phone Book
*/
child = new ArrayList<String>();
child.add("Processing");
child.add("Medical");
child.add("737 TRSS");
child.add("320TRS");
child.add("321TRS");
child.add("322TRS");
child.add("323TRS");
child.add("331TRS");
childItem.add(child);
/**
* Add Data For Heat Sress
*/
child = new ArrayList<String>();
child.add("0 WOT");
child.add("1 WOT");
child.add("2 WOT");
child.add("3 WOT");
child.add("4 WOT");
child.add("5 WOT");
child.add("6 WOT");
child.add("7 WOT");
child.add("8 WOT");
childItem.add(child);
/**
* Add Data For Regulations
*/
child = new ArrayList<String>();
child.add("XXXXXXXX");
child.add("XXXXXXXX");
child.add("XXXXXXXX");
child.add("XXXXXXXX");
childItem.add(child);
/**
* Add Data For WF/HF Calculator
*/
child = new ArrayList<String>();
child.add("XXXXXXXX");
child.add("XXXXXXXX");
child.add("XXXXXXXX");
child.add("XXXXXXXX");
childItem.add(child);
/**
* Add Data For Progress Checks
*/
child = new ArrayList<String>();
child.add("XXXXXXXX");
child.add("XXXXXXXX");
child.add("XXXXXXXX");
child.add("XXXXXXXX");
childItem.add(child);
}

@Override
public boolean onChildClick(ExpandableListView parent, View v,
int groupPosition, int childPosition, long id) {
Toast.makeText(this, "Clicked On Child" + v.getTag(),
Toast.LENGTH_SHORT).show();
return true;
}

}