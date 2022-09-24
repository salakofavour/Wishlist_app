package com.example.codepath_wishlist;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class listAdapter extends RecyclerView.Adapter<listAdapter.MyViewHolder>{
    Context context;
    ArrayList<recyclerJoin> join;

    public listAdapter(Context context, ArrayList<recyclerJoin> join){
        this.context = context;
        this.join =  join;
    }

    @NonNull
    @Override
    public listAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // the view inflater
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout, parent, false);
        Log.i("tag", "layout");

        return new listAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull listAdapter.MyViewHolder holder, int position){
        //assign values to the views
    holder.Tname.setText(join.get(position).getName());
    holder.Tprice.setText(join.get(position).getPrice());
    holder.Tstore.setText(join.get(position).getStore());
    /*holder.Tstore.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent search = new Intent(Intent.ACTION_VIEW, Uri.parse(join.getAdap.getStore()));
            ContextCompat.startActivity(context, search, null);
                }
            });
        Log.i("tag", "bind");
    */}

    @Override
    public int getItemCount() {
        // number of views
        return join.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView Tname, Tprice, Tstore;
          public MyViewHolder(@NonNull View itemView){
            super(itemView);
              Tname = itemView.findViewById(R.id.ItemName);
              Tprice = itemView.findViewById(R.id.Price);
              Tstore = itemView.findViewById(R.id.Store);

        }
    }
}
