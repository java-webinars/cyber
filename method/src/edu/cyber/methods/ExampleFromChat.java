package edu.cyber.methods;

import java.util.ArrayList;

public class ExampleFromChat
{
    public static void main(String[] args) {
        ArrayList<String> w = new ArrayList<>();
        w.add("1");
        w.add("2");
        printStrList(w);

        ArrayList<String> words = new ArrayList<>();
        words.add("java");
        words.add("html");
        words.add("selenium");
        words.add("a");
        words.add("input");
        words.add("title");
//        printStrList(words);
        String str = convertStrList(words, ",");
        System.out.println(str);
    }

    public static void printStrList(ArrayList<String> stringList) {
        for (String str : stringList) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static String convertStrList(ArrayList<String> stringList, String delimiter) {
        StringBuilder sb = new StringBuilder("");
        for (String str : stringList) {
            sb.append(sb.toString().equals("") ? str : delimiter + str);
        }
        return sb.toString();
    }

}