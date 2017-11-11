package com.designpatterns.state;

/**
 * Mobile Alert State Interface
 */
public interface MobileAlertState {

    /**
     * Method to alert
     * 
     * @param context Context
     */
    void alert(AlertStateContext context);
}
