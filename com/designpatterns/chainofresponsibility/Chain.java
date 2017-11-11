package com.designpatterns.chainofresponsibility;

/**
 * Chain Interface
 */
public interface Chain {

    /**
     * Method to set next in chain.
     * 
     * @param nextInChain Next in Chain
     */
    void setNext(Chain nextInChain);

    /**
     * Method to process.
     * 
     * @param request Request
     */
    void process(Number request);
}
