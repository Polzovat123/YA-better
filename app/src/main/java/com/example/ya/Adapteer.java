package com.example.ya;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.concurrent.TimeoutException;

public class Adapteer extends RecyclerView.Adapter<Adapteer.NumberViewHolder>{

    private static int viewHolderCount;
    private int numItems;
    private static Image []viewImage;
    private static String []listCompany;

    public Adapteer(int num){
        numItems = num;
        viewHolderCount = 0;
    }

    public Adapteer(int num, Image[] n){
        numItems = num;
        viewHolderCount = 0;
        viewImage = n;
    }

    public Adapteer(int num, String[] n){
        numItems = num;
        viewHolderCount = 0;
        listCompany = n;
    }

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context con = parent.getContext();
        int layoutidforlistItem = R.layout.number_list;

        LayoutInflater inflater = LayoutInflater.from(con);

         View v = inflater.inflate(layoutidforlistItem, parent, false);

         NumberViewHolder viewHolder = new NumberViewHolder(v);

         viewHolder.listitemnumberView.setText("ViewHolder index: "+viewHolderCount);

         viewHolderCount++;

         return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return numItems;
    }

    class NumberViewHolder extends RecyclerView.ViewHolder{

        TextView listitemnumberView;
        TextView text_view_holder;

        public NumberViewHolder(View view){
            super(view);

            listitemnumberView = view.findViewById(R.id.tv_item);
            text_view_holder = view.findViewById(R.id.rv_numbers);


        }

        void bind(int list){
            listitemnumberView.setText(listCompany[list]);
        }

    }

}
