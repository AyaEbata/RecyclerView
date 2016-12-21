package com.aya.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ReverseLayoutLinearLayoutManagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_layout_linear_layout_manager);

        setSimpleAdapter();
    }

    private void setSimpleAdapter() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        List<String> data = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            data.add("Item: " + i);
        }

        final SimpleAdapter adapter = new SimpleAdapter(data);
        recyclerView.setAdapter(adapter);
    }
}
