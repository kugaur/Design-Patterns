package com.designpatterns.builder;

/**
 * House Builder Interface.
 */
public interface HouseBuilder {

    /**
     * Method to build basement.
     */
    void buildBasement();

    /**
     * Method to build structure.
     */
    void buildStructure();

    /**
     * Method to build roof.
     */
    void buildRoof();

    /**
     * Method to build interior
     */
    void buildInterior();

    /**
     * Method to get house.
     * 
     * @return House
     */
    House getHouse();
}
