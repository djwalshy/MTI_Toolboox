package com.example.actionbartest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class List_View3 extends ListFragment{
	String[] list_items;
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

	@Override
	public void onListItemClick(ListView l, View v, int pos, long id) {
	  super.onListItemClick(l, v, pos, id);
	  Toast.makeText(getActivity(), "Item " + pos + " was clicked", Toast.LENGTH_SHORT).show();
		Intent sIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + pos));
		startActivity(sIntent);
	}

}
