package com.example.projecttwo;

import java.util.ArrayList;
import java.util.List;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class SpinnerPage extends ActionBarActivity implements OnClickListener, OnItemSelectedListener {
	
	//Declare variables
	private Spinner spinner1;
	private Button btnDisplay;
	TextView tvText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spinner_page);
		
		//initialize
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		tvText = (TextView)findViewById(R.id.tvSpinnerText);
		btnDisplay = (Button)findViewById(R.id.btnSpinnerDisplay);
		
		//clickListener
		spinner1.setOnItemSelectedListener(this);
		btnDisplay.setOnClickListener(this);
		
		//the drop down spinner
		List<String> items = new ArrayList<String>();
        items.add("Kenya");
        items.add("Tanzania");
        items.add("Rwanda");
        items.add("Burundi");
        items.add("Somalia");
        items.add("Ethopia");
        items.add("Sudan");
        items.add("Uganda");
        
		//design of spinner
        ArrayAdapter<CharSequence> adapter = 
        ArrayAdapter.createFromResource(this, R.array.country_entries, android.R.layout.simple_spinner_item);
        
        //layout to use
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        
        //setting adapter to the spinner
        spinner1.setAdapter(adapter);
        
	}

	@Override
	public void onClick(View v) {
		// switch case
		switch (v.getId()) {
		case R.id.btnSpinnerDisplay:
			Toast.makeText(getApplicationContext(), "Welcome to my spinner.You have choosen:", Toast.LENGTH_LONG).show();
			break;

		default:
			break;
		}
		
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// When item is selected
		Toast.makeText(parent.getContext(),
				"On Item Select: \n" +parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// When nothing is selected
		
	}

}
