package com.pluralsight;

import com.pluralsight.ui.UserInterface;

public class Application {

    // This will be my main package with all  the structure.
    //
    public static void main(String[] args) {


         //this starts the app and displays the menu to user
        UserInterface ui = new UserInterface();
        ui.showHomeScreen();


    }
}
