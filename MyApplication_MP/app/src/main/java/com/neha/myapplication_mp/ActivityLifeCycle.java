package com.neha.myapplication_mp;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityLifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_life_cycle);
        Log.d("ONCREATE","Oncreate Called");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("ONSTART","Onstart Called");

    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("ONRESUME","Onresume Called");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("ONPAUSE","Onpause Called");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("ONSTOP","Onstop Called");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("ONRESTART","Onrestart Called");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("ONDESTROY","Ondestroy Called");
    }

}