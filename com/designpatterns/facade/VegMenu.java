package com.designpatterns.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for Veg Menu
 */
public class VegMenu implements Menu {

    @Override
    public List<String> getItems() {
        List<String> items = new ArrayList<String>();
        items.add("Paneer");
        return items;
    }

}
