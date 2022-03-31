package com.docoding.challangendp.betterMe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.docoding.challangendp.R;

public class CongratsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.congrats);

        Button loginUser = findViewById(R.id.goto_login_page);
        loginUser.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.goto_login_page) {
            Intent loginActivity = new Intent(CongratsActivity.this, LoginActivity.class);
            loginActivity.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(loginActivity);
            finish();
        }
    }
}