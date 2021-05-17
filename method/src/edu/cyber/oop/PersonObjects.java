package edu.cyber.oop;

import edu.cyber.oop.domain.Person;

import java.time.LocalDate;

public class PersonObjects
{
    public static void main(String[] args) {
        String f = "12345";
        String f1 = new String("12345");
//        f = "67890";
        Person p1 = new Person("Anton", "Saburov", LocalDate.of(1967, 1, 1), 'M');

        Person p2 = new Person("Алексей", "Пивоваров", LocalDate.of(1980, 4, 25), 'M');
        System.out.println(p2);


    }
}
