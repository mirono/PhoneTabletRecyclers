package com.mirono.phonetabletrecyclers;

/**
 * Created by Miron on 7/20/2016.
 */
public class TypeBRecyclerViewAdapter extends TypeARecyclerViewAdapter {

    @Override
    public int getItemCount() {
        return 30;
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        holder.title.setText("Recycler Type B - " + ++position);
    }

}