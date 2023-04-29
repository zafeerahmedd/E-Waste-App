package com.example.e_waste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.webkit.WebView;

import java.util.LinkedList;
import java.util.List;

public class driver_list extends AppCompatActivity {
    String []data={"raju Roy","Ramu Ram","Uday kumar"};
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_list);
        List<String> items = new LinkedList<>();
        items.add("Mukesh");

        RecyclerView recyclerView = findViewById(R.id.view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        DemoAdapter adapter= new DemoAdapter(items);
        recyclerView.setAdapter(adapter);

        findViewById(R.id.add).setOnClickListener(view -> {
            items.add(data[counter % 3]);
            counter++;
            adapter.notifyItemInserted(items.size() - 1);
        });

    }
}