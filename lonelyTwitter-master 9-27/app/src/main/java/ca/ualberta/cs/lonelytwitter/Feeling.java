
/*
 * Copyright (c) $2017/9/27 Team 10 feiyang
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Jimmy on 2017/9/14.
 *  an abstract base class which represents the current mood.
 */

public abstract class Feeling {
    private String mood;
    private Date date;
    public Feeling(String mood ){
        this.mood= mood;
        this.date= new Date();
    }

    public Feeling(String message, Date date) {
        this.mood = mood;
        this.date = date;
    }

    public abstract Boolean isHappiness();

    public String getMood(){
        return this.mood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
