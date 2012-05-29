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

public class POEStanImplem extends Activity implements OnClickListener {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poestandardimplementation);  
        
        Button button1 = (Button) findViewById(R.id.poestandardimplemdescribe);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.poestandimplemchart);
        button2.setOnClickListener(this);
      	 
        // Create the adView     
       	//AdView adView = new AdView(this, AdSize.BANNER, "a14f6a2870a8fe7");     
       	// Lookup your RelativeLayoutLayout assuming it’s been given     
       	// the attribute android:id="@+id/ad"     
       	//RelativeLayout layout = (RelativeLayout)findViewById(R.id.ad);     
       	// Add the adView to it
       	//layout.addView(adView);
       	// Initiate a generic request to load it with an ad     
       	//adView.loadAd(new AdRequest());
          

    }
    @Override 
    public void onClick(View src)
    {
       Button clickedButton = (Button) src;
       switch (clickedButton.getId())
       {
          case R.id.poestandardimplemdescribe:
        	  Intent i = new Intent(this, POEStanImplemDescribe.class);
              startActivity(i);
              break;

          case R.id.poestandimplemchart:
        	  Intent i1 = new Intent(this, POEStanImplemChart.class);
              startActivity(i1);
              break;
       }
    }
}