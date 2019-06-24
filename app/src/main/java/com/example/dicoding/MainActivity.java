package com.example.dicoding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<hp_android> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(hpData.getListData());
        showRecyclearList();
    }

    private void showRecyclearList() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListHandphoneAdapter listHeroAdapter = new ListHandphoneAdapter(list);
        rvCategory.setAdapter(listHeroAdapter);
    }
}
