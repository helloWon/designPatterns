package me.designpatterns.behavioral.iterator.after;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import me.designpatterns.behavioral.iterator.before.Post;

public class Board {

    List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public Iterator<Post> getRecentPostIterator() {
        return new RecentPostIterator(this.posts);
    }

}
