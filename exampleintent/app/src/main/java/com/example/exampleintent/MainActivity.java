package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Declaring all the views
    EditText name,number,link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialize all the views
        name=findViewById(R.id.name);
        number=findViewById(R.id.number);
        link=findViewById(R.id.link);

    }

    public void next(View view) {
        //Here we will work with explicit intent
        String n=name.getText().toString();
        //Intent obj=new Intent(present class name,next class name)
        //startActivity(obj)
        Intent i=new Intent(this,Secondactivity.class);
        i.putExtra("key",n);
        startActivity(i);
    }

    public void dail(View view) {
        //here we will work with implicit intent
        String n=number.getText().toString();
        //Uri-unified resource identifier
        //phone:tel:,web:https://,location=geo:lat;
        Uri uri = Uri.parse("tel:"+n);
        Intent i = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);
    }

    public void browse(View view) {
        String n=link.getText().toString();
        Uri uri=Uri.parse("https://"+n);
        Intent i=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }
}