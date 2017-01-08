package com.aya.recyclerview.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.aya.recyclerview.R;
import com.aya.recyclerview.views.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;
import java.util.stream.IntStream;

public class StaggeredGridLayoutManagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staggered_grid_layout_manager);

        setSimpleAdapter();
    }

    private void setSimpleAdapter() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        final RecyclerViewAdapter adapter = new RecyclerViewAdapter(getItemList());
        recyclerView.setAdapter(adapter);
    }

    private List<String> getItemList() {
        List<String> data = new ArrayList<>();
        Random random = new Random();

        IntStream.rangeClosed(0, 30).forEach(i -> {
            StringJoiner item = new StringJoiner("");
            IntStream.rangeClosed(0, random.nextInt(10) + 1).forEach(n -> item.add("Item: " + i + "\n"));
            data.add(item.toString());
        });

        return data;
    }
}
