/*
 * Copyright (c) $2017/9/27 Team 10 feiyang
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by Jimmy on 2017-10-11.
 */

public class TweetList {

    private ArrayList<tweet>  tweets = new ArrayList<tweet>();

    public TweetList(){};

    public void add(tweet tweet){
        tweets.add(tweet);
    }
    public boolean hasTweet(tweet tweet){
        return tweets.contains(tweet);
    }
    public void delete(tweet tweet){
        tweets.remove(tweet);
    }
    public tweet getTweet(int index){
        return tweets.get(index);
    }
}

