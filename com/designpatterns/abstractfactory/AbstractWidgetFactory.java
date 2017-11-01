package com.designpatterns.abstractfactory;

/**
 * Abstract Factory
 */
public interface AbstractWidgetFactory {

    /**
     * Method to create a window.
     * 
     * @return Window
     */
    Window createWindow();
}
