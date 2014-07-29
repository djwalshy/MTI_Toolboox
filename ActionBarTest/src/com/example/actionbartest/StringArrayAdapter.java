package com.example.actionbartest;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class StringArrayAdapter extends BaseAdapter {

	String names[];
	String locations[];
	Context ctxt;
	LayoutInflater myInflater;
	
	public StringArrayAdapter(String[] err, String[] err2, Context c){
		names = err;
		locations = err2;
		ctxt = c;
		myInflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return names.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return names[arg0];
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		if(arg1==null)
			arg1 = myInflater.inflate(android.R.layout.simple_list_item_2, arg2, false);
		TextView name = (TextView)arg1.findViewById(android.R.id.text1);
		name.setTextSize(25);
		//name.setTextColor(Color.parseColor("#FFFFFF"));
		name.setText(names[arg0]);
		TextView name2 = (TextView)arg1.findViewById(android.R.id.text2);
		name2.setTextSize(15);
		name2.setText(locations[arg0]);
		return arg1;
		
	}

}
