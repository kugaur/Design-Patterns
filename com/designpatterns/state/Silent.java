package com.designpatterns.state;

/**
 * Silent Class
 */
public class Silent implements MobileAlertState {

    @Override
    public void alert(AlertStateContext context) {
        System.out.println("Silent");
    }

}
