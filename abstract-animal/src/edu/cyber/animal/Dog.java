package edu.cyber.animal;

import java.util.Objects;

public class Dog extends Animal
{
    private String breed;
    private int humanYears;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        calculateHumanYears();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
        calculateHumanYears();
    }

    @Override
    public int getAgeInHumanYears() {
        return humanYears;
    }

    private void calculateHumanYears() {
        if (age <= 2) {
            humanYears =  age * 11;
        } else {
            humanYears = 22 + ((age - 2) * 5);
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Breed: " + breed + "\n" +
                "Age in calendar years: " + age + "\n" +
                "Age in human years: " + humanYears;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dog dog = (Dog) o;
        return dog.name.equals(this.name) && dog.age == this.age && dog.breed.equals(this.breed);
    }
}
