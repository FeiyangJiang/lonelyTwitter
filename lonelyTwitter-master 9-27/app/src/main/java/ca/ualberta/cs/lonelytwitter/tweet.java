/*
 * Copyright (c) $2017/09/27 Team 10 CMPUT 301
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Jimmy on 2017/9/14.
 *
 */

/**
 * Represent a tweet
 *
 * @author team X
 * @version 1.3
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class tweet {
    private String message;
    private Date date;
    public tweet(String message ){
        this.message= message;
        this.date= new Date();
    }

    /**
     * Construct & Tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    public tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();

    /**
     * Set the tweet message
     *
     * @param message tweet message
     * @throws TweetToolongException
     */

    public void setMessage(String message) throws TweetToolongException{
        if (message.length()>140){
            throw new TweetToolongException();

        }else {
            this.message = message;
        }
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    //method used to output string
    @Override
    public String toString(){
        return date.toString()+"|"+ message;
    }
}
