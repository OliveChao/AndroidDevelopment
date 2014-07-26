package com.example.projecttwo;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;

public class AddPage extends ActionBarActivity implements OnClickListener {
	
	public static double addition(double NumOne,double NumTwo){
	    double Result = NumOne + NumTwo;
	
	   return Result;
    } 
	//Declaring variables
			EditText etNumOne , etNumTwo;
			Button btnAdd , btnBack;
			String strAnswer, strNumOne, strNumTwo;
			TextView tvResult;
			double NumOne;
			double NumTwo;
			double Result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spinner_page);

		 //Initializing variables
		etNumOne = (EditText)findViewById(R.id.etAddNumOne);
		etNumTwo = (EditText)findViewById(R.id.etAddNumTwo);
		
		tvResult = (TextView)findViewById(R.id.tvAddResult);
		
		btnAdd = (Button)findViewById(R.id.btnAdd);
		btnBack = (Button)findViewById(R.id.btnAddBack);

		//Setting click listener
		btnAdd.setOnClickListener(this);
		btnBack.setOnClickListener(this);
		
		//Converting 
		strNumOne = etNumOne.getText().toString();
		strNumTwo = etNumTwo.getText().toString();
		
		NumOne = Double.parseDouble(strNumOne);
		NumTwo = Double.parseDouble(strNumTwo);


}

@Override
public void onClick(View v) {
// switch case
		switch (v.getId()) {
		case R.id.btnAdd:
			//calling the method
			Result = addition(NumOne , NumTwo);
			
			//Converting the double to string
			strAnswer = String.valueOf(Result);
			
			//Displaying the result
			tvResult.setText( "The result is " + strAnswer);
			break;
			
		case R.id.btnAddBack:
			startActivity(new Intent(getApplicationContext(),ListPage.class));
			
		default:
			break;
		}

	}

}
