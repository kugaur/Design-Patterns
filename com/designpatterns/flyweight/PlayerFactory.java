package com.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Player Factory Class
 */
public class PlayerFactory {

    private static Map<String, Player> players = new HashMap<String, Player>();

    /**
     * Method to get a player.
     * 
     * @param type Player Type
     * @return Player
     */
    public static Player getPlayer(String type) {
        Player player = null;
        if (players.containsKey(type)) {
            player = players.get(type);
        } else {
            switch (type) {
                case "Terrorist":
                    System.out.println("Terrorist Created");
                    player = new Terrorist();
                    break;
                case "CounterTerrorist":
                    System.out.println("Counter Terrorist Created");
                    player = new CounterTerrorist();
                    break;
                default:
                    System.out.println("Unreachable");
            }
        }
        return player;
    }
}
