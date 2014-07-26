package com.example.projecttwo;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;

public class SubtractPage extends ActionBarActivity implements OnClickListener {
	
	public static double subtraction(double NumOne,double NumTwo){
	    double Result = NumOne - NumTwo;
	
	   return Result;
    } 
	
	//Declaring variables
			EditText etNumOne , etNumTwo;
			Button btnSubtract , btnBack;
			String strAnswer, strNumOne, strNumTwo;
			TextView tvResult;
			double NumOne;
			double NumTwo;
			double Result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.subtract_page);

		//Initializing variables
				etNumOne = (EditText)findViewById(R.id.etSubtractNumOne);
				etNumTwo = (EditText)findViewById(R.id.etSubtractNumTwo);
				
				tvResult = (TextView)findViewById(R.id.tvSubtractResult);
				
				btnSubtract = (Button)findViewById(R.id.btnSubtract);
				btnBack = (Button)findViewById(R.id.btnSubtractBack);

				//Setting click listener
				btnSubtract.setOnClickListener(this);
				btnBack.setOnClickListener(this);
				
				//Converting string to double
				NumOne = Double.parseDouble(etNumOne.getText().toString());
				NumTwo = Double.parseDouble(etNumTwo.getText().toString());


		}

		@Override
		public void onClick(View v) {
		// switch case
				switch (v.getId()) {
				case R.id.btnSubtract:
					//calling the method 
					Result = subtraction(NumOne , NumTwo);
					
					//Converting the double to string
					strAnswer = String.valueOf(Result);
					
					//Displaying the result
					tvResult.setText( "The result is " + strAnswer);
					break;
					
				case R.id.btnSubtractBack:
					startActivity(new Intent(getApplicationContext(),ListPage.class));
					
				default:
					break;
				}

				
	}

}
