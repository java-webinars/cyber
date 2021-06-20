package com.ibm.walmart;

import java.util.ArrayList;
import java.util.List;

/*
Create a class WalmartStore
    -> Instance variables:
        - location (String), totalWorth (double)
        - inventory (List of Items)
    -> Static variables:
        - company name (String),
    -> Constructor:
        - Accepts and initializes location, has an empty inventory
        - Overloaded: Accepts and initializes location, also accepts an ArrayList of Items for starting inventory
    -> Instance methods:
        - calculateWorth() -> Checks inventory, totals up amount of money all the items are worth. (each times price * quantity). Stores to the totalWorth variable
        - restockInventory(List of Item) -> Adds the given items to the store inventory.
            Challenge: If the item exists in the inventory already (same item name and price)
        - toString(): returns information about Item
 */
public class WalmartStore
{
    String location;
    double totalWorth;
    List<Item> inventory;

    public static String companyName = "Walmart";

    public WalmartStore(String location) {
        this(location, new ArrayList<>());
    }

    public WalmartStore(String location, List<Item> inventory) {
        this.location = location;
        this.inventory = inventory;
        calculateTotalWorth();
    }

    private void calculateTotalWorth() {
        totalWorth = 0.0;
        for (Item item : inventory) {
            totalWorth += item.price * item.quantity;
        }
    }

    public void restockInventory(List<Item> newItems) {
        // Проверяем каждый новый пункт - loop по всем item из нового списка newItems
        for (Item newItem : newItems) {
            // Проверяем наличие такого же пункта в уже существующем inventory
            boolean found = false;
            for (Item oldItem : inventory) {
                if (oldItem.name.equals(newItem.name) && oldItem.price == newItem.price) {
                    // Если такой товар найден, то увеличиваем количество в уже существующем
                    oldItem.quantity = oldItem.quantity + newItem.quantity;
                    // Отмечаем, что товар найден
                    found = true;
                }
            }
            // Если товар не найден после проверки всего спика, то его надо добавить
            if (!found) {
                inventory.add(newItem);
            }
        }
        // Пересчитать
        calculateTotalWorth();
    }
}
