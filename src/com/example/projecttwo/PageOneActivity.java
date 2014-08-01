package com.example.projecttwo;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;

public class PageOneActivity extends ActionBarActivity implements OnClickListener {
	
	//declaration of variables
	TextView tvRegister, tvForgotPassword;
	Button btnContinue;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_one);
		
		//initialization of variables
		btnContinue = (Button)findViewById(R.id.btnPageOneContinue);
		tvRegister = (TextView)findViewById(R.id.tvPageOneRegister);
		tvForgotPassword = (TextView)findViewById(R.id.tvPageOneForgotPassword);
		
		//setting a click listener
		btnContinue.setOnClickListener(this);
		tvRegister.setOnClickListener(this);
		tvForgotPassword.setOnClickListener(this);

		
	}

	@Override
	public void onClick(View v) {
		// switch case
		switch (v.getId()) {
		case R.id.btnPageOneContinue:
			startActivity(new Intent(getApplicationContext(),LoginPage.class));
			break;
			
		case R.id.tvPageOneRegister:
			startActivity(new Intent(getApplicationContext(),RegisterPage.class));
			break;
			
		case R.id.tvPageOneForgotPassword:
			startActivity(new Intent(getApplicationContext(),GetPasswordPage.class));
			break;

		default:
			break;
		}
		
	}

}
