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

public class FoodRecomendationAdapter extends RecyclerView.Adapter<FoodRecomendationAdapter.FoodRecomendationViewHolder>{
    private ArrayList<Food> listFood;
    private OnItemClickCallback onItemClickCallback;

    public FoodRecomendationAdapter(ArrayList<Food> list) {
        this.listFood = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public FoodRecomendationAdapter.FoodRecomendationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_recomendation, parent, false);
        return new FoodRecomendationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodRecomendationAdapter.FoodRecomendationViewHolder holder, int position) {
        Food food = listFood.get(position);
        Glide.with(holder.itemView.getContext())
                .load(food.getPhoto())
                .apply(new RequestOptions().override(61, 52))
                .into(holder.imgPhoto);
        holder.foodTitle.setText(food.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(food);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }


    public class FoodRecomendationViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView foodTitle;
        public FoodRecomendationViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            foodTitle = itemView.findViewById(R.id.food_title);
        }
    }
}
