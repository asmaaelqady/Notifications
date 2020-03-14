package com.example.notifications;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class notifications extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;
    ArrayList<Data> data;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(notifications.this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        data = new ArrayList<Data>();
        data.add(new Data("Name","invited you to something.",R.drawable.prodict2,"11:04 AM"));
        data.add(new Data("Name","Suggested something.",R.drawable.product1,"11:04 AM"));
        data.add(new Data("Name","Ceck out new collection",R.drawable.product3,"11:04 AM"));
        data.add(new Data("Item Name","is back in stock",R.drawable.product1,"11:04 AM"));
        adapter = new RecyclerViewAdapter(data);
        recyclerView.setAdapter(adapter);


    }
}
