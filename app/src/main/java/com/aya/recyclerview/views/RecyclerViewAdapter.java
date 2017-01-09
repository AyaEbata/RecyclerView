package com.aya.recyclerview.views;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    @NonNull
    public final List<String> data;

    public RecyclerViewAdapter(@NonNull List<String> data) {
        this.data = data;
    }

    protected void onItemClicked(String text) {
        // 個々の呼び出しで実装
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        final ViewHolder holder = ViewHolder.create(inflater, parent);

        holder.itemView.setOnClickListener(view -> {
            final int position = holder.getAdapterPosition();
            final String text = data.get(position);
            onItemClicked(text);
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final String text = data.get(position);
        holder.textView.setText(text);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

}
