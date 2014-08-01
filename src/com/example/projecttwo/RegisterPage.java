package com.example.projecttwo;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;

public class RegisterPage extends ActionBarActivity implements OnClickListener {
	
	//declaration of variables
	Button btnSignUp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register_page);
		
		//initialization of variables
		btnSignUp = (Button)findViewById(R.id.btnRegisterSignUp);
		
		//set an on click listener
		btnSignUp.setOnClickListener(this);

		
	}

	@Override
	public void onClick(View v) {
		// switch case
		switch (v.getId()) {
		case R.id.btnRegisterSignUp:
			startActivity(new Intent(getApplicationContext(),ListPage.class));
			Toast.makeText(getApplicationContext(), "Welcome to my list of excitiment", Toast.LENGTH_LONG).show();
			break;

		default:
			break;
		}
		
	}

}
