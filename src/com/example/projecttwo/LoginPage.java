package com.example.projecttwo;

import com.example.projecttwo.utilities.Constants;

import android.support.v7.app.ActionBarActivity;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class LoginPage extends ActionBarActivity implements OnClickListener {
	
	//Declare variables
	        String strUserName, strPassword;
			EditText etUserName, etPassword, etDetails;
		    CheckBox chkOlive;
			Button btnToast, btnBack;       
			
			Constants myConstants;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_page);
		
		//Initializing variables
		etUserName = (EditText)findViewById(R.id.etLoginUserName);
		chkOlive = (CheckBox)findViewById(R.id.LoginCheckBox);
		etPassword = (EditText)findViewById(R.id.etLoginPassword);
		btnToast = (Button)findViewById(R.id.btnLoginToast);
		btnBack = (Button)findViewById(R.id.btnLoginBack);
		
		//password to string and userName to string
		strPassword = etPassword.getText().toString();
		strUserName = etUserName.getText().toString();
		
		//clickListener
		chkOlive.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				
				// Checkbooks
				if (!isChecked) {
					//show password
					etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
				}else {
					//hide password
					etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
				}
				
			}
		});
		
		btnToast.setOnClickListener(this);
		btnBack.setOnClickListener(this);
		
		//Instantiation
		myConstants = new Constants();

	}

	
	@Override
	public void onClick(View v) { 
		 
		// Switch case statement
		switch (v.getId()) {
		case R.id.btnLoginToast:
			
			//This is what we call hard coding
			//created temporary storage for our data
			//strUserName = "Olive Chao";
			//strPassword = "twins";
			
			//access the shared preferences
			SharedPreferences sharedPreferences = getSharedPreferences(myConstants.PREFS_NAME, 0);
			
			//get data from the shared preferences using the key
			String spUserName = sharedPreferences.getString(myConstants.UserName, null);
			String spPassword = sharedPreferences.getString(myConstants.Password, null);
			
			//check if user name and password are empty
			if (etUserName.getText().toString().equals("")&& etPassword.getText().toString().equals("")) {
				Toast.makeText(getApplicationContext(), "input user name and password", Toast.LENGTH_LONG).show();	
			}
			else if (etUserName.getText().toString().equals("")) {
				Toast.makeText(getApplicationContext(), "input user name", Toast.LENGTH_LONG).show();	
			}
			else if (etPassword.getText().toString().equals("")) {
				Toast.makeText(getApplicationContext(), "input password", Toast.LENGTH_LONG).show();	
			}
			
			//validation
			else if (!etUserName.getText().toString().equals("spUserName")) {
				Toast.makeText(getApplicationContext(), "user name incorrect", Toast.LENGTH_LONG).show();	
			}
			else if (!etPassword.getText().toString().equals("spPassword")) {
				Toast.makeText(getApplicationContext(), "password incorrect", Toast.LENGTH_LONG).show();	
			}
			else if (etUserName.getText().toString().equals(spUserName)&& etPassword.getText().toString().equals(spPassword)) {
				Toast.makeText(getApplicationContext(), "hurray welcome", Toast.LENGTH_LONG).show();	
			}
			break;
			
		case R.id.btnLoginBack:
			startActivity(new Intent(getApplicationContext(),ListPage.class));
			
			break;
			
		default:
			break;
		}
	}

}
