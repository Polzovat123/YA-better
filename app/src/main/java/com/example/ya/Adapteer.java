package com.example.ya;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Icon;
import android.media.Image;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.util.concurrent.TimeoutException;

public class Adapteer extends RecyclerView.Adapter<Adapteer.NumberViewHolder>{

    private static int viewHolderCount;
    private int numItems;
    private static ImageView viewimage;
    private static ImageView[] viewImage;
    private static String []listCompany;

    public Adapteer(int num){
        numItems = num;
        viewHolderCount = 0;
    }

    public Adapteer(int num, String[] n, ImageView[] h){
        numItems = num;
        viewHolderCount = 0;
        listCompany = n;
        viewImage = h;
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
            viewimage = view.findViewById(R.id.img);

        }

        void bind(int list){
            listitemnumberView.setText(listCompany[list]);
            //BitmapDrawable drawable = (BitmapDrawable) viewImage[list].getDrawable();
            //Bitmap bitmap = drawable.getBitmap();
            //viewimage.setImageBitmap(bitmap);
        }

    }

}
