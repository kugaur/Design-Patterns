package com.designpatterns.iterator;

/**
 * Iterator Interface.
 */
public interface Iterator {

    /**
     * Method to check if there are more items to iterate over.
     * 
     * @return Boolean Value
     */
    boolean hasNext();

    /**
     * Method to get next element.
     * 
     * @return Next element
     */
    Object next();
}
