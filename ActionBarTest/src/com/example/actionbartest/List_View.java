package com.example.actionbartest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class List_View extends ListFragment{
	String[] locations, numbers;
	ListView lv;
	
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.list, container, false);
				
		String[] locations = {"319TRS CQ", "320TRS CQ", "321TRS CQ",
				  "322TRS CQ", "323TRS CQ", "324TRS CQ", 
				  "326TRS CQ", "326TRS CQ", "AAFES BX - NORTH",
				  "AFFES BX - SOUTH", "ACADEMICS", "BAS - MTI",
				  "BAS - TRAINEE", "BASE LOCATOR", "BASE OPERATOR",
				  "BASE TAXI/BUS SHUTTLE","BEAST", "BEST",
				  "BLOOD DONORS", "CAREER GUIDANCE", "CBRNE",
				  "CE SERVICE CALL", "CHAPLAIN (AFTER HOURS)", "CITIZENSHIP",
				  "CLIPPER CUTS", "CLOTHING ISSUE (FEMALE)", "CLOTHING ISSUE (MALE)",
				  "CLOTHING SALES", "COMMAND POST", "COMPUTER HELP DESK (TRG)",
				  "COMPUTERS/NETWORK", "COMPUTERS/TECH DEV", "DOG TAGS",
				  "DRUM & BUGLE HALL", "EDUCATION OFFICER", "FLIGHT PHOTOS",
				  "GUARD/RESERVE LIASON", "HAWC", "ID CARDS (TRAINEE)",
				  "INTERVIEW SESSIONS", "LEGAL OFFICE", "MED/DENTAL",
				  "MTIS", "OBSTACLE COURSE", "OPTOMETRY (TRAINEE)",
				  "RECEPTION CENTER", "RECORD ID", "SCHEDULING",
				  "SENSITIVE SKILLS", "STAN TEAM", "TRAINEE PAY",
				  "URINALYSIS", "CATM", "EMCS",
				  "BMT CURRICULUM"};

final String[] numbers = {"671-2630", "671-2037", "671-2805",
					  "671-4207", "671-3871", "671-0719",
					  "671-2685", "671-2264", "645-1264", 
					  "670-8093", "671-4081", "671-2945",
					  "671-2032", "671-1841", "671-1110",
					  "671-3317", "671-2630", "671-8220",
					  "671-2648", "671-4234", "671-9799",
					  "671-2288", "671-4225", "671-2798",
					  "671-3688", "671-3637", "671-3657",
					  "671-3401", "671-4225", "671-2666",
					  "671-2637", "671-4801", "671-4135",
					  "671-2114", "671-2985", "671-2313",
					  "671-2445", "671-2630", "671-3678",
					  "671-3713", "671-3361", "671-8344",
					  "671-2487", "671-2122", "671-3208",
					  "671-3024", "671-4142", "671-3027",
					  "671-3113", "671-3696", "671-2067",
					  "671-3147", "671-2349", "671-2288",
					  "671-4069"};

			lv = (ListView) rootView.findViewById(android.R.id.list);
			StringArrayAdapter ad = new StringArrayAdapter(locations, numbers,  getActivity());
			lv.setAdapter(ad);
		       lv.setOnItemClickListener(new OnItemClickListener() {
					@Override
					public void onItemClick(AdapterView<?> parent, View view,
							int position, long id) {
						// TODO Auto-generated method stub
						  //Toast.makeText(getActivity(), "Item " + pos + " was clicked", Toast.LENGTH_SHORT).show();
							Intent sIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + numbers[position]));
							startActivity(sIntent);
					}
		        });
       
		return rootView;
				
	}

}
