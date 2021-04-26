package edu.cyber.arraylist;

import java.util.ArrayList;

public class AllPalindromes
{
    public static void main(String[] args) {
        String str = "mam, daddy, civic, second, helen, aaaaaaaa, bbbbbbbb";
        String[] words = str.split(", ");

        ArrayList<String> list = new ArrayList<>();
        for(String w : words) {
            if (isPalindrome(w)) {
                list.add(w);
            }
        }

        System.out.println(list.toString());
    }

    public static boolean isPalindrome(String source) {
        StringBuffer sb = new StringBuffer(source);
        String target = sb.reverse().toString();
        return target.equalsIgnoreCase(source);
    }

}
