package com.designpatterns.builder;

public class Document {

    static int value;
    private char token;

    public char getNextToken() {
        return token;
    }
}
