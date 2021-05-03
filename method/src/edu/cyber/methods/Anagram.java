package edu.cyber.methods;

import java.util.Arrays;

/**
 * Anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.
 * <p>
 * The isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.
 * <p>
 * each letter in word1 should appear in word2 exact number of times
 * ignore empty spaces
 * make your code case insensitive
 * Examples:
 * <p>
 * isAnagram("listen", "Silent") ==> true
 * isAnagram("earth", "heart") ==> true
 * isAnagram("star", "rats") ==> true
 * isAnagram("hi", "bye") ==> false
 * isAnagram("java", "cava") ==> false
 */

public class Anagram
{
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "Listen";

        boolean result = isAnagram(str1, str2);
        System.out.println(result);
    }

    public static boolean isAnagram(String str1, String str2) {
        // If lenghts are not equal - there is no reason to continue
        if (str1.length() != str2.length()) {
            return false;
        }

        // Если сттроки isAnagram они должны состоять из одинаковых символов
        // в одинаковом количестве
        // Если разбить строку на символы и отсортировать их в алфавитном порядке
        // arrays должны быть одинаковыми
        String[] ch1 = str1.toLowerCase().split("");
        String[] ch2 = str2.toLowerCase().split("");
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Теперь arrays долджны содержать одинаковые элементы - arrays долдны быть равны поэлементно
        for (int i = 0; i < ch1.length; i++) {
            // Если символы-строки не равны - нет смысла продолжать
            if (!ch1[i].equals(ch2[i])) {
                return false;
            }
        }
        // Нет других вариантов - строки анаграмные
        return true;
    }
}
