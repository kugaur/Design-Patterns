package com.designpatterns.flyweight;

/**
 * Terrorist Class.
 */
public class Terrorist implements Player {

    private static final String TASK = "PLANT A BOMB";

    private String weapon;

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon: " + weapon + " Task: " + TASK);
    }

}
