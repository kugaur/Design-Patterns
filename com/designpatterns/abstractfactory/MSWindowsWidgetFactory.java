package com.designpatterns.abstractfactory;

/**
 * Implementation class for MSWindows Widget Factory
 */
public class MSWindowsWidgetFactory implements AbstractWidgetFactory {

    @Override
    public Window createWindow() {
        MSWindow window = new MSWindow();
        return window;
    }

}
