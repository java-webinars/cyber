package edu.cyber.arraylist;

import java.util.ArrayList;

/**
 * Finish the getWithE. Given a String array arr with the following elements
 * arr -> ["aa", "be", "lol", "lel", "oreo"]
 * <p>
 * fewValues -> ["be",  "lel", "oreo"]
 */
public class FindWithE
{
    public static void main(String[] args) {
        String[] arr = {"aa", "be", "lol", "lel", "oreo"};

        ArrayList<String> result = new ArrayList<>();
        for (String w : arr) {
            if(w.contains("e") || w.contains("E")) {
                result.add(w);
            }
        }

        System.out.println(result);
    }
}
