package com.docoding.challangendp.betterMe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.widget.Toast;

import com.docoding.challangendp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class RecomendationActivity extends AppCompatActivity {
    private RecyclerView foodRecomend, foodStrict;
    private ArrayList<Food> listRecomendFood = new ArrayList<>();
    private ArrayList<Food> listStrictFood = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recomendation);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        foodRecomend = findViewById(R.id.food_recomendation);
        foodRecomend.setHasFixedSize(true);

        foodStrict = findViewById(R.id.food_strict);
        foodStrict.setHasFixedSize(true);

        listRecomendFood.addAll(FoodRecomendation.ListData());
        listStrictFood.addAll(FoodStrict.ListData());

        showRecycleListFoodRecomendation();
        showRecycleListFoodStrict();
    }

    public void showRecycleListFoodRecomendation() {
        foodRecomend.setLayoutManager(new LinearLayoutManager(this));
        FoodRecomendationAdapter listFoodRecomendationAdapter = new FoodRecomendationAdapter(listRecomendFood);
        foodRecomend.setAdapter(listFoodRecomendationAdapter);

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
        foodStrict.setLayoutManager(new LinearLayoutManager(this));
        FoodStrictAdapter listFoodStrictAdapter = new FoodStrictAdapter(listStrictFood);
        foodStrict.setAdapter(listFoodStrictAdapter);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.home_recomendation_page:
                    Toast.makeText(RecomendationActivity.this, "You're in the recomendation page", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.explore_page:
                    Intent recomendationActivity = new Intent(RecomendationActivity.this, ExploreActivity.class);
                    startActivity(recomendationActivity);
                    break;
                case R.id.user_profile_page:
                    Intent userProfileActivity = new Intent(RecomendationActivity.this, ProfileActivity.class);
                    startActivity(userProfileActivity);
                    break;
            }
            return true;
        }
    };
}