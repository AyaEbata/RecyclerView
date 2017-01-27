package com.aya.recyclerview.views;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

public class HeaderFooterAdapter extends RecyclerView.Adapter {

    public static final int VIEW_TYPE_HEADER = 0;
    public static final int VIEW_TYPE_FOOTER = 1;
    public static final int VIEW_TYPE_ITEM = 2;

    @NonNull
    private final List<String> data;

    protected void onItemClicked(String text) {
        // 個々の呼び出しで実装
    }

    public HeaderFooterAdapter(@NonNull List<String> data) {
        this.data = data;
    }

    @Override
    public int getItemCount() {
        return data.size() + 2;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return VIEW_TYPE_HEADER;
        } else if (position == getItemCount() - 1) {
            return VIEW_TYPE_FOOTER;
        }
        return VIEW_TYPE_ITEM;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        switch (viewType) {
            case VIEW_TYPE_HEADER:
                return HeaderViewHolder.create(inflater, parent);

            case VIEW_TYPE_FOOTER:
                return FooterViewHolder.create(inflater, parent);

            case VIEW_TYPE_ITEM:
                final ViewHolder holder = ViewHolder.create(inflater, parent);
                holder.itemView.setOnClickListener(view -> {
                    final int position = holder.getAdapterPosition();
                    final String text = data.get(position);
                    onItemClicked(text);
                });
                return holder;
        }

        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolder) {
            final ViewHolder viewHolder = (ViewHolder) holder;
            final String text = data.get(position);
            viewHolder.textView.setText(text);
        }
    }

}
