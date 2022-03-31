package com.docoding.challangendp.betterMe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.docoding.challangendp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class ExploreActivity extends AppCompatActivity {
    private RecyclerView foodExploreInformation;
    private ArrayList<Food> listFoodExploreInformation = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explore);

        foodExploreInformation = findViewById(R.id.food_explore_information);
        foodExploreInformation.setHasFixedSize(true);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        listFoodExploreInformation.addAll(FoodInformation.ListData());

        showRecycleListFoodExploreInformation();
    }


    public void showRecycleListFoodExploreInformation() {
        foodExploreInformation.setLayoutManager(new LinearLayoutManager(this));
        FoodExploreAdapter listFoodRecomendationAdapter = new FoodExploreAdapter(listFoodExploreInformation);
        foodExploreInformation.setAdapter(listFoodRecomendationAdapter);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.home_recomendation_page:
                    Intent recomendationActivity = new Intent(ExploreActivity.this, RecomendationActivity.class);
                    startActivity(recomendationActivity);
                    break;
                case R.id.explore_page:
                    Toast.makeText(ExploreActivity.this, "You're in the explore page", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.user_profile_page:
                    Intent userProfileActivity = new Intent(ExploreActivity.this, ProfileActivity.class);
                    startActivity(userProfileActivity);
                    break;
            }

            return true;
        }
    };
}
