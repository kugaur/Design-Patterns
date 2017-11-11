package com.designpatterns.chainofresponsibility;

/**
 * Test Chain Class
 */
public class TestChain {

    public static void main(String[] args) {
        Chain chain1 = new NegativeProcessor();
        Chain chain2 = new ZeroProcessor();
        Chain chain3 = new PositiveProcessor();

        chain1.setNext(chain2);
        chain2.setNext(chain3);

        chain1.process(new Number(90));
        chain1.process(new Number(-50));
        chain1.process(new Number(0));
        chain1.process(new Number(91));
    }
}
