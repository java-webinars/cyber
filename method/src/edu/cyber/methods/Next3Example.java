package edu.cyber.methods;

import java.util.Scanner;

/**
 Create a method called next3 . This method has an int argument and prints
 the next 3 numbers after that number. Call the method from main method and
 pass num to it.

 flow:

 enter number
 1
 next 3 are:
 2 3 4
 */

public class Next3Example
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int initValue = s.nextInt();

        next3(initValue);
    }

    public static void next3(int initValue) {
        System.out.println("next 3 are:");
        for(int i = 0; i < 3; i++) {
            System.out.print(++initValue + (i == 2 ? "" : " "));
        }
        System.out.println();
    }

}
