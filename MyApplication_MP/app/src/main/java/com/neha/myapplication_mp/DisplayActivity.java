package com.neha.myapplication_mp;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView tvDetails = findViewById(R.id.tvDetails);
        String data = getIntent().getStringExtra("data");
        tvDetails.setText(data);
    }
}
