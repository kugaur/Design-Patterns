package com.designpatterns.observer;

/**
 * Subject Interface
 */
public interface Subject {

    /**
     * Method to register an observer.
     * 
     * @param observer Observer
     */
    void registerObserver(Observer observer);

    /**
     * Method to unregister an observer.
     * 
     * @param observer Observer
     */
    void unregisterObserver(Observer observer);

    /**
     * Method to notify observers
     */
    void notifyObservers();
}
