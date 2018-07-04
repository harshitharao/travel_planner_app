package com.example.harshitharao.travelplannerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TravelPlannerActivity extends AppCompatActivity {
    private int TIME_ACTIVITY_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_planner);
    }

    public void calculate(View view) {
        int distance = Integer.parseInt(((EditText) findViewById(R.id.distance)).getText().toString());
        int velocity = Integer.parseInt(((EditText) findViewById(R.id.velocity)).getText().toString());

        TextView timeView = findViewById(R.id.time);
        String time = String.valueOf(distance/velocity);
        timeView.setText(time);

        Intent timeIntent = new Intent(this, BufferActivity.class).putExtra("initialTime", time);
        startActivityForResult(timeIntent, TIME_ACTIVITY_CODE);
    }
}
