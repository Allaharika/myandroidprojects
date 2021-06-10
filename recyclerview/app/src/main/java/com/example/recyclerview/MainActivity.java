package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.recyclerview);
        int images[]={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,
                R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i};
        String[] itemnames={"chiken biryani","chicken lolipop","egg biryani","chicken65",
        "Mutton curry","muttonbiryani","fish curry","prawns curry",
                "veg Noodles","chicken Noodles"};
        String[] itemprices={"100","150","200","250","300","350","400","120","342","450"};
        rv.
    }
}