package com.example.zeeshan.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Zeeshan on 11/21/2017.
 */

public class MyReciever extends BroadcastReceiver {

    public MyReciever(){}
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "BroadCast Receiever", Toast.LENGTH_SHORT).show();
    }
}
