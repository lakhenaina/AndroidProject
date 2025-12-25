package com.neha.myapplication_mp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SqliteExampleActivity extends AppCompatActivity {
    EditText etFullName, etAge;
    Button btnCreate, btnRead, btnUpdate, btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sqlite_example);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        etFullName = findViewById(R.id.et_sqlite_example_fullname);
        etAge = findViewById(R.id.et_sqlite_example_age);
        btnCreate=findViewById(R.id.btn_sqlite_example_create);
        btnRead=findViewById(R.id.btn_sqlite_example_read);
        btnUpdate=findViewById(R.id.btn_sqlite_example_update);
        btnDelete=findViewById(R.id.btn_sqlite_example_delete);
    }

    @Override
    protected void onStart() {
        super.onStart();
        String fullName = etFullName.getText().toString();
        int age = Integer.parseInt(etAge.getText().toString());
        btnCreate.setOnClickListener(view ->{

        });

        btnRead.setOnClickListener(view ->{

        });

        btnUpdate.setOnClickListener(view ->{

        });

        btnDelete.setOnClickListener(view ->{

        });
    }
}

