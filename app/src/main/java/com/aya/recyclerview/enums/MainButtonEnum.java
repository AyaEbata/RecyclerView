package com.aya.recyclerview.enums;

import com.aya.recyclerview.activities.ChangeLineColorDividerItemDecorationActivity;
import com.aya.recyclerview.activities.DividerItemDecorationActivity;
import com.aya.recyclerview.activities.DivisibleByTenGridLayoutManagerActivity;
import com.aya.recyclerview.activities.GridLayoutManagerActivity;
import com.aya.recyclerview.activities.HorizontalLinearLayoutManagerActivity;
import com.aya.recyclerview.activities.ItemClickActivity;
import com.aya.recyclerview.activities.LinearLayoutManagerActivity;
import com.aya.recyclerview.R;
import com.aya.recyclerview.activities.ReverseLayoutLinearLayoutManagerActivity;
import com.aya.recyclerview.activities.StackFromEndLinearLayoutManagerActivity;
import com.aya.recyclerview.activities.StaggeredGridLayoutManagerActivity;

public enum MainButtonEnum {

    LINEAR_LAYOUT_MANAGER(R.id.linear_layout_manager_button, LinearLayoutManagerActivity.class),
    HORIZONTAL(R.id.horizontal_button, HorizontalLinearLayoutManagerActivity.class),
    REVERSE_LAYOUT(R.id.reverse_layout_button, ReverseLayoutLinearLayoutManagerActivity.class),
    STACK_FROM_END(R.id.stack_from_end_button, StackFromEndLinearLayoutManagerActivity.class),
    GRID_LAYOUT_MANAGER(R.id.grid_layout_manager_button, GridLayoutManagerActivity.class),
    DIVISIBLE_BY_TEN(R.id.divisible_by_ten_button, DivisibleByTenGridLayoutManagerActivity.class),
    STAGGERED_GRID_LAYOUT_MANAGER(R.id.staggered_grid_layout_manager_button, StaggeredGridLayoutManagerActivity.class),
    DIVIDER_ITEM_DECORATION(R.id.divider_item_decoration_button, DividerItemDecorationActivity.class),
    CHANGE_LINE_COLOR(R.id.change_line_color_button, ChangeLineColorDividerItemDecorationActivity.class),
    ITEM_CLICK(R.id.item_click_button, ItemClickActivity.class);

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
