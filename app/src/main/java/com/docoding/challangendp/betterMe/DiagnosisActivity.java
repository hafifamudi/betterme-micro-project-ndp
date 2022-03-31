package com.docoding.challangendp.betterMe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.docoding.challangendp.R;

public class DiagnosisActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diagnosis);

        Button recomendActivity = findViewById(R.id.recomendation_page);
        recomendActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.recomendation_page) {
            Intent recomendationActivity = new Intent(DiagnosisActivity.this, RecomendationActivity.class);
            recomendationActivity.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(recomendationActivity);
            finish();
        }
    }
}