package edu.cyber.methods;

import edu.cyber.methods.arrays.ArrayAction;
//import edu.cyber.methods.arrays.*;
import java.util.*;

public class Starter
{
    public static void main(String[] args) {
        action();

    }

    private static void action() {
        int[] test1 = {1, 2, 3};
        int[] test2 = {11, 12, 13, 14};
        int[] test3 = {21, 22, 23, 24, 25};
        int[] test4 = {41, 42, 43, 44, 45};

//        ArrayAction.printArray(test1);
//        ArrayAction.printArray(test2);
//        ArrayAction.printArray(test3);

//        int result = ArrayAction.minArray(test3);
//        System.out.println("Min:" + result);
//        System.out.println("Max:" + ArrayAction.maxArray(test2));

        int[] result = ArrayAction.sumArrays(test3, test4);
        ArrayAction.printArray(result);

        String arrayString = Arrays.toString(result);
        System.out.println(arrayString);
    }


}
