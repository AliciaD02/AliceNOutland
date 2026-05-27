package com.pluralsight.ui;

import java.util.Scanner;
// this class handles the menu and users input

public class UserInterface {
    // creating ome scanner for the whole class
    Scanner scanner = new Scanner(System.in);

    //  displaying the home screen menu
    public void showHomeScreen() {
        boolean running = true;
        // repeat the menu while the app is running

        while (running) {

            System.out.println("===========================================");
            System.out.println("🍔 Welcome to Alice N' Outland 🍔");
            System.out.println("===========================================");

            System.out.println("❤️✨ Home of the Queen's Double Stack ❤️✨");
            System.out.println("1) New Order");
            System.out.println("0) Exit");

            System.out.print("Please choose an option: ");
            // so the user can input his choice
            String choice = scanner.nextLine();

            //System.out.println("You selected: " + choice);


            switch (choice) {

                case "1":
                    showOrderMenu();
                    break;

                case "0":
                    System.out.println("✨ Thanks for visiting Alice N' Outland ✨");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void showOrderMenu() {
        //Display the order menu

        boolean ordering = true;

        while (ordering) {


        System.out.println("\n🍟 Mad Hatter Menu 🍟");
        System.out.println("1) Add Burger");
        System.out.println("2) Add Drink");
        System.out.println("3) Add Fries");
        System.out.println("4) Checkout");
        System.out.println("0) Cancel Order");

        System.out.println("please choose an option: ");
        String choice = scanner.nextLine();
        switch (choice) {

            case "1":
                addBurger();
                break;

            case "2":
                System.out.println("🥤 Adding drink...");
                break;

            case "3":
                System.out.println("🍟 Adding fries...");
                break;

            case "4":
                System.out.println("🧾 Checking out...");

                ordering = false;
                break;

            case "0":
                System.out.println("❌ Order cancelled.");
                ordering = false;
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }
        }
    }
      // made the method for the burgers
    public void addBurger() {

        System.out.println("\n🍔 Burger Builder 🍔");

        System.out.println("Choose your burger size: ");
        System.out.println("1)👑 Alice Classic 👑");
        System.out.println("2)🎩 Mad Hatter Double 🎩 ");
        System.out.println("3)❤️ Queen of Hearts Triple ❤️");

        System.out.print("Choose your burger size: ");
        String burgerChoice = scanner.nextLine();

        switch (burgerChoice) {
            case "1":
                System.out.println("You chose the Alice Classic 👑");
                // this is for user to input the bun selection
                System.out.println("\n🥯 Choose your bun:");
                System.out.println("1) Classic Bun");
                System.out.println("2) Brioche Bun");
                System.out.println("3) Lettuce Wrap ");
                System.out.print("Please choose a bun: ");

                String bunChoice = scanner.nextLine();
                System.out.println("You selected bun option: " + bunChoice);


                // topping selection but will be a while loop for users selection
                boolean addingToppings = true;
                while (addingToppings){


                System.out.println("\n Choose toppings: ");
                System.out.println("1) Lettuce");
                System.out.println("2) Tomatoes");
                System.out.println("3) Pickles");
                System.out.println("4) Onions");
                    System.out.println("5) cheese");
                    System.out.println("Type 'exit' when finished ");

                System.out.print("Choose a topping: ");
                String toppingChoice = scanner.nextLine().toLowerCase();



                switch (toppingChoice) {

                    case "1":
                        System.out.println("Lettuce added");
                        break;

                    case "2":
                        System.out.println("Tomatoes added");
                        break;

                    case "3":
                        System.out.println("Pickles added");
                        break;

                    case "4":
                        System.out.println("Onion added");
                        break;

                    case "5":
                        System.out.println("Cheese added");
                        break;

                    case "exit":
                        addingToppings = false;
                        break;

                    default:
                        System.out.println("Invalid topping choice. ");




                }
                }

                // sauce selection
                boolean addingSauces = true;
                while (addingSauces) {


                System.out.println("\n🧂 Choose your sauce:");
                System.out.println("1) Outland Sauce");
                System.out.println("2) Ketchup");
                System.out.println("3) Ranch");
                    System.out.println("0) Done with sauces");

                System.out.print("Choose a sauce: ");
                String sauceChoice = scanner.nextLine();

                switch (sauceChoice) {

                    case "1":
                        System.out.println("Outland Sauce added");
                        break;

                    case "2":
                        System.out.println("Ketchup added");
                        break;

                    case "3":
                        System.out.println("Ranch added");
                        break;

                    case "0":
                        addingSauces = false;
                        break;

                    default:
                        System.out.println("Invalid sauce choice.");

                }
}


                break;



            case "2":
                System.out.println("You chose the Mad Hatter Double 🎩");
                break;

            case "3":
                System.out.println("You chose the Queen of Hearts Triple ❤️");
                break;

            default:
                System.out.println("Invalid burger choice.");
        }

    }



}