package com.example.projecttwo;

import java.util.ArrayList;
import java.util.Arrays;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.os.Bundle;

public class ListPage extends ActionBarActivity implements OnItemClickListener {
	
	private ListView listView;
	private ArrayAdapter<String> stringArrayAdapter;
	String []items = {"Addition","Subtraction","Login Form","Increament and Decreament","Button Toast","Countries","Tab Activity","Web View"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_page);

      //Initialization
  		listView = (ListView)findViewById(R.id.listView1);
  		
  		ArrayList<String> itemList = new ArrayList<String>();
  		itemList.addAll(Arrays.asList(items));
  		
  		//Design the ListView
  		stringArrayAdapter = new ArrayAdapter<String>(this, R.layout.list_outlook,itemList);
  	    listView.setAdapter(stringArrayAdapter);
  	    listView.setOnItemClickListener(this);
  	}

@Override
public void onItemClick(AdapterView<?> parent, View view, int position,
        long id) {
    switch (position) {
    case 0:
        startActivity(new Intent(getApplicationContext(),AddPage.class));
        break;
       
    case 1:
        startActivity(new Intent(getApplicationContext(),SubtractPage.class));
        break;
       
    case 2:
        startActivity(new Intent(getApplicationContext(),LoginPage.class));
         break;
        
     case 3:
         startActivity(new Intent(getApplicationContext(),CounterPage.class));
        break;

     case 4:
         startActivity(new Intent(getApplicationContext(),NotificationPage.class));
        break;

     case 5:
        startActivity(new Intent(getApplicationContext(),SpinnerPage.class));
       break;
       
     case 6:
         startActivity(new Intent(getApplicationContext(),TabsActivity.class));
        break;
        
     case 7:
         startActivity(new Intent(getApplicationContext(),WebViewActivity.class));
        break;

    default:
        break;
    }
    
    }

}
