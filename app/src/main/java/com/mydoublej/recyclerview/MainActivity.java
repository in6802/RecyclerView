package com.mydoublej.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<ItemData> arrayList = new ArrayList<>();
        arrayList.add(new ItemData("aaaa", "11111"));
        arrayList.add(new ItemData("bbbb", "22222"));
        arrayList.add(new ItemData("cccc", "33333"));

        MyAdapter myAdapter = new MyAdapter(arrayList);
        mRecyclerView.setAdapter(myAdapter);

    }
}
