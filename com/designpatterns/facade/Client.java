package com.designpatterns.facade;

/**
 * Client Class
 */
public class Client {

    public static void main(String[] args) {
        HotelKeeper keeper = new HotelKeeper();
        VegMenu vegMenu = keeper.getVegMenu();
        NonVegMenu nonVegMenu = keeper.getNonVegMenu();

        System.out.println(vegMenu.getItems());
        System.out.println(nonVegMenu.getItems());
    }
}
