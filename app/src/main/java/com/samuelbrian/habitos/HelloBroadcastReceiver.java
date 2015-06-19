package com.samuelbrian.habitos;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Samuel on 16/03/2015.
 */
public class HelloBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Broadcast","Power is connected");
    }
}
