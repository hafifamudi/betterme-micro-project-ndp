package com.docoding.challangendp.betterMe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.docoding.challangendp.R;

import java.util.ArrayList;

public class FoodStrictAdapter extends RecyclerView.Adapter<FoodStrictAdapter.FoodStrictViewHolder>{
    private ArrayList<Food> listFood;

    public FoodStrictAdapter(ArrayList<Food> list) {
        this.listFood = list;
    }

    @NonNull
    @Override
    public FoodStrictViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_strict, parent, false);
        return new FoodStrictAdapter.FoodStrictViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodStrictViewHolder holder, int position) {
        Food food = listFood.get(position);
        Glide.with(holder.itemView.getContext())
                .load(food.getPhoto())
                .apply(new RequestOptions().override(61, 52))
                .into(holder.imgPhoto);
        holder.foodTitle.setText(food.getName());
    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }

    public class FoodStrictViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView foodTitle;
        public FoodStrictViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo_strict);
            foodTitle = itemView.findViewById(R.id.food_title_strict);
        }
    }
}
