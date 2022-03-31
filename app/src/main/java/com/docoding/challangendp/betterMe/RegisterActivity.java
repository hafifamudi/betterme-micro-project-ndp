package com.docoding.challangendp.betterMe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.docoding.challangendp.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        Button registerUserNext = findViewById(R.id.btn_register);
        registerUserNext.setOnClickListener(this);

        Button loginUserPage = findViewById(R.id.login_user_page);
        loginUserPage.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_register) {
            Intent registerUserNext = new Intent(RegisterActivity.this, CongratsActivity.class);
            startActivity(registerUserNext);
        }

        if (view.getId() == R.id.login_user_page) {
            Intent loginUserPage = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(loginUserPage);
        }
    }
}