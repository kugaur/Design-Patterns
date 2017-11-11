package com.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Main Class
 */
public class Design {

    public static void main(String[] args) {
        List<Life.Memento> savedTimes = new ArrayList<Life.Memento>();

        Life life = new Life();

        life.set("1000 BC");
        savedTimes.add(life.saveToMemento());

        life.set("1000 AD");
        savedTimes.add(life.saveToMemento());

        life.restoreFromMemento(savedTimes.get(0));
    }
}
