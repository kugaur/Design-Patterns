package com.designpatterns.iterator;

/**
 * Notification Bar Class
 */
public class NotificationBar {

    private NotificationCollection notifications;

    public NotificationBar(NotificationCollection notifications) {
        this.notifications = notifications;
    }

    public void printNotifications() {
        Iterator iterator = notifications.createIterator();

        System.out.println("Notification Bar");
        while (iterator.hasNext()) {
            System.out.println(((Notification)iterator.next()).getNotification());
        }
    }
}
