package com.example.actionbartest;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class List_View7 extends ListFragment{
ListView lv;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.list, container, false);
				
		String[] locations = {"XXXXXXX", "XXXXXXX", "XXXXXXX"};

		final String[] numbers = {"555-555", "555-555", "555-555"};
		
		lv = (ListView) rootView.findViewById(android.R.id.list);
		StringArrayAdapter ad = new StringArrayAdapter(locations, numbers,  getActivity());
		lv.setAdapter(ad);
		
		return rootView;
	}

}
