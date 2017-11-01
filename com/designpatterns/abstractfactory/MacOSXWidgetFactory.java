package com.designpatterns.abstractfactory;

/**
 * Implementation class for Mac OSX Widget Factory.
 */
public class MacOSXWidgetFactory implements AbstractWidgetFactory {

    @Override
    public Window createWindow() {
        MacOSXWindow window = new MacOSXWindow();
        return window;
    }

}
