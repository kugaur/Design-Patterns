package com.designpatterns.iterator;

/**
 * Main Class 
 */
public class Main {

    public static void main(String[] args) {
        NotificationCollection collection = new NotificationCollection();
        NotificationBar bar = new NotificationBar(collection);
        bar.printNotifications();
    }
}
