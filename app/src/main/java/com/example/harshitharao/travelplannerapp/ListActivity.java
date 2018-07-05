package com.example.harshitharao.travelplannerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        PostsRepository postsRepository = new PostsRepository();
        List<Post> posts = postsRepository.getPostsSync();

        TextView titleView = findViewById(R.id.title);
        titleView.setText(posts.get(0).getTitle());
        TextView bodyView = findViewById(R.id.body);
        bodyView.setText(posts.get(0).getBody());
    }

}
