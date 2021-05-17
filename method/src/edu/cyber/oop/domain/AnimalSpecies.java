package edu.cyber.oop.domain;

public class AnimalSpecies
{
    private String name;
    private int population;
    private int growthRate;

    public void setInfo(String n, int p, int gr) {
        name = n;
        population = p;
        growthRate = gr;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getGrowthRate() {
        return growthRate;
    }

    @Override
    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population + " millions" +
                ", growthRate=" + growthRate + " percent" +
                '}';
    }
}
