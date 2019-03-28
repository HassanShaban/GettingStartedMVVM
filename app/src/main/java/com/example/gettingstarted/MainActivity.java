package com.example.gettingstarted;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.gettingstarted.adapters.MyAdapter;
import com.example.gettingstarted.model.MyModel;
import com.example.gettingstarted.viewmodel.MyViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    MyAdapter adapter;
    ArrayList<MyModel> data = new ArrayList<>();
    RecyclerView.LayoutManager layoutManager;
    MyViewModel myViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);


        myViewModel.init();

        myViewModel.getnMyModel().observe(this, new Observer<ArrayList<MyModel>>() {
            @Override
            public void onChanged(@Nullable ArrayList<MyModel> myModels) {
                adapter.notifyDataSetChanged();
            }
        });
        initRecyclerView();



    }

    private void initRecyclerView() {

        adapter = new MyAdapter(myViewModel.getnMyModel().getValue() , this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }


}
