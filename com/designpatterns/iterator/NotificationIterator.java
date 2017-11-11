package com.designpatterns.iterator;

/**
 * Notification Iterator Class
 */

public class NotificationIterator implements Iterator {

    private Notification[] notifications;
    private int pos = 0;

    public NotificationIterator(Notification[] notifications) {
        this.notifications = notifications;
    }

    @Override
    public Object next() {
        Notification notification = notifications[pos];
        pos++;
        return notification;
    }

    @Override
    public boolean hasNext() {
        if (pos >= notifications.length
            ||
            notifications[pos] == null) {
            return false;
        } else {
            return false;
        }
    }

}
