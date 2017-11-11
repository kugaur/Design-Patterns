package com.designpatterns.strategy;

/**
 * Tornado Kick Class
 */
public class TornadoKick implements KickBehavior {

    @Override
    public void kick() {
        System.out.println("Tornado Kick");
    }

}
