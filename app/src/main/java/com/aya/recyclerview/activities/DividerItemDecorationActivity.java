package com.aya.recyclerview.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;

import com.aya.recyclerview.R;
import com.aya.recyclerview.utils.ItemUtil;
import com.aya.recyclerview.views.RecyclerViewAdapter;

public class DividerItemDecorationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divider_item_decoration);

        setSimpleAdapter();
    }

    private void setSimpleAdapter() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        setDividingLine(recyclerView);

        final RecyclerViewAdapter adapter = new RecyclerViewAdapter(ItemUtil.getList());
        recyclerView.setAdapter(adapter);
    }

    private void setDividingLine(RecyclerView recyclerView) {
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

}
