package com.example.examplereceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Switch;

public class MyReceiver extends BroadcastReceiver {

    ImageView iv;

    public MyReceiver(ImageView iv) {
        this.iv=iv;

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        switch (intent.getAction()){
            case Intent.ACTION_POWER_CONNECTED:
                iv.setImageResource(R.drawable.ic_charging);
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                iv.setImageResource(R.drawable.ic_battery);
                break;


        }
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}