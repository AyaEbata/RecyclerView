package com.aya.recyclerview.views;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerViewAdapter extends ArrayAdapter<String, ViewHolder> {

    protected void onItemClicked(String text) {
        // 個々の呼び出しで実装
    }

    public RecyclerViewAdapter(List<String> objects) {
        super(objects);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        final ViewHolder holder = ViewHolder.create(inflater, parent);

        holder.itemView.setOnClickListener(view -> {
            final int position = holder.getAdapterPosition();
            final String text = objects.get(position);
            onItemClicked(text);
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final String text = objects.get(position);
        holder.textView.setText(text);
    }

    @Override
    public int getItemCount() {
        return objects.size();
    }

}
