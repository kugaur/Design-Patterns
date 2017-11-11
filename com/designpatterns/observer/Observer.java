package com.designpatterns.observer;

/**
 * Observer Interface
 */
public interface Observer {

    /**
     * Method to update observers.
     * 
     * @param runs Runs
     * @param wickets Wickets
     * @param overs Overs
     */
    void update(int runs, int wickets, double overs);
}
