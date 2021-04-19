package edu.cyber.methods;

import java.util.Arrays;

/**
 An array inhabitants represents cities and their respective populations.
 For example, the following arrays shows 8 cities and their respective populations:
 [3, 6, 0, 4, 3, 2, 7, 0]
 Some cities have a population of 0 due to a pandemic zombie disease that is wiping
 out the human lives. After each day, any city that is adjacent to a zombie-ridden
 city will lose half of its population (City that has a 0 population).
 Write a program to loop through each city population and make it lose half of its
 population if it is adjacent(right or left) to a city with zero people until all
 cities have no humans left.
 Make updates to each element in the array And print the array like below for each day:
 Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
 Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
 Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
 Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
 Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
 Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
 ---- EXTINCT ----
 Write the program in a way that it will handle any number of people in cities,
 above was just an example.
 *
 */
public class ZombyExample
{
    public static void main(String[] args) {
        int[] population = {3, 6, 0, 4, 3, 2, 7, 0};

        boolean done = true;
        int day = 0;
        do {
            System.out.println("Day " + (day++) + " " + Arrays.toString(population));

            for (int i = 0; i < population.length; i++) {
                if (i == 0) {
                    if (population[i + 1] == 0) {
                        population[i] = population[i] / 2;
                    }
                } else if (i == population.length - 1) {
                    if (population[i - 1] == 0) {
                        population[i] = population[i] / 2;
                    }
                } else {
                    if (population[i - 1] == 0 || population[i+1] == 0) {
                        population[i] = population[i] / 2;
                    }
                }
            }

            done = true;
            for (int s : population) {
                if (s > 0) {
                    done = false;
                }
            }
        } while (!done);

        System.out.println("Day " + day + " " + Arrays.toString(population));

    }
}
