package com.example.harshitharao.travelplannerapp;

import java.util.ArrayList;
import java.util.List;

public class PostsRepository {
    public List<Post> getPostsSync() {
        List<Post> posts = new ArrayList<Post>();
        posts.add(new Post("TITLE1", "DESC1"));
        posts.add(new Post("TITLE2", "DESC2"));
        posts.add(new Post("TITLE3", "DESC3"));
        return posts;
    }
}
