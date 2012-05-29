package com.medizen.wirereference;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Data extends Activity implements OnClickListener {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data);  
        
        Button button1 = (Button) findViewById(R.id.cat5atab);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.cat5btab);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.cat5xover);
        button3.setOnClickListener(this);
        Button button4 = (Button) findViewById(R.id.cat5xoverga);
        button4.setOnClickListener(this);
        Button button5 = (Button) findViewById(R.id.cat5xovergb);
        button5.setOnClickListener(this);
        Button button6 = (Button) findViewById(R.id.poetab);
        button6.setOnClickListener(this);
        
   	 // Create the adView     
   	AdView adView = new AdView(this, AdSize.BANNER, "a14f6a2870a8fe7");     
   	// Lookup your RelativeLayoutLayout assuming it’s been given     
   	// the attribute android:id="@+id/ad"     
   	RelativeLayout layout = (RelativeLayout)findViewById(R.id.ad);     
   	// Add the adView to it
   	layout.addView(adView);
   	// Initiate a generic request to load it with an ad     
   	adView.loadAd(new AdRequest());
        
    }
    @Override 
    public void onClick(View src)
    {
       Button clickedButton = (Button) src;
       switch (clickedButton.getId())
       {
          case R.id.cat5atab:
        	  Intent i = new Intent(this, cat5atab.class);
              startActivity(i);
              break;

          case R.id.cat5btab:
        	  Intent i1 = new Intent(this, cat5btab.class);
              startActivity(i1);
              break;
              
          case R.id.cat5xover:
        	  Intent i2 = new Intent(this, cat5xover.class);
              startActivity(i2);
              break;
              
          case R.id.cat5xoverga:
        	  Intent i3 = new Intent(this, cat5xoverga.class);
              startActivity(i3);
              break;
              
          case R.id.cat5xovergb:
        	  Intent i4 = new Intent(this, cat5xovergb.class);
              startActivity(i4);
              break;
              
          case R.id.poetab:
        	  Intent i5 = new Intent(this, poetab.class);
              startActivity(i5);
              break;
       }
    }
}

