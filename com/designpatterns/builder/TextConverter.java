package com.designpatterns.builder;

/**
 * Interface for Text Converter
 */
public interface TextConverter {

    /**
     * Method to convert Character.
     * 
     * @param character Character
     */
    void convertCharacter(char character);

    /**
     * Method to convert Paragraph
     */
    void convertParagraph();
}
