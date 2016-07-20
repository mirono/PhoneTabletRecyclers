package com.mirono.phonetabletrecyclers;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Miron on 7/20/2016.
 */
public class TypeARecyclerViewAdapter extends RecyclerView.Adapter<SimpleViewHolder> {

    @Override
    public int getItemCount() {
        return 5;
    }

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, null);
        return new SimpleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        holder.title.setText("Recycler Type A - " + ++position);
    }

}