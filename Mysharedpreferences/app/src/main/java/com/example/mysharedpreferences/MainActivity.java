package com.example.mysharedpreferences;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.example.mysharedpreferences.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    SharedPreferences sp;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        sp=getSharedPreferences("AP",MODE_PRIVATE);
    }

    public void showData(View view) {
        Snackbar.make(view,
                binding.username.getText().toString()+"\n"+
                        binding.password.getText().toString(),
                Snackbar.LENGTH_LONG).show();
        editor=sp.edit();
        editor.putString("name",binding.username.getText().toString());
        editor.putString("password",binding.password.getText().toString());
        editor.commit();

    }

    @Override
    protected void onPause() {
        super.onPause();
        editor=sp.edit();
        editor.putString("name",binding.username.getText().toString());
        editor.putString("password",binding.password.getText().toString());
        editor.commit();

    }
    @Override
    protected void onResume() {
        super.onResume();
        String myName=sp.getString("name","");
        String myPassword=sp.getString("password","");
        binding.username.setText(myName);
        binding.password.setText(myPassword);
    }
    void Onpause(){

    }
}