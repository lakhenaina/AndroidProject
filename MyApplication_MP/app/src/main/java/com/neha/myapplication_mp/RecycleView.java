package com.neha.myapplication_mp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.neha.myapplication_mp.Adapter.CustomCountryAdapter;
import com.neha.myapplication_mp.Model.CountryModel;

import java.util.ArrayList;

public class RecycleView extends AppCompatActivity {

    RecyclerView rvCountries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycle_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rvCountries = findViewById(R.id.rv_countries);
    }

    @Override
    protected void onStart() {
        super.onStart();

        ArrayList<CountryModel> countries = new ArrayList<>();
        CustomCountryAdapter countryAdapter;

        countries.add(new CountryModel("Nepal" , R.mipmap.ic_launcher_round));
        countries.add(new CountryModel("Bhutan",R.mipmap.ic_launcher));

        countryAdapter = new CustomCountryAdapter(RecycleView.this,countries);
        rvCountries.setAdapter(countryAdapter);
    }
}