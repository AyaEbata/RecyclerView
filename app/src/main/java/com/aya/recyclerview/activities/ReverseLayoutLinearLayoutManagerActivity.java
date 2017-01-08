package com.aya.recyclerview.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.aya.recyclerview.R;
import com.aya.recyclerview.utils.ActivityUtil;
import com.aya.recyclerview.views.RecyclerViewAdapter;

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

        final RecyclerViewAdapter adapter = new RecyclerViewAdapter(ActivityUtil.getItemList());
        recyclerView.setAdapter(adapter);
    }

}
