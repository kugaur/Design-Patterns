package com.designpatterns.builder;

/**
 * Tip House Builder Implementation
 */
public class TipHouseBuilder implements HouseBuilder {

    private static final String BASEMENT = "Wooden Poles";
    private static final String STRUCTURE = "Wood and Ice";
    private static final String INTERIOR = "Fire Wood";
    private static final String ROOF = "Wood, caribou and seal skins";

    private House house;

    public TipHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement(BASEMENT);
    }

    @Override
    public void buildStructure() {
        house.setBasement(STRUCTURE);
    }

    @Override
    public void buildRoof() {
        house.setRoof(ROOF);
    }

    @Override
    public void buildInterior() {
        house.setInterior(INTERIOR);
    }

    @Override
    public House getHouse() {
        return this.house;
    }

}
