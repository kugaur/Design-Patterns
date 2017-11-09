package com.designpatterns.facade;

import java.util.List;

/**
 * Menu Interface.
 */
public interface Menu {

    /**
     * Method to get Menu Items.
     * 
     * @return Menu Items.
     */
    List<String> getItems();
}
