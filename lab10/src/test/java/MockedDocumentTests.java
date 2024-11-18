import org.junit.jupiter.api.Test;

import ua.ucu.edu.decorator.MockedDocument;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockedDocumentTests {
    
    @Test
    public void testMockedDocument() {
        MockedDocument doc = new MockedDocument("Mocked text result");
        assertEquals("Mocked text result", doc.parse());
    }
}