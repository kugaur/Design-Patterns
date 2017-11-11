package com.designpatterns.observer;

/**
 * Current Score Display Class
 */
public class CurrentScoreDisplay implements Observer {

    private int runs;
    private int wickets;
    private double overs;

    @Override
    public void update(int runs, int wickets, double overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    public void display() {
        System.out.println("Current Score Display");
        System.out.println("Runs: " + runs);
        System.out.println("Wickets: " + wickets);
        System.out.println("Overs: " + overs);
    }

}
