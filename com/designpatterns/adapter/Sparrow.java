package com.designpatterns.adapter;

/**
 * Implementation class for Sparrow
 */
public class Sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }

}
