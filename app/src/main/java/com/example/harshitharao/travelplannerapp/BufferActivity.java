package com.example.harshitharao.travelplannerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BufferActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buffer);
        String initialTime = getIntent().getStringExtra("initialTime");
        TextView initialTimeView = findViewById(R.id.initial_time);
        initialTimeView.setText(initialTime);
    }

    public void calculate(View view) {
        int initialTime = Integer.parseInt(((TextView) findViewById(R.id.initial_time)).getText().toString());
        int buffer = Integer.parseInt(((EditText) findViewById(R.id.buffer)).getText().toString());
        String totalTimeTaken = String.valueOf(initialTime + buffer);

        TextView totalTime = findViewById(R.id.total_time);
        totalTime.setText(totalTimeTaken);
    }

}
