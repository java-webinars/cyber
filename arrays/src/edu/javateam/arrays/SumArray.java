package edu.javateam.arrays;

public class SumArray
{
    public static void main(String[] args) {
//        int[] test = new int[10];
//        for (int i = 0; i < test.length; i++) {
              // Random number from 0 to 100
//            test[i] = (int) Math.round(Math.random() * 100);
//        }
//                     0,  1, 2, 3
        int[] test = {15, 16, 1, 4};

        int sum = 0;
        for (int i = 0; i < test.length; i++) {
            int currentNumber = test[i];
            sum = sum + currentNumber;
        }
        System.out.println("Sum:" + sum + " for " + test.length + " digits");
    }
}
