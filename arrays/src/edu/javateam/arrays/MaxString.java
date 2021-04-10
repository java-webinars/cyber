package edu.javateam.arrays;

public class MaxString
{
    public static void main(String[] args) {
        String[] lines = {"mouse", "test", "simple test", "dog", "cat", "screen"};

//        int longestSize = 0;
        String longestString = "";

        for(String s : lines) {
            if(s.length() > longestString.length()) {
                longestString = s;
//                longestSize = s.length();
            }
        }

        System.out.println("The longest string:" + longestString);
        System.out.println("The longest string's size:" + longestString.length());
//        System.out.println("The longest string's size:" + longestSize);

    }
}
