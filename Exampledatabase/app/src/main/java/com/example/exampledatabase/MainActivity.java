package com.example.exampledatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.exampledatabase.RDB.MyAdapter;
import com.example.exampledatabase.RDB.RTable;
import com.example.exampledatabase.RDB.RViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText roll,name,number;
    RecyclerView rv;
    public static RViewModel rViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roll=findViewById(R.id.roll);
        name=findViewById(R.id.name);
        number=findViewById(R.id.number);
        rv=findViewById(R.id.rv);
        rViewModel= new ViewModelProvider(this).get(RViewModel.class);
        rViewModel.readData().observe(this,new Observer<List<RTable>>(){

            @Override
            public void onChanged(List<RTable> rTables) {
                MyAdapter adapter=new MyAdapter(MainActivity.this,rTables);
                rv.setAdapter(adapter);
                rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
            }
        });
    }

    public void save(View view) {
        RTable rTable=new RTable();
        rTable.setSroll(roll.getText().toString());
        rTable.setSname(name.getText().toString());
        rTable.setSnumber(name.getText().toString());
        rViewModel.insert(rTable);
        Toast.makeText(this,"data inserted",Toast.LENGTH_SHORT).show();
    }
}