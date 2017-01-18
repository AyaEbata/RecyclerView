package com.aya.recyclerview.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.aya.recyclerview.R;
import com.aya.recyclerview.utils.ItemUtil;
import com.aya.recyclerview.views.RecyclerViewAdapter;

public class ItemClickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_click);

        setSimpleAdapter();
    }

    private void setSimpleAdapter() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        final RecyclerViewAdapter adapter = new RecyclerViewAdapter(ItemUtil.getList()) {
            @Override
            protected void onItemClicked(String text) {
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
            }
        };
        recyclerView.setAdapter(adapter);
    }

}
