package com.designpatterns.abstractfactory;

/**
 * Implementation class for MS Window
 */
public class MSWindow implements Window {

    @Override
    public void setTitle(String title) {
        // MS Windows specific behavior
    }

    @Override
    public void repaint() {
        // MS Windows specific behavior
    }

}
