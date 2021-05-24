package edu.cyber;

public class TwoDimArray
{
    public static void main(String[] args) {
        int[][] test2 = new int[4][5];
        int[][][] test3 = new int[4][5][6];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                test2[i][j] = (i + 1) * 10 + (j + 1);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(test2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----->>>");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 6; k++) {
                    test3[i][j][k] = (i + 1) * 100 + (j + 1) * 10 + (k + 1);
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 6; k++) {
                    System.out.print(test3[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}