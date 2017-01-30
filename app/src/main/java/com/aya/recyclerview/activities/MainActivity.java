package com.aya.recyclerview.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aya.recyclerview.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickLinearLayoutManagerButton(View view) {
        startActivity(new Intent(this, LinearLayoutManagerActivity.class));
    }

    public void onClickHorizontalButton(View view) {
        startActivity(new Intent(this, HorizontalLinearLayoutManagerActivity.class));
    }

    public void onClickReverseLayoutButton(View view) {
        startActivity(new Intent(this, ReverseLayoutLinearLayoutManagerActivity.class));
    }

    public void onClickStackFromEndButton(View view) {
        startActivity(new Intent(this, StackFromEndLinearLayoutManagerActivity.class));
    }

    public void onClickGridLayoutManagerButton(View view) {
        startActivity(new Intent(this, GridLayoutManagerActivity.class));
    }

    public void onClickDivisibleByTenButton(View view) {
        startActivity(new Intent(this, DivisibleByTenGridLayoutManagerActivity.class));
    }

    public void onClickStaggeredGridLayoutManagerButton(View view) {
        startActivity(new Intent(this, StaggeredGridLayoutManagerActivity.class));
    }

    public void onClickDividerItemDecorationButton(View view) {
        startActivity(new Intent(this, DividerItemDecorationActivity.class));
    }

    public void onClickChangeLineColorButton(View view) {
        startActivity(new Intent(this, ChangeLineColorDividerItemDecorationActivity.class));
    }

    public void onClickItemClickButton(View view) {
        startActivity(new Intent(this, ItemClickActivity.class));
    }

    public void onClickNotifyButton(View view) {
        startActivity(new Intent(this, NotifyActivity.class));
    }

    public void onClickHeaderFooterButton(View view) {
        startActivity(new Intent(this, HeaderFooterActivity.class));
    }

}
