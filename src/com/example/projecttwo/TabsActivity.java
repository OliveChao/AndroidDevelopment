package com.example.projecttwo;


import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TabsActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabs);
		
        //Instantiate class TabHost
		TabHost tabHost = getTabHost();
		Resources resources = getResources();
		
		//set tab one
		Intent homeActivity = new Intent().setClass(TabsActivity.this,HomeActivity.class);
		TabSpec homeTabSpec = tabHost.newTabSpec("Home")
				.setIndicator("Test",resources.getDrawable(R.drawable.ic_launcher))
				.setContent(homeActivity);
		
		//set tab two
        Intent contactActivity = new Intent().setClass(getApplicationContext(),ContactActivity.class);
		TabSpec contactTabSpec = tabHost.newTabSpec("Contact us")
				.setIndicator("Contact",resources.getDrawable(R.drawable.ic_launcher))
				.setContent(contactActivity);
		
		//add the tabs
		tabHost.addTab(homeTabSpec);
		tabHost.addTab(contactTabSpec);
				
	}

}
