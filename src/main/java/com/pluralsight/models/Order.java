package com.pluralsight.models;

// this is the class for the orders of the user

import com.pluralsight.models.Fries;

import java.util.ArrayList;

public class Order {


    private ArrayList<Burger> burgers;
    private ArrayList<Drink> drinks;
    private ArrayList<Fries> fries;

    public Order() {
        burgers = new ArrayList<>();
        drinks = new ArrayList<>();
        fries = new ArrayList<>();
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addFries(Fries fry) {
        fries.add(fry);
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public ArrayList<Fries> getFries() {
        return fries;
    }


    public void addBurger(Burger burger) {
        burgers.add(burger);
    }

    public ArrayList<Burger> getBurgers() {
        return burgers;
    }

    public double getTotal() {
        double total = 0;

        for (Burger burger : burgers) {
            total += burger.getPrice();
        }

        for (Drink drink : drinks) {
            total += drink.getPrice();
        }

        for (Fries fry : fries) {
            total += fry.getPrice();
        }

        return total;
    }

}