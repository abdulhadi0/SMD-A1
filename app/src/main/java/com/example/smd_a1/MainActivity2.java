package com.example.smd_a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private ImageButton backButton;
    private Intent myIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        // Initialize intent to go back to MainActivity
        myIntent = new Intent(this, MainActivity.class);

        // Find and set click listener for the back button
        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Check if the back button is clicked
        if (v.getId() == backButton.getId()) {
            // Start MainActivity when back button is clicked
            startActivity(myIntent);
        }
    }
}
