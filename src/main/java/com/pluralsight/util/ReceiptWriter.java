package com.pluralsight.util;

import com.pluralsight.models.Burger;
import com.pluralsight.models.Drink;
import com.pluralsight.models.Fries;
import com.pluralsight.models.Order;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


    public class ReceiptWriter {

        public static void saveReceipt(Order order) {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
            String timestamp = LocalDateTime.now().format(formatter);
               // receipts being saved in this file
            String fileName = "src/main/resources/receipts/" + timestamp + ".txt";

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

                writer.write("Alice N' Outland Receipt");
                writer.newLine();
                writer.write("---------------------------");
                writer.newLine();

                for (Burger burger : order.getBurgers()) {
                    writer.write("Burger: " + burger.getBurgerName());
                    writer.newLine();
                    writer.write("Bun: " + burger.getBunType());
                    writer.newLine();
                    writer.write("Toppings: " + burger.getToppings());
                    writer.newLine();
                    writer.write("Sauces: " + burger.getSauces());
                    writer.newLine();
                    writer.write("Price: $" + burger.getPrice());
                    writer.newLine();
                    writer.write("---------------------------");
                    writer.newLine();
                }

                for (Drink drink : order.getDrinks()) {
                    writer.write("Drink: " + drink.getSize() + " " + drink.getFlavor());
                    writer.newLine();
                    writer.write("Price: $" + drink.getPrice());
                    writer.newLine();
                    writer.write("---------------------------");
                    writer.newLine();
                }

                for (Fries fry : order.getFries()) {
                    writer.write("Fries: " + fry.getSize());
                    writer.newLine();
                    writer.write("Price: $" + fry.getPrice());
                    writer.newLine();
                    writer.write("---------------------------");
                    writer.newLine();
                }

                writer.write("TOTAL: $" + order.getTotal());
                writer.newLine();

                writer.close();

                System.out.println("🧾 Receipt saved successfully!");

            } catch (IOException e) {
                System.out.println("Error saving receipt.");
             e.printStackTrace();

                // want to add the date and time to know
            }
        }
    }

