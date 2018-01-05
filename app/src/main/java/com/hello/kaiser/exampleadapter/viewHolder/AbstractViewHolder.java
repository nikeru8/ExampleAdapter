package com.hello.kaiser.exampleadapter.viewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by kaiser on 2018/1/5.
 */

public abstract class AbstractViewHolder<T> extends RecyclerView.ViewHolder {

    public AbstractViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void onBindViewHolder(T element);
}
