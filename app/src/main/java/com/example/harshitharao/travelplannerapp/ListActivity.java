package com.example.harshitharao.travelplannerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        PostsRepository postsRepository = new PostsRepository();
        List<Post> posts = postsRepository.getPostsSync();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));

        ListAdaptor listAdaptor =  new ListAdaptor(posts);
        recyclerView.setAdapter(listAdaptor);
    }

}
