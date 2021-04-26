package edu.cyber.arraylist;

import java.util.ArrayList;

public class FunnyList
{
    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<>();
        System.out.println(test);

        test.add("String like 12345");
        test.add("TEST line with simple error");
        test.add(0, "First line");
        test.add("String like 12345");
        test.add("String like 12345");

        if(test.contains("String like 12345")) {
            System.out.println("OK");
        }

        for(String s : test) {
            System.out.println(s);
        }

//        int a = 15;
//        int b = 22;
//        int c = b++ + ++a;   //  c = 22 + 16;
//        System.out.println(c);  //  38
//        System.out.println(b++);  //  23
//        System.out.println(b);  //  24
//        System.out.println(++b);  //  25

//        test.remove("String like 12345");
        int index = test.indexOf("String like 12345");
        int indexLast = test.lastIndexOf("String like 12345");

        System.out.println(test);


        ArrayList<Person> persons = new ArrayList<>();
        Person p = new Person();
        p.setFirstName("Anton");
        p.setLastName("Saburov");
        persons.add(p);

        for(Person currentPerson : persons) {
        }


    }
}
