package com.neha.myapplication_mp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class Registration_Page extends AppCompatActivity {

    EditText etName, etEmail, etMobile, etPassword;
    RadioGroup rgGender;
    Spinner spCountry;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etMobile = findViewById(R.id.etMobile);
        etPassword = findViewById(R.id.etPassword);
        rgGender = findViewById(R.id.rgGender);
        spCountry = findViewById(R.id.spCountry);
        btnSubmit = findViewById(R.id.btnSubmit);

        String[] countries = {"Nepal", "India", "USA", "UK"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_dropdown_item, countries);
        spCountry.setAdapter(adapter);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etName.getText().toString();
                String email = etEmail.getText().toString();
                String mobile = etMobile.getText().toString();
                String password = etPassword.getText().toString();

                int selectedId = rgGender.getCheckedRadioButtonId();
                RadioButton rb = findViewById(selectedId);
                String gender = rb.getText().toString();

                String country = spCountry.getSelectedItem().toString();

                Intent intent = new Intent(Registration_Page.this, DisplayActivity.class);
                intent.putExtra("data",
                        "Name: " + name +
                                "\nEmail: " + email +
                                "\nMobile: " + mobile +
                                "\nPassword: " + password +
                                "\nGender: " + gender +
                                "\nCountry: " + country);

                startActivity(intent);
            }
        });
    }
}