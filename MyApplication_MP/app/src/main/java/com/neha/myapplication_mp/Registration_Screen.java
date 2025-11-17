package com.neha.myapplication_mp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration_Screen extends AppCompatActivity {

    EditText etName, etEmail, etPassword, etPhone;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_screen); // make sure XML file name matches

        // Reference EditTexts
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etPhone = findViewById(R.id.etPhone);

        // Reference Register button
        btnRegister = findViewById(R.id.btnRegister);

        // Handle button click
        btnRegister.setOnClickListener(v -> {
            String name = etName.getText().toString().trim();
            String email = etEmail.getText().toString().trim();
            String password = etPassword.getText().toString().trim();
            String phone = etPhone.getText().toString().trim();

            // Basic validation
            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || phone.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                // Success message
                Toast.makeText(this, "Registration Successful!", Toast.LENGTH_LONG).show();

                // Optional: Clear fields
                etName.setText("");
                etEmail.setText("");
                etPassword.setText("");
                etPhone.setText("");
            }
        });
    }
}
