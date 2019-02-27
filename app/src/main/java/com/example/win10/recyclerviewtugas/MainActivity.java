package com.example.win10.recyclerviewtugas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SepedaAdapter adapter;
    private ArrayList<Sepeda> sepedArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new SepedaAdapter(sepedArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        sepedArrayList = new ArrayList<>();
        sepedArrayList.add(new Sepeda("CBR 150", "Honda"));
        sepedArrayList.add(new Sepeda("Vario 150", "Honda"));
        sepedArrayList.add(new Sepeda("R15", "Yamaha"));
        sepedArrayList.add(new Sepeda("Vixion", "Yamaha"));
    }


}
