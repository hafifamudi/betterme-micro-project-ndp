package com.docoding.challangendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.docoding.challangendp.model.User;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText username;
    private EditText email;
    private EditText phoneNumber;
    private EditText password;
    private EditText confirmPassword;
    private TextView showHidePassword;
    private TextView showHidePasswordConfirm;

    public User userModel = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        phoneNumber = findViewById(R.id.phone_number);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.confirm_password);
        showHidePassword = findViewById(R.id.show_hide_counter);
        showHidePasswordConfirm = findViewById(R.id.show_hide_counter_confirm);

        Button loginScreen = findViewById(R.id.goto_login);
        loginScreen.setOnClickListener(this);

        Button registerUser = findViewById(R.id.register_user);
        registerUser.setOnClickListener(this);

        ImageButton showHidePasswordButton = findViewById(R.id.show_hide_password);
        showHidePasswordButton.setOnClickListener(this);

        ImageButton showHidePasswordConfirmButton = findViewById(R.id.show_hide_password_confirm);
        showHidePasswordConfirmButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.goto_login) {
            Intent loginActivity = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(loginActivity);
        } else if (view.getId() == R.id.register_user) {
            String getUsername = username.getText().toString().trim();
            String getEmail = email.getText().toString().trim();
            String getPhoneNumber = phoneNumber.getText().toString().trim();
            String getPassword = password.getText().toString().trim();
            String getConfirmPassword = confirmPassword.getText().toString().trim();

            boolean isEmptyField = false;
            boolean isPasswordConfirm = false;

            if (TextUtils.isEmpty(getUsername)) {
                isEmptyField = true;
                username.setError("Mohon Field Email untuk di isi");
            }
            if (TextUtils.isEmpty(getEmail)) {
                isEmptyField = true;
                email.setError("Mohon Field Email untuk di isi");
            }
            if (TextUtils.isEmpty(getPhoneNumber)) {
                isEmptyField = true;
                phoneNumber.setError("Mohon Field Phone Number untuk di isi");
            }
            if (TextUtils.isEmpty(getPassword)) {
                isEmptyField = true;
                password.setError("Mohon Field Password untuk di isi");
            }
            if (TextUtils.isEmpty(getConfirmPassword)) {
                isEmptyField = true;
                confirmPassword.setError("Mohon Field Confirm Password untuk di isi");
            }

            if (!getPassword.equals(getConfirmPassword)) {
                isPasswordConfirm = true;
                confirmPassword.setError("Password dan Confirm Password tidak sama");
            }

            if (!isEmptyField && !isPasswordConfirm) {
                userModel.setUsername(getUsername);
                userModel.setEmail(getEmail);
                userModel.setPhoneNumber(getPhoneNumber);
                userModel.setPassword(getPassword);
                userModel.setConfirmPassword(getConfirmPassword);

                Intent loginActivity = new Intent(RegisterActivity.this, LoginActivity.class);
                loginActivity.putExtra("user_register", userModel);
                startActivity(loginActivity);
            }
        } else if (view.getId() == R.id.show_hide_password) {
            if (showHidePassword.getText().toString().equals("hide")) {
                password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                showHidePassword.setText("show");
            } else {
                password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                showHidePassword.setText("hide");
            }
        } else if (view.getId() == R.id.show_hide_password_confirm) {
            if (showHidePasswordConfirm.getText().toString().equals("hide")) {
                confirmPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                showHidePasswordConfirm.setText("show");
            } else {
                confirmPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                showHidePasswordConfirm.setText("hide");
            }
        }
    }
}