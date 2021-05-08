package edu.cyber.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MethoExample
{
    public static void main(String[] args) {
        int d1 = max(12, 13, 1);
        int d2 = max(7,18,45);

        int sum = d1 + d2;
        System.out.println(sum);

        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        int a1 = 14;
        int a2 = 7;
        printMax1(a1, a2);
        printMax1(24, 18);
    }

    public static int square(int a) {
        return a * a;
    }

    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        return c;
    }

    public static void printMax1(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}