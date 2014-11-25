package com.example.projecttwo;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class PageOneActivity extends ActionBarActivity implements OnClickListener {
	
	//declaration of variables
	String strEmail, strPassword;
	EditText etEmail, etPassword;
	TextView tvRegister, tvForgotPassword;
	Button btnContinue;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_one);
		
		//initialization of variables
		etEmail = (EditText)findViewById(R.id.etPageOneEmail);
		etPassword = (EditText)findViewById(R.id.etPageOnePassword);
		btnContinue = (Button)findViewById(R.id.btnPageOneContinue);
		tvRegister = (TextView)findViewById(R.id.tvPageOneRegister);
		tvForgotPassword = (TextView)findViewById(R.id.tvPageOneForgotPassword);
		
		//setting a click listener
		btnContinue.setOnClickListener(this);
		tvRegister.setOnClickListener(this);
		tvForgotPassword.setOnClickListener(this);


		//strEmail = SharedPreferences.OnSharedPreferenceChangeListener();
	}

	@Override
	public void onClick(View v) {
		// switch case
		switch (v.getId()) {
		case R.id.btnPageOneContinue:
			//validation of user name and password user inputs
			//get data stored in shared preference in register page	
			if (etEmail.getText().toString().equals("")&& etPassword.getText().toString().equals("")) {
				Toast.makeText(getApplicationContext(), "Input user name and password", Toast.LENGTH_SHORT).show();
			}
			else if(etEmail.getText().toString().equals(getApplicationContext().getSharedPreferences(strEmail, 0))){
				Toast.makeText(getApplicationContext(), "congrats", Toast.LENGTH_SHORT).show();
			}
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
