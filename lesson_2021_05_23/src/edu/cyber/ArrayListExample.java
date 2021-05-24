package edu.cyber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample
{
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("5");
        test.add("6");
        test.add(0, "7");

        for(String s : test) {
            System.out.println(s);
        }

        Vehicle b = new Bus();

    }
}

class Vehicle {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

class Bus extends Vehicle {
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}