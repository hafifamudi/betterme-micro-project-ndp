package com.docoding.challangendp.betterMe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.docoding.challangendp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }


    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.home_recomendation_page:
                    Intent homeActivity = new Intent(ProfileActivity.this, RecomendationActivity.class);
                    startActivity(homeActivity);
                    break;
                case R.id.explore_page:
                    Intent recomendationActivity = new Intent(ProfileActivity.this, ExploreActivity.class);
                    startActivity(recomendationActivity);
                    break;
                case R.id.user_profile_page:
                    Toast.makeText(ProfileActivity.this, "You're in the profile page", Toast.LENGTH_SHORT).show();
                    break;
            }
            return true;
        }
    };
}