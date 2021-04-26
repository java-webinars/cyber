package edu.cyber.arraylist;

public class LongetsPalindrome
{
    public static void main(String[] args) {
//        String str = "civic   mam   dad    second     anna";
        // Split string by whitespaces
//        String[] words = str.split("\\s+");

        String str = "mam, dad, civic, second, anna, aaaaaaaa, bbbbbbbb, ccccccccccccccc";
        String[] words = str.split(", ");

        String longestPalindrome = "";
        for (String currentWord : words) {
            if (isPalindrome(currentWord)) {
                if (currentWord.length() >= longestPalindrome.length()) {
                    longestPalindrome = currentWord;
                }
            }
        }
        System.out.println(longestPalindrome);
    }


    public static boolean isPalindrome(String source) {
        String target = "";
        for (int i = source.length() - 1; i >= 0; i--) {
            target = target + source.charAt(i);
        }
        return target.equalsIgnoreCase(source);
    }

}
