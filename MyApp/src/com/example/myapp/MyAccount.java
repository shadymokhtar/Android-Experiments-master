package com.example.myapp;

//import com.example.myapp.Messages;
//import com.example.myapp.NewsFeeds;
//import com.example.myapp.MyAccount;
import com.example.myapp.Profile_Viewer;
import com.example.myapp.R;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.AudioRecord;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MyAccount extends Fragment implements OnClickListener
{
	View v;
	
	
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) 
    {
    	v=inflater.inflate(R.layout.myaccount, container, false);
    	
    	Button MyProfile=(Button) v.findViewById(R.id.button_profile);
    	
    	MyProfile.setOnClickListener(this);
    	
   
    	
    	
return v;
	}

    
    public void onClick(View v) {
    	Context contt;
    	
    	contt=v.getContext();
    	Intent intent = new Intent(contt,Profile_Viewer.class);
    	startActivity(intent);
    	//startSubActivity(new Intent(this, Profile_Viewer.class), 0);
    }

}
