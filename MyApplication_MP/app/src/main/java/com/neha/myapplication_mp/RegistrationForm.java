package com.neha.myapplication_mp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class RegistrationForm extends AppCompatActivity {


            EditText etFullName, etMobileNumber;
            RadioGroup rgGender;
            Spinner spCountry;
            CheckBox cbPlaying, cbReading, cbTravelling;
            Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration_form);

        etFullName = findViewById(R.id.etFullname);
        etMobileNumber = findViewById(R.id.etMobileNumber);
        rgGender = findViewById(R.id.rgGender);
        spCountry = findViewById(R.id.spCountry);
        cbPlaying = findViewById(R.id.cbPlaying);
        cbTravelling = findViewById(R.id.cbTravelling);
        cbReading = findViewById(R.id.cbReading);
        btnSubmit = findViewById(R.id.btnSubmit);


        String [] countriesList = {"Nepal" , "USA" , "Bhutan" , "Australia" , "Canada" , "UK"};
        ArrayAdapter<String> countriesAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,countriesList);
        spCountry.setAdapter(countriesAdapter);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fullNameValue = etFullName.getText().toString();
                double mobileNumberValue = Double.parseDouble(etMobileNumber.getText().toString());

                int selectedRgId = rgGender.getCheckedRadioButtonId();
                String gender = " ";

                if(selectedRgId !=-1){
                    RadioButton selectedGender = findViewById(selectedRgId);
                    gender = selectedGender.getText().toString();
                }

                String country = spCountry.getSelectedItem().toString();

                ArrayList<String> hobbiesList = new ArrayList<>();
                if(cbReading.isChecked()){
                    hobbiesList.add("Reading");
                }
                if(cbPlaying.isChecked()){
                    hobbiesList.add("Playing");
                }
                if(cbTravelling.isChecked()){
                    hobbiesList.add("Travelling");
                }

                Intent intent = new Intent(RegistrationForm.this, UserDetailsActivity.class);
                intent.putExtra("full_name",fullNameValue);
                intent.putExtra("mobile_number",mobileNumberValue);
                intent.putExtra("gender",gender);
                startActivity(intent);

                Toast.makeText(RegistrationForm.this, fullNameValue + " / " + mobileNumberValue, Toast.LENGTH_LONG).show();


            }
        });

    }
}