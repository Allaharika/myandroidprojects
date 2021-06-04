package com.example.app_bar_options_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.profile:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
            case R.id.name:
                Toast.makeText(this, getTitle(), Toast.LENGTH_SHORT).show();
            case R.id.contact:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
            case  R.id.settings:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }
}