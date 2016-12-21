package com.aya.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setLinearLayoutManagerButton();
        setHorizontalButton();
        setReverseLayoutButton();
    }

    private void setLinearLayoutManagerButton() {
        Button button = (Button) findViewById(R.id.linear_layout_manager_button);
        button.setOnClickListener(view -> startActivity(new Intent(this, LinearLayoutManagerActivity.class)));
    }

    private void setHorizontalButton() {
        Button button = (Button) findViewById(R.id.horizontal_button);
        button.setOnClickListener(view -> startActivity(new Intent(this, HorizontalLinearLayoutManagerActivity.class)));
    }

    private void setReverseLayoutButton() {
        Button button = (Button) findViewById(R.id.reverse_layout_button);
        button.setOnClickListener(view -> startActivity(new Intent(this, ReverseLayoutLinearLayoutManagerActivity.class)));
    }

}
