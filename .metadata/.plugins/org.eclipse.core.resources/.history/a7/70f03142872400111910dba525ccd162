package ar.edu.unlp.info.oo2.ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class User {
    
    private String screenName;
    private List<Post> posts;

    public User(String screenName) {
        this.screenName = screenName;
        this.posts = new ArrayList<Post>();
    }

    public void addTweet(String text) {
        this.posts.add(new Tweet(text));
    }

    public void addRetweet(Tweet tweet) {
        this.posts.add(tweet);
    }

    public List<Post> getPosts() {
        return new ArrayList<Post>(this.posts);
    }

    public String getScreenName() {
        return this.screenName;
    }


}
