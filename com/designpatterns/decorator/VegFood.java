package com.designpatterns.decorator;

/**
 * Veg Food Class 
 */
public class VegFood implements Food {

    private static final String FOOD_NAME = "Veg Food";
    private static final double PRICE = 50.0;

    @Override
    public String getFoodName() {
        return FOOD_NAME;
    }

    @Override
    public double getPrice() {
        return PRICE;
    }

}
