package com.neha.myapplication_mp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AlertDialogActivity extends AppCompatActivity {

    Button btnShowAlertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_alert_dialog);
        btnShowAlertDialog = findViewById(R.id.btn_show_alert_dialog);
    }

    @Override
    protected void onStart(){
        super.onStart();
        btnShowAlertDialog.setOnClickListener(v ->{
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(AlertDialogActivity.this);
            alertDialogBuilder.setTitle("LogOut!!");
            alertDialogBuilder.setMessage("Are you sure you want to logout?");

            alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Toast.makeText(AlertDialogActivity.this,"Yes Clicked",Toast.LENGTH_SHORT);
                }
            });

            alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });

            alertDialogBuilder.setNeutralButton("MayBe", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        });
    }
}