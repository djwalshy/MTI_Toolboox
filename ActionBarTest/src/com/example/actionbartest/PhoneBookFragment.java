package com.example.actionbartest;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class PhoneBookFragment extends FragmentActivity {
	private ViewPager pager;
	private TabsAdapter mTabsAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		pager = new ViewPager(this);
		pager.setId(R.id.pager);
		setContentView(pager);
		
		final ActionBar bar = getActionBar();
		bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		mTabsAdapter = new TabsAdapter(this, pager);
		mTabsAdapter.addTab(bar.newTab().setText("Processing"), List_View.class, null);
		mTabsAdapter.addTab(bar.newTab().setText("Medical"), List_View2.class, null);
		mTabsAdapter.addTab(bar.newTab().setText("737 TRSS"), List_View3.class, null);
		mTabsAdapter.addTab(bar.newTab().setText("320 TRS"), List_View4.class, null);
		mTabsAdapter.addTab(bar.newTab().setText("321 TRS"), List_View5.class, null);
		mTabsAdapter.addTab(bar.newTab().setText("322 TRS"), List_View6.class, null);
		mTabsAdapter.addTab(bar.newTab().setText("323 TRS"), List_View7.class, null);
		mTabsAdapter.addTab(bar.newTab().setText("326 TRS"), List_View8.class, null);
		mTabsAdapter.addTab(bar.newTab().setText("331 TRS"), List_View9.class, null);
	}
}
