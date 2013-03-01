package com.example.myapp;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.location.*;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.AudioRecord;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.io.InputStream;
import java.util.ArrayList;

import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;


public class PeopleInTheNetwork extends Fragment  {

	
	View v;
	
	
	  @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) 
	    {
	    	v=inflater.inflate(R.layout.network_mates, container, false);
	    	System.out.println("jlkjdalkjhdlh");
	    	Context conte = v.getContext();
	    	System.out.println(conte);
	    	//TextView tvt= (TextView)v.findViewById(R.id.textView1);
	    	//tvt.setText("HELLLOOOOOOO");
	    	
	    	ArrayList<UserData> user_details = GetSearchResults();
	    	
	    	 ListView lv1 = (ListView) v.findViewById(R.id.listView1);
	    		lv1.setAdapter(new UserListBaseAdapter(conte, user_details));
	    		 
	    	
	return v;
		}

	private ArrayList<UserData> GetSearchResults() {
		ArrayList<UserData> results = new ArrayList<UserData>();
		 
		UserData item_details = new UserData();
		item_details.setName("zzz");
		//item_details.setUserDescription("Spicy Chiken Pizza1");
		item_details.setUserTitle("RS 310.001");
		//item_details.setImageNumber(1);
		results.add(item_details);
		
		item_details = new UserData();
		item_details.setName("zzz");
		//item_details.setUserDescription("Spicy Chiken Pizza2");
		item_details.setUserTitle("RS 310.002");
		//item_details.setImageNumber(1);
		results.add(item_details);
		 
		item_details = new UserData();
		item_details.setName("zzz");
		//item_details.setUserDescription("Spicy Chiken Pizza3");
		item_details.setUserTitle("RS 310.003");
		//item_details.setImageNumber(1);
		results.add(item_details);
		 
		item_details = new UserData();
		item_details.setName("jjj");
		//item_details.setUserDescription("Spicy Chiken Pizza4");
		item_details.setUserTitle("RS 310.004");
		//item_details.setImageNumber(1);
		results.add(item_details);
		 
		item_details = new UserData();
		item_details.setName("jjj");
		//item_details.setUserDescription("Spicy Chiken Pizza5");
		item_details.setUserTitle("RS 310.005");
		//item_details.setImageNumber(1);
		results.add(item_details);
		
		item_details = new UserData();
		item_details.setName("jjj");
		//item_details.setUserDescription("Spicy Chiken Pizza6");
		item_details.setUserTitle("RS 310.006");
		//item_details.setImageNumber(1);
		results.add(item_details);
		 
		//System.out.println(results[0][0]);
		return results;
	}
	 
	
	
	
	
	
	//context = PeopleInTheNetwork.context;
	
/*	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	setContentView(R.layout.network_mates);
	
	
	context = PeopleInTheNetwork.context;
	
	ArrayList<UserData> user_details = GetSearchResults();
	 
 ListView lv1 = (ListView) context.findViewById(R.id.listView1);
	lv1.setAdapter(new UserListBaseAdapter(context, user_details));
	 
	
	}

	private ArrayList<UserData> GetSearchResults() {
		// TODO Auto-generated method stub
		return null;
	} */
	
	

	
	
}
