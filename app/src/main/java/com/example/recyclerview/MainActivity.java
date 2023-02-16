package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Widok> wszystkieWidoki;
    AdapterWidok adapterWidok;

    private void przygotujWidoki(){
        wszystkieWidoki = new ArrayList<>();
        wszystkieWidoki.add(new Widok(R.drawable.kwiat1,"zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat2,"zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat3,"zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat4,"michael traut"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat5,"zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat6,"zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat7,"zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat8,"zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat1,"zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat2,"zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat3,"zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat4,"mikel erhman"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat5,"zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat6,"zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat7,"zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat8,"zwiastun wiosny"));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przygotujWidoki();
        adapterWidok = new AdapterWidok(this,wszystkieWidoki);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapterWidok);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
    }
}