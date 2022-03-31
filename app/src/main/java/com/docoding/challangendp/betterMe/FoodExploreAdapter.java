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

public class FoodExploreAdapter extends RecyclerView.Adapter<FoodExploreAdapter.FoodExploreViewHolder> {
    private ArrayList<Food> listFood;

    public FoodExploreAdapter(ArrayList<Food> list) {
        this.listFood = list;
    }

    @NonNull
    @Override
    public FoodExploreAdapter.FoodExploreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_information_explore, parent, false);
        return new FoodExploreViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodExploreViewHolder holder, int position) {
        Food food = listFood.get(position);
        Glide.with(holder.itemView.getContext())
                .load(food.getPhoto())
                .apply(new RequestOptions().override(61, 52))
                .into(holder.imgPhoto);
        holder.foodTitle.setText(food.getName());
        holder.foodCategory.setText(food.getCategory());
    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }


    public class FoodExploreViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView foodTitle;
        TextView foodCategory;

        public FoodExploreViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            foodTitle = itemView.findViewById(R.id.food_title);
            foodCategory = itemView.findViewById(R.id.food_title_category);
        }
    }
}
