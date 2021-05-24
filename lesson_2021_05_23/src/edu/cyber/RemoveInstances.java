package edu.cyber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * This method gets an Arraylist of Integers and a number(Integer). It returns an Arraylist.
 * It removes any instance of the given number from the Arraylist.
 * Example:
 * romoveInst([1,1,2,3,1,4],1)
 * returns: [2,3,4]
 * romoveInst([3,4,3,3],4)
 * returns: [3,3,3]
 */
public class RemoveInstances
{
    public static void main(String[] args) {
//        ArrayList<Integer> source = new ArrayList<>();
//        source.addAll(Arrays.asList(1, 1, 2, 3, 1, 4));

        Scanner in = new Scanner(System.in);
        // Read size of array
        System.out.println("Enter size of array:");
        int size = in.nextInt();
        // Number for method
        System.out.println("Enter number:");
        int number = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + i + " number for array:");
            list.add(in.nextInt());
        }

        ArrayList<Integer> r = removeInst(list, number);
        System.out.println(r);
//        System.out.println(removeInst(list, number));
        System.out.println(list.toString());
    }

    private static ArrayList<Integer> removeInst(ArrayList<Integer> list, Integer number) {
        // Вариант когда входной ArrayList меняется
        list.removeIf(e -> e.equals(number));
        return list;

        // Вариант когда входной ArrayList не меняется
//        ArrayList<Integer> result = new ArrayList<>();
//        for(Integer i : list) {
//            if (!i.equals(number)) {
//                result.add(i);
//            }
//        }
//        return result;
    }
}
