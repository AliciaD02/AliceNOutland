package com.pluralsight.ui;
import com.pluralsight.models.Burger;
import com.pluralsight.models.Order;
import java.util.Scanner;
import com.pluralsight.models.Drink;
import com.pluralsight.models.Fries;
import com.pluralsight.util.ReceiptWriter;
// this class handles the menu and users input

public class UserInterface {
    // creating ome scanner for the whole class
    Scanner scanner = new Scanner(System.in);

    // UI will share one order (every burger will go into variable)
    Order currentOrder = new Order();
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


            System.out.println("\n 🎩 Mad Hatter Menu 🎩");
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
                    addDrink();
                    break;

                case "3":
                    addFries();
                    break;

                case "4":
                    checkout();
                    ordering = false;
                    break;

                case "0":
                    System.out.println(" Order cancelled.");
                    ordering = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

      // made the method for the burgers
    public void addBurger() {



        System.out.println("Choose your burger size: ");
        System.out.println("1)👑 Alice Classic 👑");
        System.out.println("2)🎩 Mad Hatter Double 🎩 ");
        System.out.println("3)❤️ Queen of Hearts Triple ❤️");

        System.out.print("Choose your burger size: ");
        String burgerChoice = scanner.nextLine();

        String selectedBurger = "";
        double burgerPrice = 0;

        switch (burgerChoice) {

            case "1":
                selectedBurger = "Alice Classic";
                burgerPrice = 7.99;
                System.out.println("You chose the👑 Alice Classic 👑");
                break;

            case "2":
                selectedBurger = "Mad Hatter Double";
                burgerPrice = 10.99;
                System.out.println("You chose the 🎩 Mad Hatter Double 🎩");
                break;

            case "3":
                selectedBurger = "Queen of Hearts Triple";
                burgerPrice = 12.99;

                System.out.println("You chose the ❤️ Queen of Hearts Triple ❤️");
                break;

            default:
                System.out.println("Invalid burger choice.");
                return;

        }

        // this is for user to input the bun selection
        System.out.println("\n Choose your bun:");
        System.out.println("1) Classic Bun");
        System.out.println("2) Brioche Bun");
        System.out.println("3) Lettuce Wrap ");
        System.out.print("Please choose a bun: ");

        String bunChoice = scanner.nextLine();
        String selectedBun = "";
        switch (bunChoice) {

            case "1":
                selectedBun = "Classic Bun";
                break;
            case "2":
                selectedBun = "Brioche Bun";
                break;
            case "3":
                selectedBun = "Lettuce Wrap";
                break;

            default:
                selectedBun = "Unknown Bun";


        }

        Burger burger = new Burger(
                selectedBurger,
                selectedBun,
                burgerPrice);
        // topping selection but will be a while loop for users selection
        boolean addingToppings = true;
        while (addingToppings) {


            System.out.println("\n Choose toppings: ");
            System.out.println("1) Lettuce");
            System.out.println("2) Tomatoes");
            System.out.println("3) Pickles");
            System.out.println("4) Onions");
            System.out.println("5) cheese");
            System.out.println("Type 'done' when finished");

            System.out.print("Choose a topping: ");
            String toppingChoice = scanner.nextLine().toLowerCase();


            switch (toppingChoice) {

                case "1":
                    System.out.println("Lettuce added");
                    burger.addTopping("Lettuce");
                    break;

                case "2":
                    System.out.println("Tomatoes added");
                    burger.addTopping("Tomatoes");
                    break;

                case "3":
                    System.out.println("Pickles added");
                    burger.addTopping("Pickles");
                    break;

                case "4":
                    System.out.println("Onion added");
                    burger.addTopping("Onion");
                    break;

                case "5":
                    System.out.println("Cheese added");
                    burger.addTopping("Cheese");
                    burger.setPrice(burger.getPrice() + 1.00);
                    break;

                case "done":
                    addingToppings = false;
                    break;

                default:
                    System.out.println("Invalid topping choice. ");


            }
        }

        // sauce selection
        boolean addingSauces = true;
        while (addingSauces) {

            System.out.println("\n Choose your sauce:");
            System.out.println("1) Outland Sauce");
            System.out.println("2) Ketchup");
            System.out.println("3) Ranch");
            System.out.println("0) Done with sauces");

            System.out.print("Choose a sauce: ");
            String sauceChoice = scanner.nextLine();

            switch (sauceChoice) {

                case "1":
                    System.out.println("Outland Sauce added");
                    burger.addSauce("Outland Sauce");
                    break;

                case "2":
                    System.out.println("Ketchup added");
                    burger.addSauce("Ketchup");
                    break;

                case "3":
                    System.out.println("Ranch added");
                    burger.addSauce("Ranch");
                    break;

                case "0":
                    addingSauces = false;
                    break;

                default:
                    System.out.println("Invalid sauce choice.");

            }
        }



        System.out.println("You selected bun option: " + bunChoice);


        System.out.println("Burger: " + burger.getBurgerName());
        System.out.println("Bun: " + burger.getBunType());
        System.out.println("Price: $" + burger.getPrice());
        System.out.println("Toppings: " + burger.getToppings());
        System.out.println("Sauces: " + burger.getSauces());

        // add completed burger into the order
        currentOrder.addBurger(burger);

    }

public void addDrink () {

    System.out.println("\n🥤 Drink Menu 🥤");

    System.out.println("Choose a size:");
    System.out.println("1) Small");
    System.out.println("2) Medium");
    System.out.println("3) Large");

    System.out.print("Choose a size: ");
    String drinkSize = scanner.nextLine();

    String selectedSize = "";
    double drinkPrice = 0;

    switch (drinkSize) {

        case "1":
            selectedSize = "Small";
            drinkPrice = 2.49;
            break;

        case "2":
            selectedSize = "Medium";
            drinkPrice = 3.49;
            break;

        case "3":
            selectedSize = "Large";
            drinkPrice = 4.49;
            break;

        default:
            System.out.println("Invalid drink choice.");
            return;
    }

    System.out.print("Enter drink flavor: ");
    String flavor = scanner.nextLine();

    Drink drink = new Drink(selectedSize, flavor, drinkPrice);

    currentOrder.addDrink(drink);

    System.out.println("🥤 Drink added to order!");
}


public void addFries () {

    System.out.println("\n🍟 Mad Hatter Fries 🍟");

    System.out.println("Choose a size:");
    System.out.println("1) Small");
    System.out.println("2) Medium");
    System.out.println("3) Large");

    System.out.print("Choose a size: ");
    String friesChoice = scanner.nextLine();

    String selectedSize = "";
    double friesPrice = 0;

    switch (friesChoice) {

        case "1":
            selectedSize = "Small";
            friesPrice = 2.99;
            break;

        case "2":
            selectedSize = "Medium";
            friesPrice = 3.99;
            break;

        case "3":
            selectedSize = "Large";
            friesPrice = 4.99;
            break;

        default:
            System.out.println("Invalid fries choice.");
            return;
    }


    Fries fries = new Fries(selectedSize, friesPrice);

    currentOrder.addFries(fries);

    System.out.println("🍟 Fries added to order");
}



    public void checkout() {


        System.out.println("♥------------------------------------♥");
        System.out.println("      ALICE N' OUTLAND RECEIPT        ");
        System.out.println("♥------------------------------------♥");
        System.out.println("A♥                                  A♥");
        System.out.println("♦                                    ♦");

        // want to print out a rabbit holding a burger lol
        printRabbit();

        System.out.println("♣                                    ♣");
        System.out.println("♥------------------------------------♥");

        for (Burger burger : currentOrder.getBurgers()) {
            System.out.println("---------------------------------");
            System.out.println("Burger: " + burger.getBurgerName());
            System.out.println("Bun: " + burger.getBunType());
            System.out.println("Toppings: " + burger.getToppings());
            System.out.println("Sauces: " + burger.getSauces());
            System.out.println("Price: $" + burger.getPrice());
        }




        for (Drink drink : currentOrder.getDrinks()) {
            System.out.println("---------------------------------");
            System.out.println("Drink: " + drink.getSize() + " " + drink.getFlavor());
            System.out.println("Price: $" + drink.getPrice());
        }

        for (Fries fry : currentOrder.getFries()) {
            System.out.println("--------------------------------");
            System.out.println("Fries: " + fry.getSize());
            System.out.println("Price: $" + fry.getPrice());
        }


        System.out.println("♥---------------------------------- ♥");
        System.out.println("TOTAL: $" + currentOrder.getTotal());
        System.out.println("♥Thank you for dining in Wonderland!♥");
        // printed the cat
        printCat();

        System.out.println(" Follow the White Rabbit back soon! ");
        System.out.println("♥----------------------------------♥");

        ReceiptWriter.saveReceipt(currentOrder);
        // do not want each order to add
        currentOrder = new Order();


    }
    public void printRabbit() {
        System.out.println(" (\\_/\\\\");
        System.out.println(" ( •.•)");
        System.out.println(" / >🍔");
    }

    public void printCat() {
        System.out.println(" /\\_/\\\\");
        System.out.println("( o.o )");
        System.out.println(" > ^ <");
        System.out.println( "We're all mad here....");
    }

    }

