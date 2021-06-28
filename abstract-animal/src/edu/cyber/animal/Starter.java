package edu.cyber.animal;

public class Starter
{
    public static void main(String[] args) {
        Dog dog = new Dog("Dog", 10, "Pitbull");
        Object o = dog;
        Dog dog2 = new Dog("Dog", 10, "Pitbull");
        System.out.println(dog);
        System.out.println(dog.equals(dog2));

//        System.out.println(dog.getAgeInHumanYears());
//        dog.setAge(2);
//        System.out.println(dog);
    }
}
