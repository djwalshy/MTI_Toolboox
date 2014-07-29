package com.example.actionbartest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class List_View4 extends ListFragment{
	ListView lv;
	
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.list, container, false);
		String[] locations = {"COMMANDER", "DO", "SQ SUP",
				  "1ST SGT", "MDC", "CHAPLIN", 
				  "TRAINING NCO", "PT SUPPLY", "CQ", 
				  "UPC", "DFAC", "SEC 1 FLT CC", 
				  "SEC 1 IS", "SEC 2 FLT CC", "SEC 2 IS", 
				  "SEC 3 FLT CC", "SEC 3 IS", "SEC 4 FLT CC", 
				  "SEC 4 IS"};

		final String[] numbers = {"671-2030", "671-3839", "671-0942",
					  "671-1888", "671-0903", "671-5195",
					  "671-4938", "671-5414", "671-2037", 
					  "671-2237", "671-2293", "671-2242",
					  "671-4853", "671-4777", "671-2263",
					  "671-", "671-", "671-4793",
					  "671-"};

		lv = (ListView) rootView.findViewById(android.R.id.list);
		StringArrayAdapter ad = new StringArrayAdapter(locations, numbers,  getActivity());
		lv.setAdapter(ad);

		lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {  
			public void onItemClick(AdapterView parentView, View childView, int position, long id) {  
				Intent sIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + numbers[position]));
				startActivity(sIntent);
       
 }

}); 
            
		
		return rootView;
	}

}

