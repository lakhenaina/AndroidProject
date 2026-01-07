package com.neha.myapplication_mp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Page extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if(username.isEmpty() || password.isEmpty()){
                    Toast.makeText(Login_Page.this,
                            "Please enter username and password",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Login_Page.this,
                            "Login Successful",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}