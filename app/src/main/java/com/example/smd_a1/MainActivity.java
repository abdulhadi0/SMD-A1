package com.example.smd_a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button signupButton;
    private Button exitButton;
    private Intent intentMainActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize intent to start MainActivity2
        intentMainActivity2 = new Intent(this, MainActivity2.class);

        // Find and set click listener for the signup button
        signupButton = findViewById(R.id.btn_signup);
        signupButton.setOnClickListener(this);

        // Find and set click listener for the exit button
        exitButton = findViewById(R.id.exit);
        exitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Check which button is clicked
        if (v.getId() == signupButton.getId()) {
            // Start MainActivity2 when signup button is clicked
            startActivity(intentMainActivity2);
        } else if (v.getId() == exitButton.getId()) {
            // Finish MainActivity and exit app when exit button is clicked
            finish();
            System.exit(0);
        }
    }
}
