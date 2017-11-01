package com.designpatterns.builder;

/**
 * Implementation of ASCII Converter
 */
public class ASCIIConverter implements TextConverter {

    private ASCIIText asciiTextObject;

    @Override
    public void convertCharacter(char character) {
        char asciiCharacter = new Character(character).charValue();
        asciiTextObject.append(asciiCharacter);
    }

    @Override
    public void convertParagraph() {
    }

    public ASCIIText getResult() {
        return asciiTextObject;
    }
}
