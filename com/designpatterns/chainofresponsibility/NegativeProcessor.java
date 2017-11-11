package com.designpatterns.chainofresponsibility;

/**
 * Negative Processor Class
 */
public class NegativeProcessor implements Chain {

    private Chain nextInChain;

    @Override
    public void setNext(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() < 0) {
            System.out.println("Negative");
        } else {
            nextInChain.process(request);
        }
    }

}
