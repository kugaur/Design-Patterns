package com.designpatterns.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * Non-Veg Menu
 */
public class NonVegMenu implements Menu {

    @Override
    public List<String> getItems() {
        List<String> items = new ArrayList<String>();
        items.add("Chicken");
        return items;
    }
}
