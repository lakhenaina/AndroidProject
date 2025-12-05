package com.neha.myapplication_mp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GridViewActivity extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grid_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        gridView=findViewById(R.id.gv_example);
    }

    @Override
    protected void onStart() {
        super.onStart();

        String [] countries = {"Nepal", "Bhutan", "Chine", "India", "Burma", "Australia", "USA", "Japan", "UK", "Russia", "Korea", "Myanmar", "Poland", "Switzerland", "Swden", "Argentina", "France"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(GridViewActivity.this,android.R.layout.simple_list_item_1, countries);

        gridView.setAdapter(arrayAdapter);

        gridView.setOnItemClickListener((parent, view,index,id)->{
            String selectedCountry = countries[index];
            Toast.makeText(this, "Selected Country: "+selectedCountry, Toast.LENGTH_SHORT).show();
        });
    }
}