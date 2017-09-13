package com.example.admin.listviewandrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView rvPersonList;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.ItemAnimator itemAnimator;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);


        List<Person> personListCustom = new ArrayList<>();
        personListCustom.add(new Person("Bill Clinton", 65, "Male", 167));
        personListCustom.add(new Person("Tom Cruise", 50, "Male", 167));
        personListCustom.add(new Person("Jennifer Aninston", 40, "Female", 167));


        rvPersonList = (RecyclerView) findViewById(R.id.rvPersonList);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(personListCustom);
        rvPersonList.setAdapter(recyclerViewAdapter);
        layoutManager = new LinearLayoutManager(this);
        itemAnimator = new DefaultItemAnimator();
        rvPersonList.setLayoutManager(layoutManager);
        rvPersonList.setItemAnimator(itemAnimator);

    }
}
