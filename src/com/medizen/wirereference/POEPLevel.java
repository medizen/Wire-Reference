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

public class POEPLevel extends Activity implements OnClickListener {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poepowerdevices);  
        
        Button button1 = (Button) findViewById(R.id.poepowerdevicesdescribe);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.poepowerdeviceschart);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.poepowerdeviceschart2);
        button3.setOnClickListener(this);
      	 
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
          case R.id.poepowerdevicesdescribe:
        	  Intent i = new Intent(this, POEPowerDevicesDescribe.class);
              startActivity(i);
              break;

          case R.id.poepowerdeviceschart:
        	  Intent i1 = new Intent(this, POEPowerDevicesChart.class);
              startActivity(i1);
              break;
              
          case R.id.poepowerdeviceschart2:
        	  Intent i2 = new Intent(this, POEPowerDevicesChart2.class);
              startActivity(i2);
              break;
       }
    }
}



/**
package com.medizen.wirereference;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class POEPLevel extends Activity implements OnClickListener{

    @Override
    public void onClick(View src) {
      Intent i = new Intent(this, WireReferenceActivity.class);
      startActivity(i);
    }
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poeplevel);
        
    }
}
*/