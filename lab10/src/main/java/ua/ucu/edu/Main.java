package ua.ucu.edu;

import ua.ucu.edu.decorator.MockedDocument;
import ua.ucu.edu.decorator.SmartDocument;
import ua.ucu.edu.decorator.TimedDocument;

public class Main {
    public static void main(String[] args) {
        // SmartDocument smartDocument = new SmartDocument(null);
        // smartDocument.parse();

        MockedDocument mockedDocument = new MockedDocument();
        System.out.println(mockedDocument.parse());

        TimedDocument timedDocument = new TimedDocument(mockedDocument);
        System.out.println(timedDocument.parse());
    }
}