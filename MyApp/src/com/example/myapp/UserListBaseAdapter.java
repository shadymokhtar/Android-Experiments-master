package com.example.myapp;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class UserListBaseAdapter extends BaseAdapter { 
	
	private static ArrayList<UserData> userDataList;

	 private LayoutInflater l_Inflater;
	 
	 public UserListBaseAdapter(Context context, ArrayList<UserData> results) {
		// l_Inflater=(LayoutInflater)Context.getLayoutInflator();
	  userDataList = results;
	  l_Inflater = LayoutInflater.from(context);
	 }
	
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return userDataList.size();
	}

	@Override
	public Object getItem(int position) {
		
		return userDataList.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if(convertView == null)
		{
			convertView = l_Inflater.inflate(R.layout.row, null);
			holder = new ViewHolder();
			 holder.txt_username = (TextView) convertView.findViewById(R.id.userName);
			 holder.txt_usertitle = (TextView) convertView.findViewById(R.id.userTitle);
			// holder.itemImage = (ImageView) convertView.findViewById(R.id.photo);
			 convertView.setTag(holder);
		}
		else
		{
			holder = (ViewHolder) convertView.getTag();
		}
		
		 holder.txt_username.setText(userDataList.get(position).getName());
		//  holder.txt_itemDescription.setText(userDataList.get(position).getItemDescription());
		  holder.txt_usertitle.setText(userDataList.get(position).getUserTitle());
		 // holder.itemImage.setImageResource(imgid[itemDetailsrrayList.get(position).getImageNumber() - 1]);
		 
		
		return convertView;
	}

	static class ViewHolder {
		  TextView txt_username;
		  TextView txt_usertitle;
		 // ImageView itemImage;
		 }
	
	
}
