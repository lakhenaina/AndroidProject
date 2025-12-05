package com.neha.myapplication_mp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListViewActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listView= findViewById(R.id.lv_example);
    }
    @Override
    protected void onStart(){
        super.onStart();

        String [] courses ={"BCA", "BBA", "CSIT", "BIT", "BE", "BTECH", "ME", "MCA", "MBA"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(ListViewActivity.this,
                android.R.layout.simple_list_item_1,
                courses
        );
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener((parent,view,index,id)-> {
            String selectedCourse = courses[index];
            Toast.makeText(this,"Clicked: "+selectedCourse, Toast.LENGTH_SHORT).show();
            });

    }
}