package com.excuta.daggerdemo.presentation;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import javax.inject.Inject;

public class InjectedRecyclerViewAdapter extends RecyclerView.Adapter {

    private Picasso picasso;
    private ClickListener clickListener;

    @Inject
    public InjectedRecyclerViewAdapter(Picasso picasso, ClickListener clickListener) {
        this.picasso = picasso;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    //interface to be implemented by fragment
    public interface ClickListener {
        void onItemClick();
    }
}
