package com.designpatterns.builder;

/**
 * Interface for House Plan
 */
public interface HousePlan {

    /**
     * Method to set basement.
     * 
     * @param basement Basement
     */
    void setBasement(String basement);

    /**
     * Method to set structure.
     * 
     * @param structure Structure
     */
    void setStructure(String structure);

    /**
     * Method to set roof.
     * 
     * @param roof Roof
     */
    void setRoof(String roof);

    /**
     * Method to set interior.
     * 
     * @param interior Interior
     */
    void setInterior(String interior);
}
