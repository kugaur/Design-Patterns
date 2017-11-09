package com.designpatterns.facade;

/**
 * Veg Resturant Class 
 */
public class VegRestaurant implements Hotel {

    @Override
    public Menu getMenu() {
        return new VegMenu();
    }

}
