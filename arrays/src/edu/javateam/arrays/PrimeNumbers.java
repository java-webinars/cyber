package edu.javateam.arrays;

public class PrimeNumbers
{
    public static void main(String[] args) {
        int max = 50;

        for (int checkNumber = 11; checkNumber <= max; checkNumber++) {
            // For every 'i'
            boolean prime = true;
            for (int divider = 2; divider < checkNumber / 2; divider++) {
                if (checkNumber % divider == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(checkNumber + " ");
            }
        }
        System.out.println();
    }
}
