package com.designpatterns.abstractfactory;

/**
 * Interface for Window
 */
public interface Window {

    /**
     * Method to set title.
     * 
     * @param title Title
     */
    public void setTitle(String title);

    /**
     * Method to repaint.
     */
    public void repaint();
}
