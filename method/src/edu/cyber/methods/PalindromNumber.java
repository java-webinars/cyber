package edu.cyber.methods;

/**
 * Complete the method isPalindrome() that will check if number is a palindrome.
 * Print your result as a boolean (true or false).
 * <p>
 * Challenge: Do not convert int into a string!
 * <p>
 * Examples:
 * <p>
 * input: 1001
 * output: true
 * input: 2112
 * output: true
 * input: 1234
 * output: false
 */

public class PalindromNumber
{
    public static void main(String[] args) {
        System.out.println(isPalindrome(23432));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temp = number;
        System.out.println(temp);
        while (temp != 0) {
            int lastDigit = temp % 10;
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
            System.out.println(temp + ":" + reverse);
        }
        return reverse == number;
    }
}
