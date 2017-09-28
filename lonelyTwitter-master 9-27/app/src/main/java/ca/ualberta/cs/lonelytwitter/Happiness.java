package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Jimmy on 2017/9/14.
 */

public class Happiness extends Feeling {
    public Happiness(String mood) {
        super(mood);
    }

    public Happiness(String message, Date date) {
        super(message, date);
    }

    public Boolean isHappiness() {
        return Boolean.TRUE;
    }
}
