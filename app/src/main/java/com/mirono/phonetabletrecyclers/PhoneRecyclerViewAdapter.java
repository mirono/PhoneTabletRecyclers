package com.mirono.phonetabletrecyclers;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by Miron on 7/20/2016.
 */
public class PhoneRecyclerViewAdapter extends RecyclerView.Adapter<SimpleViewHolder> {

    TypeARecyclerViewAdapter adapterA;
    TypeBRecyclerViewAdapter adapterB;

    public PhoneRecyclerViewAdapter() {
        super();
        adapterA = new TypeARecyclerViewAdapter();
        adapterB = new TypeBRecyclerViewAdapter();
    }

    @Override
    public int getItemCount() {
        return adapterA.getItemCount() + adapterB.getItemCount();
    }

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return adapterA.onCreateViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        if(position < adapterA.getItemCount()) {
            adapterA.onBindViewHolder(holder, position);
            return;
        }
        adapterB.onBindViewHolder(holder, position - adapterA.getItemCount());
    }

}
