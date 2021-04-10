package edu.javateam.arrays;

public class MaxNumber
{
    public static void main(String[] args) {
        int[] test = new int[10];
        for(int i = 0; i < test.length; i++) {
            // Random number from 0 to 100
            test[i] = (int)Math.round(Math.random() * 100);
        }

//        int[] test = {23, 56, 7, 43, 12, 45};

        int max = 0;
        for(int s : test) {
            if (max < s) {
                max = s;
            }
        }

        for(int s : test) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("Max:" + max);

    }
}
