package edu.cyber.methods.arrays;

public class ArrayAction
{
    public static void printArray(int[] abc) {
        for (int s : abc) {
            System.out.println(s);
        }
    }

    public static int sumArray(int[] abc) {
        int sum = 0;
        for (int s : abc) {
            sum = sum + s;
        }

        return sum;
    }

    public static int maxArray(int[] abc) {
        int max = Integer.MIN_VALUE;
        for (int s : abc) {
            if (s > max) {
                max = s;
            }
        }

        return max;
    }

    public static int minArray(int[] abc) {
        int min = Integer.MAX_VALUE;
        for (int s : abc) {
            if (s < min) {
                min = s;
            }
        }
        return min;
    }

    public static int[] sumArrays(int[] a1, int[] a2) {
        int[] sum = sumArraysInternal(a1, a2);
        return sum;
    }

    public static int[] sumArrays(int[] a1, int[] a2, int[] a3) {
        int[] sum =  new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            sum[i] = a1[i] + a2[i] + a3[i];
        }

        return sum;
    }

    // Example for private method
    private static int[] sumArraysInternal(int[] a1, int[] a2) {
        int[] sum =  new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            sum[i] = a1[i] + a2[i];
        }

        return sum;
    }

    public static int minSumArray(int[] a1, int[] a2) {
        int sum1 = sumArray(a1);
        int sum2 = sumArray(a2);

        if (sum1 < sum2) {
            return sum1;
        } else {
            return sum2;
        }

//        return sum1 < sum2 ? sum1 : sum2;
    }
 }
