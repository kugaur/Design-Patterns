package com.designpatterns.singleton;

/**
 * Singleton Class
 */
public class Singleton {

    /*Without volatile modifier it's possible for another thread in Java to see half initialized state of instance variable, 
    but with volatile variable guaranteeing happens-before relationship, 
    all the write will happen on volatile instance before any read of instance variable. */
    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
