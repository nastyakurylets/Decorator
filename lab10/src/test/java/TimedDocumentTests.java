import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ua.ucu.edu.decorator.MockedDocument;
import ua.ucu.edu.decorator.TimedDocument;
import ua.ucu.edu.decorator.Document;



public class TimedDocumentTests {
        
        @Test
        public void testTimedDocument() {
            Document document = new MockedDocument("Mocked text result");
            TimedDocument timedDocument = new TimedDocument(document);
            assertEquals("Mocked text result", timedDocument.parse());
        }
}