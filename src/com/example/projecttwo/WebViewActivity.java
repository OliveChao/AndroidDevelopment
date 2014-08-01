package com.example.projecttwo;

import android.support.v7.app.ActionBarActivity;
import android.webkit.WebView;
import android.os.Bundle;

public class WebViewActivity extends ActionBarActivity {
	
	//declaration of variables
	WebView webView1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_view);

		//initialization of variables
		webView1 = (WebView)findViewById(R.id.webView1);
		webView1.getSettings().setJavaScriptEnabled(true);
		webView1.loadUrl("http://www.google.com");
		
	}

}
