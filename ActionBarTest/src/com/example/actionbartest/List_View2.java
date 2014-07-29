package com.example.actionbartest;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class List_View2 extends ListFragment{
	String[] list_items;
	ListView lv;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.list, container, false);
		
		String[] locations = {"APPOINTMENT LINE", "DISPENSERY B", "DUNN DENTAL CLINIC",
				  "FLIGHT MEDICINE", "IMMUNIZATIONS", "NURSE HOTLINE", 
				  "SHAVING CLINIC", "TRAINEE HEALTH", "WHMC ADMISSIONS", 
				  "WHMC ER","SAMMC INFORMATION", "SAMMC ADMISSIONS", 
				  "SAMMC ER", "SAMMC 6TH FLOOR", "SAMMC 7TH WARD", 
				  "UCC APOINTMENT LINE", "UCC", "WHMC IMMUNIZATIONS", 
				  "RED CROSS", "SARC"};

		final String[] numbers = {"916-9900", "671-2651", "671-9012",
					  "671-9556", "671-9678", "916-9900",
					  "671-2485", "671-9553", "292-5788", 
					  "292-7331", "916-4141", "916-1775",
					  "916-0808", "916-2096", "916-7222",
					  "292-3403", "292-7331", "292-5730",
					  "877-272-7337", "671-7272"};
		
		lv = (ListView) rootView.findViewById(android.R.id.list);
		StringArrayAdapter ad = new StringArrayAdapter(locations, numbers,  getActivity());
		lv.setAdapter(ad);
		
		return rootView;
	}

}
