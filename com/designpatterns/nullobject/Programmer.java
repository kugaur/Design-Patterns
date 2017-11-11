package com.designpatterns.nullobject;

/**
 * Programmer Class
 */
public class Programmer extends AbstractEmployee {

    public Programmer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

}
