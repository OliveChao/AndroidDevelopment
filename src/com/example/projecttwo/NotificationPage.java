package com.example.projecttwo;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.os.Bundle;

public class NotificationPage extends ActionBarActivity implements OnClickListener {
	
	//Declaring variables
    Button btnNotice;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notification_page);

		//Initialize variables
		btnNotice = (Button)findViewById(R.id.btnNotification);
		
		//SetClickListener
		btnNotice.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// switch Case
		switch (v.getId()) {
		case R.id.btnNotification:
			Toast.makeText(getApplicationContext(), "You have amazing personality : ", Toast.LENGTH_LONG).show();
			
			break;

		default:
			break;
		}
		
	}

}
