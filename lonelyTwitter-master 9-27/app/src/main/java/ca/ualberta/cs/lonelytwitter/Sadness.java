package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Jimmy on 2017/9/14.
 */

public class Sadness extends Feeling {
    public Sadness(String mood) {
        super(mood);
    }

    public Sadness(String message, Date date) {
        super(message, date);
    }

    public Boolean isHappiness() {
        return Boolean.FALSE;
    }

}
