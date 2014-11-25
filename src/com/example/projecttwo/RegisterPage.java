package com.example.projecttwo;


import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;

public class RegisterPage extends ActionBarActivity implements OnClickListener {
	
	//declaration of variables
	String strFirstName, strLastName, strEmail, strUserName, strPassword;
	EditText etFirstName, etLastName, etEmail, etUserName, etPassword;
	Button btnSignUp;

	public static final String PREFS_NAME = "myPrefs";
	
	SharedPreferences sharedPreferences;
	Editor editor;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register_page);
		
		//initialization of variables
		etFirstName = (EditText)findViewById(R.id.etRegisterFirstName);
		etLastName = (EditText)findViewById(R.id.etRegisterLastName);
		etEmail = (EditText)findViewById(R.id.etRegisterEmail);
		etUserName = (EditText)findViewById(R.id.etRegisterUserName);
		etPassword = (EditText)findViewById(R.id.etRegisterPassword);
		btnSignUp = (Button)findViewById(R.id.btnRegisterSignUp);
		
		//set an on click listener
		btnSignUp.setOnClickListener(this);
		

	}

	@Override
	public void onClick(View v) {
		// switch case
		switch (v.getId()) {
		case R.id.btnRegisterSignUp:
			
			//strFirstName = etFirstName.getText().toString();
			//strLastName = etLastName.getText().toString();
			//strEmail = etEmail.getText().toString();
			//strUserName = etUserName.getText().toString();
			//strPassword = etPassword.getText().toString();
			
			//store the data in shared preferences
			editor.putString("keyFirstName", etFirstName.getText().toString());
			editor.putString("keyLastName", etLastName.getText().toString());
			editor.putString("keyEmail", etEmail.getText().toString());
			editor.putString("keyUserName", etUserName.getText().toString());
			editor.putString("keyPassword", etPassword.getText().toString());
			
			//save changes to shared preferences
			editor.commit();
			
			//getMenuInflater().inflate(R.menu.main,menu);
			
			startActivity(new Intent(getApplicationContext(),PageOneActivity.class));
			Toast.makeText(getApplicationContext(), "Welcome to the login page", Toast.LENGTH_LONG).show();
			break;

		default:
			break;
		}
		
	}

}
