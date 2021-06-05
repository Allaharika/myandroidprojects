package com.example.dailogspickers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.time);
    }

    public void alert(View view) {
        AlertDialog.Builder b=new AlertDialog.Builder(this);
        b.setIcon(R.drawable.ic_alert);
        b.setTitle("Alert Dailogue");
        b.setMessage("Are you sure you wanna exit!");
        b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                finish();
            }
        });
        b.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                Toast.makeText(MainActivity.this,"Alert dailog close",
                        Toast.LENGTH_SHORT).show();
            }

        });
        b.show();
    }

    public void time(View view) {
        Calendar c=Calendar.getInstance();
        int hour=c.get(Calendar.HOUR);
        int minute=c.get(Calendar.MINUTE);
        TimePickerDialog tpd=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            tv.setText(hourOfDay+ "::" +minute);
            }
        },hour,minute,false);
        tpd.show();
    }
}