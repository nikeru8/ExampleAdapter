package com.hello.kaiser.exampleadapter.model;

import com.hello.kaiser.exampleadapter.factory.TypeFactory;

/**
 * Created by kaiser on 2018/1/5.
 */

public class Cat implements Visitable {
    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
