package com.hello.kaiser.exampleadapter.viewHolder;

import android.view.View;

import com.hello.kaiser.exampleadapter.R;
import com.hello.kaiser.exampleadapter.model.Cat;

/**
 * Created by kaiser on 2018/1/5.
 */

public class CatViewHolder extends AbstractViewHolder<Cat> {

    public static final int LAYOUT = R.layout.layout_cat;

    public CatViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void onBindViewHolder(Cat element) {

    }
}
