package com.medizen.wirereference;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class poetab extends TabActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Resources res = getResources(); // Resource object to get Drawables
        TabHost tabHost = getTabHost();  // The activity TabHost
        TabHost.TabSpec spec;  // Reusable TabSpec for each tab
        Intent intent;  // Reusable Intent for each tab
        
        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, POEDescription.class);

        // Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("description").setIndicator("Description",
                          res.getDrawable(R.drawable.ic_tab_cat5aabout ))
                      .setContent(intent);
        tabHost.addTab(spec);

        // Do the same for the other tabs
        intent = new Intent().setClass(this, POEcompare.class);
        spec = tabHost.newTabSpec("conductors").setIndicator("Comparison",
                          res.getDrawable(R.drawable.ic_tab_voice))
                      .setContent(intent);
        tabHost.addTab(spec);
        
        // Do the same for the other tabs
        intent = new Intent().setClass(this, POEUses.class);
        spec = tabHost.newTabSpec("radius").setIndicator("Uses",
                          res.getDrawable(R.drawable.ic_tab_voice))
                      .setContent(intent);
        tabHost.addTab(spec);

        //Do the same for the other tabs
       intent = new Intent().setClass(this, POEPLevel.class);
       spec = tabHost.newTabSpec("wiring").setIndicator("Power Levels",
                         res.getDrawable(R.drawable.ic_tab_voice))
                      .setContent(intent);
        tabHost.addTab(spec);
        
       //Do the same for the other tabs
       intent = new Intent().setClass(this, POEWiring.class);
       spec = tabHost.newTabSpec("poewiring").setIndicator("POE Wiring",
                         res.getDrawable(R.drawable.ic_tab_voice))
                      .setContent(intent);
        tabHost.addTab(spec);
        //Do the same for the other tabs
        intent = new Intent().setClass(this, POEStanImplem.class);
        spec = tabHost.newTabSpec("poestandardimplementation").setIndicator("Standard Implementation",
                          res.getDrawable(R.drawable.ic_tab_voice))
                       .setContent(intent);
         tabHost.addTab(spec);
        
    }
}
       
        
