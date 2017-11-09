package com.designpatterns.flyweight;

/**
 * Counter Terrorist Class.
 */
public class CounterTerrorist implements Player {

    private static final String TASK = "DIFFUSE BOMB";

    private String weapon;

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon: " + weapon + " Task: " + TASK);
    }

}
