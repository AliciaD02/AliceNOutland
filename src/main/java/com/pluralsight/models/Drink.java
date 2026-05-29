package com.pluralsight.models;

public class Drink {


        private String size;
        private String flavor;
        private double price;

        public Drink(String size, String flavor, double price) {
            this.size = size;
            this.flavor = flavor;
            this.price = price;
        }
     // Only getters the size, flavor,and price do not change
        public String getSize() {
            return size;
        }

          public String getFlavor() {
             return flavor;
        }

         public double getPrice() {
            return price;

        }



}
