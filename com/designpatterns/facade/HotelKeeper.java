package com.designpatterns.facade;

/**
 * Hotel Keeper Class
 */
public class HotelKeeper {

    public VegMenu getVegMenu() {
        VegRestaurant vegRestaurant = new VegRestaurant();
        return (VegMenu)vegRestaurant.getMenu();
    }

    public NonVegMenu getNonVegMenu() {
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        return (NonVegMenu)nonVegRestaurant.getMenu();
    }
}
