package com.neha.myapplication_mp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ChildActivity extends AppCompatActivity {
    Button btnChildActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_child);

        btnChildActivity = findViewById(R.id.btn_child_activity);
    }

    @Override
    protected void onStart() {
        super.onStart();

        btnChildActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("child_data", "Hello this is a data from child");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
