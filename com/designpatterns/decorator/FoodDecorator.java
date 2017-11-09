package com.designpatterns.decorator;

/**
 * Food Decorator Class
 */
public abstract class FoodDecorator implements Food {

    private Food food;

    public FoodDecorator(Food food) {
        this.food = food;
    }

    @Override
    public String getFoodName() {
        return food.getFoodName();
    }

    @Override
    public double getPrice() {
        return food.getPrice();
    }

}
