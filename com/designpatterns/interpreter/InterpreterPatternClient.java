package com.designpatterns.interpreter;

/**
 * Client Class
 */
public class InterpreterPatternClient {

    public static void main(String[] args) {
        String infix = "a+b*c";

        InfixToPostfixPattern ip = new InfixToPostfixPattern();

        String postfix = ip.convert(infix);
        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + postfix);
    }
}
