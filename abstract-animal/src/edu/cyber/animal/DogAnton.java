package edu.cyber.animal;

public class DogAnton extends Animal
{
    private String breed;

    public DogAnton(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public int getAgeInHumanYears() {
        if (age <= 2) {
            return age * 11;
        } else {
            return 22 + ((age - 2) * 5);
        }
    }

    @Override
    public String toString() {
        return "Name:" + name + "\n" + "Breed: " + breed + "\n" +
                "Age in calendar years: " + age + "\n" +
                "Age in human years: " + getAgeInHumanYears();
    }

}
