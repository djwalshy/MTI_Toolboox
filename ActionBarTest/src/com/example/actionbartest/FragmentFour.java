package com.example.actionbartest;

import java.io.File;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
 
public class FragmentFour extends Fragment {
 
      ImageView ivIcon;
      TextView tvItemName;
 
      public static final String IMAGE_RESOURCE_ID = "iconResourceID";
      public static final String ITEM_NAME = "itemName";
 
      public FragmentFour() {
 
      }
 
      @Override
      public View onCreateView(LayoutInflater inflater, ViewGroup container,
                  Bundle savedInstanceState) {
 
            View view = inflater.inflate(R.layout.fragment_layout_four, container,
                        false);
 
            ivIcon = (ImageView) view.findViewById(R.id.frag1_icon);
            tvItemName = (TextView) view.findViewById(R.id.frag1_text);
 
            tvItemName.setText(getArguments().getString(ITEM_NAME));
            ivIcon.setImageDrawable(view.getResources().getDrawable(
                        getArguments().getInt(IMAGE_RESOURCE_ID)));
            
            
		//Code for handling the 363 button
		Button Button363 = (Button) view.findViewById(R.id.btn363);
	    Button363.setOnClickListener(new View.OnClickListener()
	    { 
	    	@Override
	        public void onClick(View v) 
	        
	        {
	            File pdfFile = new File(Environment.getExternalStorageDirectory().getPath(), "36-3.pdf");
	            if(pdfFile.exists()) 
	            {
	                Uri path = Uri.fromFile(pdfFile); 
	                Intent pdfIntent = new Intent(Intent.ACTION_VIEW);
	                pdfIntent.setDataAndType(path, "application/pdf");
	                pdfIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

	                try
	                {
	                    startActivity(pdfIntent);
	                }
	                catch(ActivityNotFoundException e)
	                {
	                    Toast.makeText(getActivity(), "No Application available to view pdf", Toast.LENGTH_LONG).show(); 
	                }
	            } 
	        }
	    });
		//End of 362 Button Code
	    
		//Code for handling the 362 button
		Button Button362 = (Button) view.findViewById(R.id.btn362);
	    Button362.setOnClickListener(new View.OnClickListener()
	    { 
	    	@Override
	        public void onClick(View v) 
	        
	        {
	            File pdfFile = new File(Environment.getExternalStorageDirectory().getPath(), "36-2.pdf");
	            if(pdfFile.exists()) 
	            {
	                Uri path = Uri.fromFile(pdfFile); 
	                Intent pdfIntent = new Intent(Intent.ACTION_VIEW);
	                pdfIntent.setDataAndType(path, "application/pdf");
	                pdfIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

	                try
	                {
	                    startActivity(pdfIntent);
	                }
	                catch(ActivityNotFoundException e)
	                {
	                    Toast.makeText(getActivity(), "No Application available to view pdf", Toast.LENGTH_LONG).show(); 
	                }
	            } else {
	            	Toast.makeText(getActivity(), "36-2 not found", Toast.LENGTH_LONG).show();
	            }
	        }
	    });
		//End of 36-03 Button Code
	    
		//Code for handling the 3603 button
		Button Button3603 = (Button) view.findViewById(R.id.btn3603);
	    Button3603.setOnClickListener(new View.OnClickListener()
	    { 
	    	@Override
	        public void onClick(View v) 
	        
	        {
	            File pdfFile = new File(Environment.getExternalStorageDirectory().getPath(), "36-03.pdf");
	            if(pdfFile.exists()) 
	            {
	                Uri path = Uri.fromFile(pdfFile); 
	                Intent pdfIntent = new Intent(Intent.ACTION_VIEW);
	                pdfIntent.setDataAndType(path, "application/pdf");
	                pdfIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

	                try
	                {
	                    startActivity(pdfIntent);
	                }
	                catch(ActivityNotFoundException e)
	                {
	                    Toast.makeText(getActivity(), "No Application available to view pdf", Toast.LENGTH_LONG).show(); 
	                }
	            } else {
	            	Toast.makeText(getActivity(), "36-03 not found", Toast.LENGTH_LONG).show();
	            }
	        }
	    });
		//End of 36-03 Button Code
	    
		//Code for handling the 362905 button
		Button Button362905 = (Button) view.findViewById(R.id.btn362905);
	    Button362905.setOnClickListener(new View.OnClickListener()
	    { 
	    	@Override
	        public void onClick(View v) 
	        
	        {
	            File pdfFile = new File(Environment.getExternalStorageDirectory().getPath(), "36-2905.pdf");
	            if(pdfFile.exists()) 
	            {
	                Uri path = Uri.fromFile(pdfFile); 
	                Intent pdfIntent = new Intent(Intent.ACTION_VIEW);
	                pdfIntent.setDataAndType(path, "application/pdf");
	                pdfIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

	                try
	                {
	                    startActivity(pdfIntent);
	                }
	                catch(ActivityNotFoundException e)
	                {
	                    Toast.makeText(getActivity(), "No Application available to view pdf", Toast.LENGTH_LONG).show(); 
	                }
	            } else {
	            	Toast.makeText(getActivity(), "36-2905 not found", Toast.LENGTH_LONG).show();
	            }
	        }
	    });
		//End of 362905 Button Code
	    
		//Code for handling the BA Book button
		Button ButtonBA = (Button) view.findViewById(R.id.btnBA);
	    ButtonBA.setOnClickListener(new View.OnClickListener()
	    { 
	    	@Override
	        public void onClick(View v) 
	        
	        {
	            File pdfFile = new File(Environment.getExternalStorageDirectory().getPath(), "BA_Book.pdf");
	            if(pdfFile.exists()) 
	            {
	                Uri path = Uri.fromFile(pdfFile); 
	                Intent pdfIntent = new Intent(Intent.ACTION_VIEW);
	                pdfIntent.setDataAndType(path, "application/pdf");
	                pdfIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

	                try
	                {
	                    startActivity(pdfIntent);
	                }
	                catch(ActivityNotFoundException e)
	                {
	                    Toast.makeText(getActivity(), "No Application available to view pdf", Toast.LENGTH_LONG).show(); 
	                }
	            } else {
	            	Toast.makeText(getActivity(), "BA Book not found", Toast.LENGTH_LONG).show();
	            } 
	        }
	    });
		//End of BA Book Button Code
	    
		//Code for handling the BMTSG button
		Button ButtonBMTSG = (Button) view.findViewById(R.id.btnBMTSG);
	    ButtonBMTSG.setOnClickListener(new View.OnClickListener()
	    { 
	    	@Override
	        public void onClick(View v) 
	        
	        {
	            File pdfFile = new File(Environment.getExternalStorageDirectory().getPath(), "BMTSG.pdf");
	            if(pdfFile.exists()) 
	            {
	                Uri path = Uri.fromFile(pdfFile); 
	                Intent pdfIntent = new Intent(Intent.ACTION_VIEW);
	                pdfIntent.setDataAndType(path, "application/pdf");
	                pdfIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

	                try
	                {
	                    startActivity(pdfIntent);
	                }
	                catch(ActivityNotFoundException e)
	                {
	                    Toast.makeText(getActivity(), "No Application available to view pdf", Toast.LENGTH_LONG).show(); 
	                }
	            } else {
	            	Toast.makeText(getActivity(), "BMTSG not found", Toast.LENGTH_LONG).show();
	            }
	        }
	    });
		//End of BMTSG Button Code
	    
		//Code for handling the WAC button
		Button ButtonWAC = (Button) view.findViewById(R.id.btnUnAcclimatized);
	    ButtonWAC.setOnClickListener(new View.OnClickListener()
	    { 
	    	@Override
	        public void onClick(View v) 
	        
	        {
	            File pdfFile = new File(Environment.getExternalStorageDirectory().getPath(), "WAC.pdf");
	            if(pdfFile.exists()) 
	            {
	                Uri path = Uri.fromFile(pdfFile); 
	                Intent pdfIntent = new Intent(Intent.ACTION_VIEW);
	                pdfIntent.setDataAndType(path, "application/pdf");
	                pdfIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

	                try
	                {
	                    startActivity(pdfIntent);
	                }
	                catch(ActivityNotFoundException e)
	                {
	                    Toast.makeText(getActivity(), "No Application available to view pdf", Toast.LENGTH_LONG).show(); 
	                }
	            } else {
	            	Toast.makeText(getActivity(), "WAC not found", Toast.LENGTH_LONG).show();
	            }
	        }
	    });
		//End of BMTSG Button Code
	    return view;
      }
}
