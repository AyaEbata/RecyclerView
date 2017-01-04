package com.aya.recyclerview.enums;

import android.support.v7.widget.GridLayoutManager;

import com.aya.recyclerview.HorizontalLinearLayoutManagerActivity;
import com.aya.recyclerview.LinearLayoutManagerActivity;
import com.aya.recyclerview.R;
import com.aya.recyclerview.ReverseLayoutLinearLayoutManagerActivity;
import com.aya.recyclerview.StackFromEndLinearLayoutManagerActivity;

public enum MainButtonEnum {

    LINEAR_LAYOUT_MANAGER(R.id.linear_layout_manager_button, LinearLayoutManagerActivity.class),
    HORIZONTAL(R.id.horizontal_button, HorizontalLinearLayoutManagerActivity.class),
    REVERSE_LAYOUT(R.id.reverse_layout_button, ReverseLayoutLinearLayoutManagerActivity.class),
    STACK_FROM_END(R.id.stack_from_end_button, StackFromEndLinearLayoutManagerActivity.class),
    GRID_LAYOUT_MANAGER(R.id.grid_layout_manager_button, GridLayoutManager.class);

    private final int id;
    private final Class activityClass;

    private MainButtonEnum(final int id, final Class activityClass) {
        this.id = id;
        this.activityClass = activityClass;
    }

    public int getId() {
        return id;
    }

    public Class getActivityClass() {
        return activityClass;
    }

}
