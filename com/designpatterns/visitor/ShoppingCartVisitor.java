package com.designpatterns.visitor;

/**
 * ShoppingCartVisitor Interface
 */
public interface ShoppingCartVisitor {

    /**
     * Method to visit a book.
     * 
     * @param book book 
     * @return cost
     */
    int visit(Book book);

    /**
     * Method to visit a fruit.
     * 
     * @param fruit Fruit
     * @return cost
     */
    int visit(Fruit fruit);
}
