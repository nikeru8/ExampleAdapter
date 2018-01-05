package com.hello.kaiser.exampleadapter.factory;

import android.view.View;

import com.hello.kaiser.exampleadapter.model.Cat;
import com.hello.kaiser.exampleadapter.model.Dog;
import com.hello.kaiser.exampleadapter.viewHolder.AbstractViewHolder;
import com.hello.kaiser.exampleadapter.viewHolder.CatViewHolder;
import com.hello.kaiser.exampleadapter.viewHolder.DogViewHolder;

/**
 * Created by kaiser on 2018/1/5.
 */

public class LayoutListFactory implements TypeFactory {
    @Override
    public int type(Dog dog) {
        return DogViewHolder.LAYOUT;
    }

    @Override
    public int type(Cat cat) {
        return CatViewHolder.LAYOUT;
    }

    @Override
    public AbstractViewHolder onCreateViewHolder(View itemView, int viewType) {
        AbstractViewHolder createViewHolder = null;
        switch (viewType) {
            case DogViewHolder.LAYOUT:
                createViewHolder = new DogViewHolder(itemView);
                break;
            case CatViewHolder.LAYOUT:
                createViewHolder = new CatViewHolder(itemView);
                break;
        }
        return createViewHolder;
    }
}
