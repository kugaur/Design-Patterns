package com.designpatterns.visitor;

/**
 * ItemElement Interface 
 */
public interface ItemElement {

    int accept(ShoppingCartVisitor visitor);
}
