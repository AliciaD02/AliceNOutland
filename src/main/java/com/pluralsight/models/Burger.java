package com.pluralsight.models;
import java.util.ArrayList;

public class Burger {
    // Store info
    // need to store the information of the users selection of food

    private String burgerName;
    private String bunType;
    private double price;
    private ArrayList<String> toppings;
    private ArrayList<String> sauces;

    // Created a constructor
    public Burger(String burgerName, String bunType, double price) {
        //this. = objects property
        this.burgerName = burgerName;
        this.bunType = bunType;
        this.price = price;
        this.toppings = new ArrayList<>();
        this.sauces = new ArrayList<>();

    }

    // adding the getters and setters lol
  // getburger and get bun only need getter value does not change
    public String getBurgerName() {
        return burgerName;
    }

    public String getBunType() {
        return bunType;
    }


    public void addTopping(String topping) {
        toppings.add(topping);
    }
    public ArrayList<String> getToppings() {
        return toppings;
    }
    public void addSauce(String sauce) {
        sauces.add(sauce);
    }

    public ArrayList<String> getSauces() {
        return sauces;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }






}
