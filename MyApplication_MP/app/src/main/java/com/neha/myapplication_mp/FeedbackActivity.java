package com.neha.myapplication_mp;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity {

    RadioGroup rgQ1, rgQ2;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        rgQ1 = findViewById(R.id.rgQuestion1);
        rgQ2 = findViewById(R.id.rgQuestion2);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {
            if (rgQ1.getCheckedRadioButtonId() == -1 || rgQ2.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "Please answer all questions", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Feedback Submitted Successfully!", Toast.LENGTH_LONG).show();
                finish(); // Optional: go back to welcome screen
            }
        });
    }
}
