package com.neha.myapplication_mp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FragmentParentActivity extends AppCompatActivity {
    FragmentOne fragmentOne = new FragmentOne();
    FragmentTwo fragmentTwo = new FragmentTwo();
    Button btnToggleFragment;
    boolean showFirst = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_fragment_parent);

        btnToggleFragment = findViewById(R.id.btn_toggle_fragment);

    }
    @Override
    protected void onStart(){
        super.onStart();

        btnToggleFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(showFirst) {
                    loadFragment(fragmentOne);
                }else {
                    loadFragment(fragmentTwo);
                }
                showFirst = !showFirst;
            }
        });
    }

    private void loadFragment(Fragment fragment){
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_frame_layout,fragment);
        fragmentTransaction.commit();

    }
}