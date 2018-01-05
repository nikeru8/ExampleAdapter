package com.hello.kaiser.exampleadapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.hello.kaiser.exampleadapter.factory.TypeFactory;
import com.hello.kaiser.exampleadapter.model.Visitable;
import com.hello.kaiser.exampleadapter.viewHolder.AbstractViewHolder;

import java.util.List;

/**
 * Created by kaiser on 2018/1/5.
 */

public class MainAdapter extends RecyclerView.Adapter<AbstractViewHolder> {
    private TypeFactory mTypeFactory;
    private List<Visitable> mVisitables;

    public MainAdapter(TypeFactory mTypeFactory, List<Visitable> visitables) {
        this.mTypeFactory = mTypeFactory;
        this.mVisitables = visitables;
    }

    @Override
    public int getItemViewType(int position) {
        return mVisitables.get(position).type(mTypeFactory);
    }

    @Override
    public AbstractViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return mTypeFactory.onCreateViewHolder(LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false), viewType);
    }

    @Override
    public void onBindViewHolder(AbstractViewHolder holder, int position) {
        holder.onBindViewHolder(mVisitables.get(position));
    }

    @Override
    public int getItemCount() {
        return mVisitables.size();
    }
}
