package com.designpatterns.flyweight;

/**
 * Player Interface
 */
public interface Player {

    /**
     * Method to assign weapon.
     * 
     * @param weapon Weapon
     */
    void assignWeapon(String weapon);

    /**
     * Method for mission.
     */
    void mission();
}
