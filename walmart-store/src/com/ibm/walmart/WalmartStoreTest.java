package com.ibm.walmart;

import java.util.ArrayList;
import java.util.List;

public class WalmartStoreTest
{
    public static void main(String[] args) {
        List<Item> list = new ArrayList<>();
        list.add(new Item("cucumber", 2.0, 10));
        list.add(new Item("potato", 1.0, 15));

        WalmartStore st1 = new WalmartStore("NY", list);
        double totalCheck1 = 35.0;
        System.out.println("Result:" + (totalCheck1 == st1.totalWorth));

        List<Item> newList = new ArrayList<>();
        newList.add(new Item("cucumber", 1.5, 20));
        newList.add(new Item("potato", 1.0, 30));
        newList.add(new Item("potato", 0.5, 40));
        newList.add(new Item("redish", 3.0, 5));
        st1.restockInventory(newList);
        System.out.println(st1.totalWorth);

        double totalCheck2 = 20.0 + 15.0 + 30.0 + 20.0 + 30.0 + 15.0;
        System.out.println("Result:" + (totalCheck2 == st1.totalWorth));

        int size = 5;
        System.out.println("Result:" + (st1.inventory.size() == size));

        st1.inventory.forEach(i -> System.out.println(i));
    }
}
