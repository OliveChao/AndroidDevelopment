package com.example.projecttwo;

import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends ActionBarActivity {

		/** Duration of wait **/
	    private final int SPLASH_DISPLAY_LENGTH = 1000;

	    /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle icicle) {
	        super.onCreate(icicle);
	        setContentView(R.layout.splash_screen);

	        /* New Handler to start the Menu-Activity 
	         * and close this Splash-Screen after some seconds.*/
	        new Handler().postDelayed(new Runnable(){
	        	
	            @Override
	            public void run() {
	                /* Create an Intent that will start the Menu-Activity. */
	                Intent mainIntent = new Intent(getApplicationContext(),Menu.class);
	                SplashScreen.this.startActivity(mainIntent);
	                SplashScreen.this.finish();
	            }
	        }, SPLASH_DISPLAY_LENGTH);
	    }
	}