package edu.cyber.arraylist;

import java.util.Arrays;

public class ReverseArray
{
    public static void main(String[] args) {
        int[] test = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int[] target1 = new int[test.length];
        for (int i = 0; i < test.length; i++) {
            target1[i] = test[test.length - 1 - i];
            /**
             * i = 0
             * test.length - 1 - i = 8
             * target1[0] = test[8]
             *
             * i = 1
             * test.length - 1 - i = 7
             * target1[1] = test[7]

             * i = 2
             * test.length - 1 - 2 = 6
             * target1[2] = test[6]
             */
        }
        System.out.println("1:" + Arrays.toString(target1));

        int c = 0;
        while(c < test.length) {
            target1[c] = test[test.length - 1 - c];
            c++;
        }
        System.out.println("1:" + Arrays.toString(target1));

        int[] target2 = new int[test.length];
        for (int i = test.length - 1; i >= 0; i--) {
            target2[test.length - 1 - i] = test[i];
        }
        System.out.println("1:" + Arrays.toString(target2));

        System.out.println();
        System.out.print("2:[");
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[test.length - 1 - i] + (i == test.length - 1 ? "" : ", "));
        }
        System.out.println("]");

        System.out.println();
        for (int i = 0; i < test.length / 2; i++) {
            int tmp = test[i];
            test[i] = test[test.length - 1 - i];
            test[test.length - 1 - i] = tmp;
        }
        System.out.println("3:" + Arrays.toString(test));

        int a = 10;
        int b = 30;
        System.out.println("A:" + a + " B:" + b);
        int t = b;
        b = a;
        a = t;
        System.out.println("A:" + a + " B:" + b);

    }
}
