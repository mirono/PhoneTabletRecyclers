package com.mirono.phonetabletrecyclers;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Miron on 7/20/2016.
 */
public class SimpleViewHolder extends RecyclerView.ViewHolder {

    public TextView title;

    public SimpleViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.text);
    }
}