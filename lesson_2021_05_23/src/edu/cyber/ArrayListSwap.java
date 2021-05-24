package edu.cyber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * In this assignment you will swap a position in an array list with another.
 * swap() gets 3 arguments, an Arraylist, a position, and another position to swap with.
 * Example
 * swap(["one","two","three"],0,2)
 * returns:["three","two","one"]
 * swap(["a","c","b","d","e"],0,3)
 * returns:["d","c","b","a","e"]
 */
public class ArrayListSwap
{
    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<>();
        test.addAll(Arrays.asList("one", "two", "three"));
        swap(test, 0, 2);
        System.out.println(test);
    }

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {
        Collections.swap(list, pos1, pos2);
        return list;

//        String elementOne = list.get(pos1);
//        String elementTwo = list.get(pos2);
//        list.set(pos2, elementOne);
//        list.set(pos1, elementTwo);
//        return list;
    }
}
