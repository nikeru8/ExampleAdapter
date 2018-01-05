package com.hello.kaiser.exampleadapter.viewHolder;

import android.support.annotation.LayoutRes;
import android.view.View;

import com.hello.kaiser.exampleadapter.R;
import com.hello.kaiser.exampleadapter.model.Dog;

/**
 * Created by kaiser on 2018/1/5.
 */

public class DogViewHolder extends AbstractViewHolder<Dog> {

    @LayoutRes
    public static final int LAYOUT = R.layout.layout_dog;

    public DogViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void onBindViewHolder(Dog element) {

    }
}
