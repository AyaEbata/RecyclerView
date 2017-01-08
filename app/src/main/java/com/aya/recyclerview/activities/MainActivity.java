package com.aya.recyclerview.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.annimon.stream.Stream;
import com.aya.recyclerview.R;
import com.aya.recyclerview.enums.MainButtonEnum;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButton();
    }

    private void setButton() {
        Stream.of(MainButtonEnum.values()).forEach(item -> {
            Button button = (Button) findViewById(item.getId());
            button.setOnClickListener(view -> startActivity(new Intent(this, item.getActivityClass())));
        });
    }

}
