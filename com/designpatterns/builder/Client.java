package com.designpatterns.builder;

/**
 * Client Class
 */
public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        Document document = new Document();
        System.out.println(client.createASCIIText(document));
    }

    private ASCIIText createASCIIText(Document document) {
        ASCIIConverter asciiBuilder = new ASCIIConverter();
        RTFReader rtfReader = new RTFReader(asciiBuilder);
        rtfReader.parseRTF(document);
        return asciiBuilder.getResult();
    }
}
