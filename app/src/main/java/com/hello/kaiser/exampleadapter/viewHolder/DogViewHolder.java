package com.hello.kaiser.exampleadapter.viewHolder;

import android.support.annotation.LayoutRes;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.hello.kaiser.exampleadapter.R;
import com.hello.kaiser.exampleadapter.model.Dog;

/**
 * Created by kaiser on 2018/1/5.
 */

public class DogViewHolder extends AbstractViewHolder<Dog> {

    @LayoutRes
    public static final int LAYOUT = R.layout.layout_dog;

    private Spinner mOne, mTwo;

    public DogViewHolder(View itemView) {
        super(itemView);
        mOne = (Spinner) itemView.findViewById(R.id.one_spinner);
        mTwo = (Spinner) itemView.findViewById(R.id.two_spinner);
    }

    @Override
    public void onBindViewHolder(Dog element) {
        mOne.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //DoSomething
                //to reWrite amount of mVisitables and change the words in TextView in Cat
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
