package com.designpatterns.strategy;

/**
 * ShortJump Class
 */
public class ShortJump implements JumpBehavior {

    @Override
    public void jump() {
        System.out.println("Short Jump");
    }
}
