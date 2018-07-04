package com.example.harshitharao.travelplannerapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class TravelPlannerActivity extends AppCompatActivity {
    private static final int TIME_ACTIVITY_CODE = 1;
    private static final int CAMERA_ACTIVITY_CODE = 2;

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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == TIME_ACTIVITY_CODE) {
            if (resultCode == RESULT_OK) {
                String totalTime = data.getStringExtra("totalTime");
                TextView totalTimeView = findViewById(R.id.total_time);
                totalTimeView.setText(totalTime);
            }
        }
        if (requestCode == CAMERA_ACTIVITY_CODE) {
            if (resultCode == RESULT_OK) {
                ImageView imageView = findViewById(R.id.image);
                imageView.setImageBitmap((Bitmap) data.getExtras().get("data"));
            }
        }
    }

    public void capture(View view) {
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent, CAMERA_ACTIVITY_CODE);
    }
}
