package com.example.actionbartest;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
 
public class FragmentThree extends Fragment {
   
      public FragmentThree() {
 
      }
 
      @Override
      public View onCreateView(LayoutInflater inflater, ViewGroup container,
                  Bundle savedInstanceState) {
 
            View view = inflater.inflate(R.layout.fragment_layout_three, container,
                        false);
 
            Button button = (Button) view.findViewById(R.id.btnUnAcclimatized);
            Fragment fragment = null;
            Bundle args = new Bundle();
            
            button.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    // here you set what you want to do when user clicks your button,
                    // e.g. launch a new activity
                	Fragment fragment = null;
                	  fragment = new FragmentUnacclimatized(); 
                	  getFragmentManager().beginTransaction()
                	             .replace(R.id.content_frame, fragment ).commit();
                	  }
            });
             
            fragment.setArguments(args);
            FragmentManager frgManager = getFragmentManager();
            frgManager.beginTransaction().replace(R.id.content_frame, fragment)
                        .commit();
               
            
            return view;
      }
      
}
