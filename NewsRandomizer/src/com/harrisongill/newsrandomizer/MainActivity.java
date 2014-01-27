package com.harrisongill.newsrandomizer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends Activity {

	WebView myWebView;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		myWebView = (WebView) findViewById(R.id.webView1);
		myWebView.getSettings().setBuiltInZoomControls(true);
		//myWebView.getSettings().setJavaScriptEnabled(true);
		double tmp = Math.random();
		if (tmp > 0 && tmp <= 0.02) {
			myWebView.loadUrl("http://edition.cnn.com"); 
		} else if (tmp > 0.02 && tmp <= 0.04) {
			myWebView.loadUrl("http://m.bbc.co.uk/news/world");
		// Commented out news sites do not load on my network as intended, will defer to 'else'
		//} else if (tmp > 0.04 && tmp <= 0.06) {
		//	myWebView.loadUrl("http://www.timesofisrael.com");
		} else if (tmp > 0.06 && tmp <= 0.08) {
			myWebView.loadUrl("http://m.aljazeera.com/index/home");
		} else if (tmp > 0.08 && tmp <= 0.10) {
			myWebView.loadUrl("http://abcnews.go.com/m/");
		} else if (tmp > 0.10 && tmp <= 0.12) {
			myWebView.loadUrl("http://www.breakingnews.com");
		} else if (tmp > 0.12 && tmp <= 0.14) {
			myWebView.loadUrl("http://www.nbcnews.com");
		} else if (tmp > 0.14 && tmp <= 0.16) {
			myWebView.loadUrl("http://www.breakingnews.ie/world/");
		} else if (tmp > 0.16 && tmp <= 0.18) {
			myWebView.loadUrl("http://mobile.news.com.au/world");
		} else if (tmp > 0.18 && tmp <= 0.20) {
			myWebView.loadUrl("http://www.theguardian.com/world");
		} else if (tmp > 0.20 && tmp <= 0.22) {
			myWebView.loadUrl("http://en.m.wikipedia.org/wiki/Portal:Current_events");
		} else if (tmp > 0.22 && tmp <= 0.24) {
			myWebView.loadUrl("http://www.telegraph.co.uk/news/worldnews/");
		} else if (tmp > 0.24 && tmp <= 0.26) {
			myWebView.loadUrl("http://mobile.reuters.com");
		} else if (tmp > 0.26 && tmp <= 0.28) {
			myWebView.loadUrl("http://www.npr.org");
		} else if (tmp > 0.28 && tmp <= 0.30) {
			myWebView.loadUrl("http://www.cbc.ca/m/news/#!/section/world");
		} else if (tmp > 0.30 && tmp <= 0.32) {
			myWebView.loadUrl("http://m.news24.com/news24/World");
		} else if (tmp > 0.32 && tmp <= 0.34) {
			myWebView.loadUrl("http://mobile.newsnow.co.uk/h/World+News");
		} else if (tmp > 0.34 && tmp <= 0.36) {
			myWebView.loadUrl("http://www.usatoday.com/news/");
		} else if (tmp > 0.36 && tmp <= 0.38) {
			myWebView.loadUrl("http://www.ctvnews.ca/mobile/world");
		} else if (tmp > 0.38 && tmp <= 0.40) {
			myWebView.loadUrl("http://m.rte.ie/news/touch//");
		} else if (tmp > 0.40 && tmp <= 0.42) {
			myWebView.loadUrl("http://www.irishtimes.com/news/world");
		} else if (tmp > 0.42 && tmp <= 0.44) {
			myWebView.loadUrl("http://i.stuff.co.nz/world/");
		} else if (tmp > 0.44 && tmp <= 0.46) {
			myWebView.loadUrl("http://news.alltop.com/m/");
		} else if (tmp > 0.46 && tmp <= 0.48) {
			myWebView.loadUrl("http://www.itn.co.uk/Home/TopStories");
		} else if (tmp > 0.48 && tmp <= 0.50) {
			myWebView.loadUrl("http://mobile.abc.net.au/news/world/");
		} else if (tmp > 0.50 && tmp <= 0.52) {
			myWebView.loadUrl("http://www.3news.co.nz/World.aspx");
		} else if (tmp > 0.52 && tmp <= 0.54) {
			myWebView.loadUrl("http://rt.com");
		} else if (tmp > 0.54 && tmp <= 0.56) {
			myWebView.loadUrl("http://m.dw.de/?mobil");
		} else if (tmp > 0.56 && tmp <= 0.58) {
			myWebView.loadUrl("http://m.timeslive.co.za");
		} else if (tmp > 0.58 && tmp <= 0.60) {
			myWebView.loadUrl("http://m.voanews.com");
		//} else if (tmp > 0.60 && tmp <= 0.62) {
		//	myWebView.loadUrl("http://www.rferl.mobi");
		} else if (tmp > 0.62 && tmp <= 0.64) {
			myWebView.loadUrl("http://www.reddit.com/r/worldnews");
		//} else if (tmp > 0.64 && tmp <= 0.66) {
		//	myWebView.loadUrl("http://hosted.ap.org/dynamic/fronts/HOME");
		} else if (tmp > 0.66 && tmp <= 0.68) {
			myWebView.loadUrl("http://www.cbsnews.com");
		} else if (tmp > 0.68 && tmp <= 0.70) {
			myWebView.loadUrl("http://m.spiegel.de/international/index.html");
		} else if (tmp > 0.70 && tmp <= 0.72) {
			myWebView.loadUrl("http://www.japantoday.com/smartphone/");
		} else if (tmp > 0.72 && tmp <= 0.74) {
			myWebView.loadUrl("http://www.themoscowtimes.com/mobile/");
		//} else if (tmp > 0.74 && tmp <= 0.76) {
		//	myWebView.loadUrl("http://m.politico.com/iphone/index.cfm");
		} else if (tmp > 0.76 && tmp <= 0.78) {
			myWebView.loadUrl("http://m.thehindu.com");
		} else if (tmp > 0.78 && tmp <= 0.80) {
			myWebView.loadUrl("http://www.todayszaman.com/mobile.action");
		} else if (tmp > 0.80 && tmp <= 0.82) {
			myWebView.loadUrl("http://www.usnews.com/mobile/");
		} else if (tmp > 0.82 && tmp <= 0.84) {
			myWebView.loadUrl("http://www.stripes.com/mobile/");
		} else if (tmp > 0.84 && tmp <= 0.86) {
			myWebView.loadUrl("http://www.slate.com");
		} else if (tmp > 0.86 && tmp <= 0.88) {
			myWebView.loadUrl("http://m.scmp.com");
		} else if (tmp > 0.88 && tmp <= 0.90) {
			myWebView.loadUrl("http://www.salon.com");
		//} else if (tmp > 0.90 && tmp <= 0.92) {
		//	myWebView.loadUrl("http://m.huffpost.com/us/vertical/world");
		} else if (tmp > 0.92 && tmp <= 0.94) {
			myWebView.loadUrl("http://www.drudgereport.com");
		} else if (tmp > 0.94 && tmp <= 0.96) {
			myWebView.loadUrl("http://globalnews.ca");
		} else if (tmp > 0.96 && tmp <= 0.98) {
			myWebView.loadUrl("http://m.france24.com/en/");	
		} else {
			myWebView.loadUrl("http://www.foxnews.mobi"); }
		Button btn = (Button) findViewById(R.id.button1);
		btn.setOnClickListener(new View.OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    	 Intent intent = getIntent();
		         finish();
		         startActivity(intent);
		    }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	    if ((keyCode == KeyEvent.KEYCODE_BACK) && myWebView.canGoBack()) {
	        myWebView.goBack();
	        return true;
	    }
	    return super.onKeyDown(keyCode, event);
	}
	

}

