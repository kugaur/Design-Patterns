package com.designpatterns.observer;

/**
 * AverageScoreDisplay Class 
 */
public class AverageScoreDisplay implements Observer {

    private double runRate;
    private int predictedScore;

    @Override
    public void update(int runs, int wickets, double overs) {
        this.runRate = runs / overs;
        this.predictedScore = (int)(this.runRate * 50);
        display();
    }

    public void display() {
        System.out.println("Average Score Display");
        System.out.println("Run Rate: " + runRate);
        System.out.println("Predicted Score: " + predictedScore);
    }

}
