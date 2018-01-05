package com.hello.kaiser.exampleadapter.factory;

import android.view.View;

import com.hello.kaiser.exampleadapter.model.Cat;
import com.hello.kaiser.exampleadapter.model.Dog;
import com.hello.kaiser.exampleadapter.viewHolder.AbstractViewHolder;

/**
 * Created by kaiser on 2018/1/5.
 */

public interface TypeFactory {

    int type(Dog dog);

    int type(Cat cat);

    AbstractViewHolder onCreateViewHolder(View itemView, int viewType);
}
