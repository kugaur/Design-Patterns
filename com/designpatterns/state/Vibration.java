package com.designpatterns.state;

/**
 * Vibration Class
 */
public class Vibration implements MobileAlertState {

    @Override
    public void alert(AlertStateContext context) {
        System.out.println("Vibration");
    }

}
