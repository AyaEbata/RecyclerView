package com.aya.recyclerview.views;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class ArrayAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    private final Object lock = new Object();
    protected final List<T> objects;

    public ArrayAdapter() {
        this(new ArrayList<T>());
    }

    public ArrayAdapter(List<T> objects) {
        this.objects = objects;
    }

    public void add(@NonNull T object) {
        final int position;
        synchronized (lock) {
            position = objects.size();
            objects.add(object);
        }
        notifyItemInserted(position);
    }

    public void addAll(@NonNull Collection<? extends T> collection) {
        final int itemCount = collection.size();
        final int positionStart;
        synchronized (lock) {
            positionStart = objects.size();
            objects.addAll(collection);
        }
        notifyItemRangeInserted(positionStart, itemCount);
    }

    public void insert(@NonNull T object, int index) {
        synchronized (lock) {
            objects.add(index, object);
        }
        notifyItemInserted(index);
    }

    public void remove(@NonNull T object) {
        final int position = objects.indexOf(object);
        synchronized (lock) {
            objects.remove(object);
        }
        notifyItemRemoved(position);
    }

}
