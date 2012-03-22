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


public class Voice extends Activity implements OnClickListener {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.voicemain);
        
        Button button1 = (Button) findViewById(R.id.rj11);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.rj14);
        button2.setOnClickListener(this);
        RelativeLayout rl = (RelativeLayout)findViewById(R.id.relLayout);
        AdView ad = new AdView(Voice.this, AdSize.BANNER, "a14f6a2870a8fe7");
        rl.addView(ad);
        ad.loadAd(new AdRequest());
        
    }
    @Override 
    public void onClick(View src)
    {
       Button clickedButton = (Button) src;
       switch (clickedButton.getId())
       {
          case R.id.rj11:
        	  Intent i = new Intent(this, RJ11.class);
              startActivity(i);
              break;

          case R.id.rj14:
        	  Intent i1 = new Intent(this, RJ14.class);
              startActivity(i1);
              break;
       }
    }
}