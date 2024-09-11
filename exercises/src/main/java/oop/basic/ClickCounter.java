package oop.basic;

/**
 * A class ClickCounter to keep track of how many times a button is clicked.
 */
public class ClickCounter {
    private int count = 0;

    /**
     *
     * @return returning the current number of clicks
     */
    public int getValue() {
        return count;
    }

    /**
     * increasing the number of clicks of 1 unit.
     */
    public void click() {
        count++;
    }

    /**
     *  decreasing the number of clicks of 1 unit (but preventing negative click values).
     */
    public void undo() {
        if (count > 0) {
            count--;
        }
    }

    /**
     * setting the number of clicks to 0.
     */
    public void reset() {
        count = 0;
    }
}
