package edu.javateam.arrays;

public class BreakContinueExample
{
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            if (i % 8 == 0) {
                System.out.println("Found:" + i);
                break;
            }
            System.out.println("Checked:" + i);
        }

        System.out.println();
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
//                break;
            }
            System.out.print("Odd:" + i + " ");
        }

    }
}
