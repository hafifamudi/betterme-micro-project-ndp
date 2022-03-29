package com.docoding.challangendp.betterMe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;

import com.docoding.challangendp.R;

import java.util.ArrayList;

public class RecomendationActivity extends AppCompatActivity {
    private RecyclerView food_recomen, food_strict;
    private ArrayList<Food> listRecomendFood = new ArrayList<>();
    private ArrayList<Food> listStrictFood = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recomendation);

        food_recomen = findViewById(R.id.food_recomendation);
        food_recomen.setHasFixedSize(true);

        food_strict = findViewById(R.id.food_strict);
        food_strict.setHasFixedSize(true);

        listRecomendFood.addAll(FoodRecomendation.ListData());
        listStrictFood.addAll(FoodStrict.ListData());

        showRecycleListFoodRecomendation();
        showRecycleListFoodStrict();
    }

    public void showRecycleListFoodRecomendation() {
        food_recomen.setLayoutManager(new LinearLayoutManager(this));
        FoodRecomendationAdapter listFoodRecomendationAdapter = new FoodRecomendationAdapter(listRecomendFood);
        food_recomen.setAdapter(listFoodRecomendationAdapter);

        listFoodRecomendationAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Food food) {
                Intent detailFood = new Intent(RecomendationActivity.this, DetailfoodActivity.class);
                detailFood.putExtra(DetailfoodActivity.ITEM_EXTRA, food);
                startActivity(detailFood);
            }
        });
    }

    public void showRecycleListFoodStrict() {
        food_strict.setLayoutManager(new LinearLayoutManager(this));
        FoodStrictAdapter listFoodStrictAdapter = new FoodStrictAdapter(listStrictFood);
        food_strict.setAdapter(listFoodStrictAdapter);
    }
}