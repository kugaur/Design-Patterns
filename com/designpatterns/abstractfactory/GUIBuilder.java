package com.designpatterns.abstractfactory;

/**
 * Client Class
 */
public class GUIBuilder {

    private static final String TITLE = "New Window";

    /**
     * Method to build Window
     * @param widgetFactory WidgetFactory
     */
    public void buildWindow(AbstractWidgetFactory widgetFactory) {
        Window window = widgetFactory.createWindow();
        window.setTitle(TITLE);
    }
}
