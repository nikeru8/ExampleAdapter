package com.hello.kaiser.exampleadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hello.kaiser.exampleadapter.factory.LayoutListFactory;
import com.hello.kaiser.exampleadapter.model.Cat;
import com.hello.kaiser.exampleadapter.model.Dog;
import com.hello.kaiser.exampleadapter.model.Visitable;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(llm);
        List<Visitable> mVisitables = new ArrayList<>();
        mVisitables.add(new Dog());
        mVisitables.add(new Cat());
        mVisitables.add(new Cat());
        mVisitables.add(new Cat());
        mVisitables.add(new Cat());
        mVisitables.add(new Cat());
        MainAdapter adapter = new MainAdapter(new LayoutListFactory(), mVisitables);
        mRecyclerView.setAdapter(adapter);
    }
}
