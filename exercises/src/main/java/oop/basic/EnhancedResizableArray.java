package oop.basic;

import java.util.Arrays;

/**
 * A class representing a resizable array.
 */
public class EnhancedResizableArray {
    static final int DEFAULT_CAPACITY = 4;
    private int[] v;

    /**
     * Creating an empty resizable array (the underlying int[] has a default capacity of 4 items).
     */
    public EnhancedResizableArray() {
        v = new int[DEFAULT_CAPACITY];
    }

    /**
     *
     * @param arr is the original array.
     * @param newSize is the new Size.
     * @return a new array with increase Size.
     */
    public static int[] increaseArraySize(int[] arr, int newSize) {
        int[] newArr = new int[newSize];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }

    /**
     *
     * @param index specified index.
     * @return the element at the specified index.
     */
    public int get(int index) {
        return v[index];
    }

    /**
     * Setting the element at the specified index with value.
     * @param index of the array to be set.
     * @param value the new value to be set.
     */
    public void set(int index, int value) {
        if (index >= DEFAULT_CAPACITY) {
            v = increaseArraySize(v, 2 * index);
        }
        v[index] = value;
    }

    /**
     *
     * @param value to be searched into array.
     * @return true if the specified value is contained within the internal array.
     */
    public boolean contains(int value) {
        for (int num : v) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Setting all the elements of the internal array to the specified value.
     * @param value specified value.
     */
    public void fill(int value) {
        Arrays.fill(v, value);
    }

    /**
     *
     * @return the capacity of the internal array.
     */
    public int length() {
        return v.length;
    }

    /**
     *
     * @return a copy of the internal array.
     */
    public int[] toArray() {
        int[] ans = new int[length()];
        System.arraycopy(v, 0, ans, 0, v.length);
        return ans;
    }
}
