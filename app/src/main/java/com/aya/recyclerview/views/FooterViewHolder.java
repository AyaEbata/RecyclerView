package com.aya.recyclerview.views;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FooterViewHolder extends RecyclerView.ViewHolder {

    private static final int LAYOUT_ID = android.R.layout.simple_list_item_1;

    @NonNull
    public static FooterViewHolder create(@NonNull LayoutInflater inflater, ViewGroup parent) {
        return new FooterViewHolder(inflater.inflate(LAYOUT_ID, parent, false));
    }

    final TextView textView;

    public FooterViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(android.R.id.text1);
    }

}
