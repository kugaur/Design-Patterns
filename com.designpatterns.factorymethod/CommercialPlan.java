package com.designpatterns.factorymethod;

/**
 * Implementation for Commercial Plan
 */
public class CommercialPlan extends Plan {

    private static final double RATE = 7.5;

    @Override
    double getRate() {
        return RATE;
    }

}
