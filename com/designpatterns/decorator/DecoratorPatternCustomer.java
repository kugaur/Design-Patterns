package com.designpatterns.decorator;

/**
 * Main Class
 */
public class DecoratorPatternCustomer {

    public static void main(String[] args) {
        VegFood vegFood = new VegFood();
        System.out.println(vegFood.getFoodName());
        System.out.println(vegFood.getPrice());

        Food nonVegFood = new NonVegFood(new VegFood());
        System.out.println(nonVegFood.getFoodName());
        System.out.println(nonVegFood.getPrice());

    }
}
