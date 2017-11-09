package com.designpatterns.facade;

/**
 * Non Veg Restaurant Class
 */
public class NonVegRestaurant implements Hotel {

    @Override
    public Menu getMenu() {
        return new NonVegMenu();
    }

    
}
