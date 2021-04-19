package edu.cyber.methods;

import java.util.Arrays;

/**
 * Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
 * You may modify and print the given array, or print a new array.`
 * Example:
 * input: 6, 2, 5, 3
 * <p>
 * output: [2, 5, 3, 6]
 */
public class ShiftLeft
{
    public static void main(String[] args) {
        int[] origin = {6, 2, 5, 3};
        int[] left = new int[origin.length];

        for (int i = 1; i < origin.length; i++) {
            left[i - 1] = origin[i];
        }
        left[left.length - 1] = origin[0];

        System.out.println(Arrays.toString(left));
    }
}
