package com.designpatterns.singleton;

/**
 * Singleton Class
 */
public class Singleton {

    /*Without volatile modifier it's possible for another thread in Java to see half initialized state of _instance variable, 
    but with volatile variable guaranteeing happens-before relationship, 
    all the write will happen on volatile _instance before any read of _instance variable. */
    private volatile static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
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
