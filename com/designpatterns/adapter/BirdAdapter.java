package com.designpatterns.adapter;

/**
 * Bird Adapter Class
 */
public class BirdAdapter implements ToyDuck {

    private Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void sqeak() {
        bird.makeSound();
    }

}
