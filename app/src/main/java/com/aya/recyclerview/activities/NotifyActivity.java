package com.aya.recyclerview.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.aya.recyclerview.R;
import com.aya.recyclerview.utils.ItemUtil;
import com.aya.recyclerview.views.RecyclerViewAdapter;

import java.util.List;
import java.util.Random;

public class NotifyActivity  extends AppCompatActivity {

    RecyclerViewAdapter adapter;
    List<String> itemList = ItemUtil.getList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify);

        setSimpleAdapter();
    }

    private void setSimpleAdapter() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        adapter = new RecyclerViewAdapter(itemList);
        recyclerView.setAdapter(adapter);
    }

    public void onClickAddButton(View view) {
        adapter.insert("Added Item", new Random().nextInt(itemList.size()));
    }
}
