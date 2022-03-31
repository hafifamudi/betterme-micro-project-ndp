package com.docoding.challangendp.betterMe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.docoding.challangendp.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button registerUser = findViewById(R.id.register_user);
        registerUser.setOnClickListener(this);

        Button loginUser = findViewById(R.id.login_user);
        loginUser.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.register_user) {
            Intent registerActivity = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(registerActivity);
        }

        if(view.getId() == R.id.login_user) {
            Intent diagnosisActivity = new Intent(LoginActivity.this, DiagnosisActivity.class);
            diagnosisActivity.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(diagnosisActivity);
            finish();
        }
    }
}