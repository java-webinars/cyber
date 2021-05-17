package edu.cyber.oop;

import edu.cyber.oop.domain.AnimalSpecies;

import java.time.LocalDate;

public class Earth
{
    public static void main(String[] args) {
        AnimalSpecies as1 = new AnimalSpecies();
        as1.setInfo("Tiger", 20, 15);
        System.out.println(as1);
        System.out.println("Name:" + as1.getName());
        System.out.println("Population:" + as1.getPopulation());
        System.out.println("Growth Rate:" + as1.getGrowthRate());

    }
}
