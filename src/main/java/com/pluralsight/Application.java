package com.pluralsight;

import com.pluralsight.ui.UserInterface;

public class Application {

    // This will be my main package with all  the structure.
    public static void main(String[] args) {

        // create the UI and run the home screen
        // decides when to display the menu

        UserInterface ui = new UserInterface();
        ui.showHomeScreen();


    }
}
