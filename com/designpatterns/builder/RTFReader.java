package com.designpatterns.builder;

/**
 * RTF Reader Class 
 */
public class RTFReader {

    private static final char EOF = '0';
    private static final char CHAR = 'c';
    private static final char PARA = 'p';
    
    private TextConverter builder;

    RTFReader(TextConverter textConverter) {
        this.builder = textConverter;
    }

    void parseRTF(Document document) {
        char character;
        while ((character = document.getNextToken()) != EOF) {
            switch (character) {
                case CHAR:
                    builder.convertCharacter(character);
                case PARA:
                    builder.convertParagraph();
            }
        }
    }
}
