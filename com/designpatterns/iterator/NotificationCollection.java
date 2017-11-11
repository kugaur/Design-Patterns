package com.designpatterns.iterator;

/**
 * Notification Collection
 */
public class NotificationCollection implements Collection {

    private static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    private Notification[] notifications;

    public NotificationCollection() {
        this.notifications = new Notification[MAX_ITEMS];
        addItem("Notification 1");
        addItem("Notification 2");
    }

    public void addItem(String str) {
        Notification notification = new Notification(str);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Full");
        } else {
            notifications[numberOfItems] = notification;
            numberOfItems = numberOfItems + 1;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notifications);
    }

}
