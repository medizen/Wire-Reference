package com.medizen.wirereference;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Extra extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("Extra");
        setContentView(textview);
    }
}