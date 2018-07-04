package com.example.harshitharao.travelplannerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TravelPlannerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_planner);
    }

    public void calculate(View view) {
        int distance = Integer.parseInt(((EditText) findViewById(R.id.distnace)).getText().toString());
        int velocity = Integer.parseInt(((EditText) findViewById(R.id.velocity)).getText().toString());

        TextView timeView = findViewById(R.id.time);
        timeView.setText(String.valueOf(distance/velocity));
    }
}
