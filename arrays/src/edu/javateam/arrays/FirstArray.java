package edu.javateam.arrays;

public class FirstArray
{
    public static void main(String[] args) {
        double[] second = {1.0, 5.6};
        System.out.println(second[0] + ":" + second[1]);
        second[0] = 9.0;
        second[1] = 18.5;
        System.out.println(second[0] + ":" + second[1]);

        int size = 5 + 5;
        int[] first = new int[size];

        for (int i = 0; i < first.length; i+=2) {
            first[i] = (i + 1) * 100;
        }
        for (int i = 1; i < first.length; i+=2) {
            first[i] = (i + 1) * 100;
        }

        for(int s : first) {
            System.out.println(s);
        }

        // Similar previous loop
//        for (int i = 0; i < first.length; i++) {
//            int s = first[i];
//            System.out.println(s);
//        }

    }
}
