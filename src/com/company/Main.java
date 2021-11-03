package com.company;

import com.sun.xml.internal.ws.api.model.MEP;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        String pizzaSize;

        Scanner pizzaSizeScanner = new Scanner(System.in);

        System.out.println("Welcome to a Byte to eat!");
        System.out.println("'If you ask for pineapple today, please stay the #### away!'");
        System.out.println("\n");
        System.out.println("We have three sizes - as seen below.");
        System.out.println("Small - £7.99");
        System.out.println("Medium - £10.99");
        System.out.println("Large - £13.99");
        System.out.println("");
        System.out.println("You get two toppings included with the price, then £1.25 for each additional topping.");
        System.out.println("\n\n");
        System.out.println("What size pizza would you like? Small, Medium or Large?");

        try{
            pizzaSize = pizzaSizeScanner.next();
        }

        catch (Exception e) {
            System.out.println("Invalid input. Error code " +e);
        }



    }
}
