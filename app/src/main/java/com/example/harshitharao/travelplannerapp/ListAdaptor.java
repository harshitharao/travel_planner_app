package com.example.harshitharao.travelplannerapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ListAdaptor extends RecyclerView.Adapter<ListAdaptor.ListViewHolder> {
    private List<Post> posts;

    public ListAdaptor(List<Post> posts) {
        this.posts = posts;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View postView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_post, viewGroup,false);
        return new ListViewHolder(postView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder listViewHolder, int position) {
        Post post = posts.get(position);
        listViewHolder.titleView.setText(post.getTitle());
        listViewHolder.bodyView.setText(post.getBody());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        private final TextView titleView;
        private final TextView bodyView;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            titleView = (TextView) itemView.findViewById(R.id.post_title);
            bodyView = itemView.findViewById(R.id.post_body);
        }
    }
}
