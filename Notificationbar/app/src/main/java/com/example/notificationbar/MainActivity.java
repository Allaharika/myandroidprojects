package com.example.notificationbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    NotificationManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSystemService(NOTIFICATION_SERVICE);
        manager=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);

    }

    public void submit(View view) {
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentTitle("my first notification");
        builder.setContentText("Hello,good morning");
        Intent i =new Intent(this,MainActivity.class);
        PendingIntent pi=PendingIntent.getActivity(this,77,i,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pi);
        builder.setAutoCancel(true);
        builder.addAction(R.mipmap.ic_launcher,"replay",pi);
        Bitmap b= BitmapFactory.decodeResource(getResources(),R.drawable.screenshot);
        builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(b));
        manager.notify(7, builder.build());
    }
}