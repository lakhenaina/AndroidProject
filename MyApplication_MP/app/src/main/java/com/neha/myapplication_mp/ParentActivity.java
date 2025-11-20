package com.neha.myapplication_mp;

import android.app.ComponentCaller;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ParentActivity extends AppCompatActivity {
    Button btnParentActivity;
    private static final int REQUEST_CODE = 2010;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_parent);

        btnParentActivity = findViewById(R.id.btn_go_to_child_activity);
    }

    @Override
    protected void onStart() {
        super.onStart();

        btnParentActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ParentActivity.this, ChildActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data, @NonNull ComponentCaller caller) {
        super.onActivityResult(requestCode, resultCode, data, caller);

        if(requestCode == REQUEST_CODE && resultCode == RESULT_OK && data!=null){
            String result = data.getStringExtra("child_data");
            Toast.makeText(this,"Received Data: "+result, Toast.LENGTH_SHORT).show();
        }

    }
}
