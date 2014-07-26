package com.example.projecttwo;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class CounterPage extends ActionBarActivity implements OnClickListener {
	
	//Declaring variables
		EditText etEnterNo;
		Button btnIncreament , btnDecreament;
		String strEnterNo;
		TextView tvResult;
		int enterNo, nextNo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.counter_page);

		//Initializing variables
		etEnterNo = (EditText)findViewById(R.id.etCounterEnterNo);
		
		tvResult = (TextView)findViewById(R.id.tvCounterResult);
		
		btnIncreament = (Button)findViewById(R.id.btnCounterIncrease);
		btnDecreament = (Button)findViewById(R.id.btnCounterDecrease);

		//Setting click listener
		btnIncreament.setOnClickListener(this);
		btnDecreament.setOnClickListener(this);
		
		//Converting string to integer and vice versa
		//enterNo = Integer.parseInt(etEnterNo.getText().toString());
		
}

@Override
public void onClick(View v) {
// switch case
	int enterNo=0;
	switch (v.getId()) {
	case R.id.btnCounterIncrease:
		enterNo = Integer.parseInt(etEnterNo.getText().toString());
		nextNo = enterNo + 1;
        tvResult.setText(String.valueOf(+ nextNo));
		break;
		
	case R.id.btnCounterDecrease:
		enterNo = Integer.parseInt(etEnterNo.getText().toString());
		nextNo = enterNo - 1;
		tvResult.setText(String.valueOf(nextNo));

	default:
		break;
	}


	}

}
