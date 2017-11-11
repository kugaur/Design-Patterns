package com.designpatterns.strategy;

/**
 * Lightning Kick Class
 */
public class LightningKick implements KickBehavior {

    @Override
    public void kick() {
        System.out.println("Lightning Kick");
    }
}
