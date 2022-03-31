package com.docoding.challangendp.betterMe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.docoding.challangendp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DetailfoodActivity extends AppCompatActivity {
    private TextView foodTitle, foodDesc;
    private ImageView foodImage;

    public static final String ITEM_EXTRA = "detail_food";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailfood);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        foodTitle = findViewById(R.id.detail_food_title);
        foodDesc = findViewById(R.id.detail_food_desc);
        foodImage = findViewById(R.id.detail_img_food);

        Food food = (Food) getIntent().getSerializableExtra(ITEM_EXTRA);

        if (food != null) {
            Glide.with(this)
                    .load(food.getPhoto())
                    .into(foodImage);
            foodTitle.setText(food.getName());
            foodDesc.setText(food.getDetail());
        }

    }


    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.home_recomendation_page:
                    Intent recomendationActivity = new Intent(DetailfoodActivity.this, RecomendationActivity.class);
                    startActivity(recomendationActivity);
                    break;
                case R.id.explore_page:
                    Intent exploreActivity = new Intent(DetailfoodActivity.this, ExploreActivity.class);
                    startActivity(exploreActivity);
                    break;
                case R.id.user_profile_page:
                    Intent userProfileActivity = new Intent(DetailfoodActivity.this, ProfileActivity.class);
                    startActivity(userProfileActivity);
                    break;
            }

            return true;
        }
    };
}