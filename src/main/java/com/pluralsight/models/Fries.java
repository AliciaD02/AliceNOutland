package com.pluralsight.models;
public class Fries {

        private String size;
        private double price;

        public Fries(String size, double price) {
            this.size = size;
            this.price = price;
        }

        // Only getters sizes and prices do not change
        public String getSize() {
            return size;
        }

        public double getPrice() {
            return price;
        }
    }

