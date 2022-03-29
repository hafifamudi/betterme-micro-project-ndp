package com.docoding.challangendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.docoding.challangendp.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView email;
    private TextView password;
    private TextView loginPasswordHide;

    public static final String USER_DATA = "user_register";
    User getUserData = new User();
    private static ArrayList<User> usersData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email_login);
        password = findViewById(R.id.password_login);
        loginPasswordHide = findViewById(R.id.show_hide_counter_login);

        ImageButton loginHidePasswordButton = findViewById(R.id.show_hide_password_login);
        loginHidePasswordButton.setOnClickListener(this);

        Button registerScreen = findViewById(R.id.goto_register);
        registerScreen.setOnClickListener(this);

        Button loginFunction = findViewById(R.id.login_user);
        loginFunction.setOnClickListener(this);

        getUserData = (User) getIntent().getSerializableExtra(USER_DATA);

        if(getUserData != null) {
            usersData.add(getUserData);
        }

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.goto_register) {
            Intent registerActivity = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(registerActivity);
        } else if (view.getId() == R.id.login_user) {
            String emailLogin = email.getText().toString().trim();
            String passwordLogin = password.getText().toString().trim();


            boolean isEmptyField = false;

            if (TextUtils.isEmpty(emailLogin)) {
                isEmptyField = true;
                email.setError("Mohon Field Email untuk di isi");
            }

            if (TextUtils.isEmpty(passwordLogin)) {
                isEmptyField = true;
                password.setError("Mohon Field Password untuk di isi");
            }

            if (!isEmptyField) {

                if (getUserData != null) {
                    List<User> getUserDataFromList = usersData.stream().
                            filter(user -> user.getEmail().equals(emailLogin))
                            .collect(Collectors.toList());

                    String userDataEmail = "";
                    String userDataPassword = "";
                    String userDataName = "";

                    for (User user: getUserDataFromList) {
                        userDataEmail = user.getEmail();
                        userDataPassword = user.getPassword();
                        userDataName = user.getUsername();
                    }

                    if (emailLogin.equals(userDataEmail) && passwordLogin.equals(userDataPassword)) {
                        Toast.makeText(LoginActivity.this, "Login Berhasil, Selamat Datang " + userDataName, Toast.LENGTH_LONG).show();
                    }

                    if (!emailLogin.equals(userDataEmail) || !passwordLogin.equals(userDataPassword)) {
                        Toast.makeText(LoginActivity.this, "Email atau Password anda salah!", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(LoginActivity.this, "Silahkan melakukan registrasi terlebih dahulu!", Toast.LENGTH_LONG).show();
                }
            }

        }else if (view.getId() == R.id.show_hide_password_login) {
            if (loginPasswordHide.getText().toString().equals("hide")) {
                password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                loginPasswordHide.setText("show");
            } else {
                password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                loginPasswordHide.setText("hide");
            }
        }
    }
}