package com.docoding.challangendp.betterMe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.docoding.challangendp.R;

public class DetailfoodActivity extends AppCompatActivity {
    private TextView foodTitle, foodDesc;
    private ImageView foodImage;

    public static final String ITEM_EXTRA = "detail_food";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailfood);

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
}