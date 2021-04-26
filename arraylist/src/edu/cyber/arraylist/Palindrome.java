package edu.cyber.arraylist;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String source = scan.nextLine();

//        boolean check = isPalindrome(source);
        boolean check = isPalindromeMature(source);
        System.out.println(check);
    }

    public static boolean isPalindrome(String source) {
        String target = "";
        for (int i = source.length() - 1; i >= 0; i--) {
            target = target + source.charAt(i);
            /**
             * "civic"
             * i = 4
             * source.charAt(4) = 'c'
             * target = "c";
             *
             * i = 3
             * source.charAt(3) = 'i'
             * target = "ci";
             *
             * i = 2
             * source.charAt(2) = 'v'
             * target = "civ";
             *
             */
        }
        return target.equalsIgnoreCase(source);
    }

    public static boolean isPalindromeMature(String source) {
        StringBuffer sb = new StringBuffer(source);
        String target = sb.reverse().toString();
        return target.equalsIgnoreCase(source);
    }
}
