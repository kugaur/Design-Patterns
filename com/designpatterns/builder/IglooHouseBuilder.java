package com.designpatterns.builder;

/**
 * IglooHouseBuilder Implementation.
 */
public class IglooHouseBuilder implements HouseBuilder {

    private static final String BASEMENT = "Ice Bars";
    private static final String STRUCTURE = "Ice Blocks";
    private static final String INTERIOR = "Ice Carvings";
    private static final String ROOF = "Ice Dome";

    private House house;

    public IglooHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement(BASEMENT);
    }

    @Override
    public void buildStructure() {
        house.setStructure(STRUCTURE);
    }

    @Override
    public void buildRoof() {
        house.setInterior(INTERIOR);
    }

    @Override
    public void buildInterior() {
        house.setRoof(ROOF);
    }

    @Override
    public House getHouse() {
        return this.house;
    }

}
