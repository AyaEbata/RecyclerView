package com.aya.recyclerview.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.aya.recyclerview.R;
import com.aya.recyclerview.utils.ActivityUtil;
import com.aya.recyclerview.views.RecyclerViewAdapter;

public class DivisibleByTenGridLayoutManagerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisible_by_ten_grid_layout_manager);

        setSimpleAdapter();
        setGridLayoutManager();
    }

    private void setSimpleAdapter() {
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        final RecyclerViewAdapter adapter = new RecyclerViewAdapter(ActivityUtil.getItemList());
        recyclerView.setAdapter(adapter);
    }

    private void setGridLayoutManager() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(gridLayoutManager);

        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return position % 10 == 0 ? 3 : 1;
            }
        });
    }

}
