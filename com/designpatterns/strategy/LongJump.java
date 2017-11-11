package com.designpatterns.strategy;

/**
 * Long Jump 
 */
public class LongJump implements JumpBehavior {

    @Override
    public void jump() {
        System.out.println("Long Jump");
    }

    
}
