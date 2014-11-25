package com.example.projecttwo.utilities;

import java.util.HashMap;

import com.example.projecttwo.LoginPage;
import com.example.projecttwo.RegisterPage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class SessionManager {
	
	/**
	 * This class uses the shared preferences to handle user sessions
	 */
	
	SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context _context;
    
    //Constructor
    public SessionManager(Context context){
    	this._context = context;
    	sharedPreferences = _context.getSharedPreferences(Constants.PREFS_NAME, 0);
    	editor = sharedPreferences.edit();
    }
    
    /**
     * This method 
     *  
     * @param name
     * @param password
     */
    public void createUser(String name, String password){
    	
    	//Store Data in the shared preferences
    	editor.putString(Constants.FirstName, name);
    	editor.putString(Constants.Password, password);
    	
    	editor.commit();
    	
    }
    
    /**
     * This method gets user details.
     * This will be used when the user is login in.
     * 
     * @return Data for the shared preferences
     */
    public HashMap<String, String> getUserDetails(){
    	HashMap<String, String> user = new HashMap<String, String>();
    	
    	user.put(Constants.KEY_HASHMAP_NAME, sharedPreferences.getString(Constants.FirstName, null));
    	user.put(Constants.KEY_HASHMAP_PASSWORD, sharedPreferences.getString(Constants.Password, null));
    	
    	return user;
    }
    
    /**
     * This method clears data from the shared preferences and starts the login page
     */
    public void logOutUser(){
    	editor.clear();
    	editor.commit();
    	
    	//Intent intent = new Intent(_context,LoginPage.class);
    	//_context.startActivity(intent);
    	
    	//start login page
    	_context.startActivity(new Intent(_context,LoginPage.class));
    }
    
    /**
     * This method checks if the user has logged in
     * 
     * @return false
     */
    public boolean isLoggedIn(){
    	return sharedPreferences.getBoolean(Constants.State, false);
    }

}
