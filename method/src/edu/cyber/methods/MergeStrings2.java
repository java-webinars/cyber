package edu.cyber.methods;

public class MergeStrings2
{
    public static void main(String[] args) {
        String str1 = "ace";
        String str2 = "bdfhjklmno";
        String result = "";

        for (int i = 0; i < str1.length() || i < str2.length(); i++) {
            if (i < str1.length() && i < str2.length()) {
                result += "" + str1.charAt(i) + str2.charAt(i);
            } else {
                result += i >= str1.length() ?
                        str2.substring(str1.length()) : str1.substring(str2.length());
                break;
            }
        }

        System.out.println(result);

    }
}
