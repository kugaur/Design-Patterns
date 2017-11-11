package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * CricketData Class
 */
public class CricketData implements Subject {

    private int runs;
    private int wickets;
    private double overs;
    private List<Observer> observers;

    public CricketData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(runs, wickets, overs);
        }
    }

    public void dataChanged() {
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();
        notifyObservers();
    }

    private int getLatestRuns() {
        return 90;
    }

    private int getLatestWickets() {
        return 7;
    }

    private double getLatestOvers() {
        return 23.2;
    }
}
