package com.designpatterns.flyweight;

import java.util.Random;

/**
 * Counter Strike Class 
 */
public class CounterStrike {

    private static String[] playerType = {
            "Terrorist",
            "CounterTerrorist"
    };
    private static String[] weapons = {
            "AK-47",
            "Maverick",
            "Gut Knife"
    };

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Player player = PlayerFactory.getPlayer(getRandPlayerType());
            player.assignWeapon(getRandWeapon());
            player.mission();
        }
    }

    private static String getRandPlayerType() {
        Random r = new Random();
        int randInt = r.nextInt(playerType.length);
        return playerType[randInt];
    }

    private static String getRandWeapon() {
        Random r = new Random();
        int randInt = r.nextInt(weapons.length);
        return weapons[randInt];
    }
}
