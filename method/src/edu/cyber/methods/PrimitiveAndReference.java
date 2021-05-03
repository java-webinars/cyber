package edu.cyber.methods;

import edu.cyber.methods.arrays.ArrayAction;

import java.util.ArrayList;

public class PrimitiveAndReference
{
    public static void main(String[] args) {
        int a1 = 10;
        int b1 = 20;

        ArrayList<Integer> r = new ArrayList<>();
        Integer s = 10;
        r.add(s);

        Person p1 = null;
        p1 = new Person();
        p1.height = 180;
        System.out.println(p1.height);
        methodTest(p1);
        System.out.println(p1.height);

        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.get(0).height = 150;
        System.out.println(p1.height);
    }

    public static void methodTest(Person p2) {
        p2.height = 200;
    }
}

class Person {
    int weight;
    int height;
}
