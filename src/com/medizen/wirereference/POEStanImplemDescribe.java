package com.medizen.wirereference;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class POEStanImplemDescribe extends Activity implements OnClickListener{

    @Override
    public void onClick(View src) {
      Intent i = new Intent(this, WireReferenceActivity.class);
      startActivity(i);
    }
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poestanimplemdescribe);
        
    }
}
