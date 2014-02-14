package com.tag.htmlinwebview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// define webview
		WebView webview = (WebView) findViewById(R.id.webView);
		webview.setHorizontalScrollBarEnabled(false);
		
		webview.loadUrl("file:///android_asset/theappguruz.html");

	}
}
