package com.example.dicoding;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListHandphoneAdapter extends RecyclerView.Adapter<ListHandphoneAdapter.CategoryViewHolder> {
    private ArrayList<hp_android> listHP;

    public ListHandphoneAdapter(ArrayList<hp_android> list){
        this.listHP = list;
    }

    public ListHandphoneAdapter(View view) {
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_hp,parent,false);
    return new CategoryViewHolder(view);

    }

    @Override
    public int getItemCount() {
        return listHP.size();
    }

    @Override
    public void onBindViewHolder(@NonNull final CategoryViewHolder holder, int position) {
        hp_android HP = listHP.get(position);

        Glide.with(holder.itemView.getContext())
                .load(hp_android.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(HP.getName());
        holder.tvFrom.setText(HP.getFrom());
    }



  class CategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvFrom;

         CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvFrom = itemView.findViewById(R.id.tv_item_from);
        }
    }
}
