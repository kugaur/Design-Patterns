package com.designpatterns.adapter;

/**
 * Plastic Toy Duck Class
 */
public class PlasticToyDuck implements ToyDuck {

    @Override
    public void sqeak() {
        System.out.println("Sqeak");
    }

}
