package com.example.gettingstarted.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gettingstarted.R;
import com.example.gettingstarted.model.MyModel;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.HassanHolder> {


    ArrayList<MyModel> data ;
    Context context;


    public MyAdapter(ArrayList<MyModel> data, Context context) {
        this.data = data;
        this.context = context;
    }


    @NonNull
    @Override
    public HassanHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        HassanHolder holder;
        View v ;
        v = LayoutInflater.from(context).inflate(R.layout.adapter, viewGroup, false);
        holder = new HassanHolder(v);
        return  holder;

    }

    @Override
    public void onBindViewHolder(@NonNull HassanHolder holder, int pos) {

        holder.name.setText(data.get(pos).getName());
        holder.address.setText(data.get(pos).getAddress());

    }

    @Override
    public int getItemCount() {

        return data.size();

    }

    public class HassanHolder extends RecyclerView.ViewHolder{


        public HassanHolder(@NonNull View itemView) {

            super(itemView);
            Initializing();


        }

        TextView name , address;

        private void Initializing() {

            name = itemView.findViewById(R.id.name);
            address = itemView.findViewById(R.id.address);


        }
    }
}
