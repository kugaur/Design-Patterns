package com.designpatterns.decorator;

/**
 * NonVeg Food Class
 */
public class NonVegFood extends FoodDecorator {

    private static final String FOOD_NAME = " Roasted Chicken";
    private static final double PRICE = 150.0;

    public NonVegFood(Food food) {
        super(food);
    }

    @Override
    public String getFoodName() {
        return super.getFoodName() + FOOD_NAME;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + PRICE;
    }

}
