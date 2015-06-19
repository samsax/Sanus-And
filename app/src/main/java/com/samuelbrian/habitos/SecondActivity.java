package com.samuelbrian.habitos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Samuel on 16/03/2015.
 */
public class SecondActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        String varString = getIntent().getStringExtra("ValorTest");
        Log.d("HelloWorld", varString);


    }
}
