package pl.edu.agh.kis;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ParserTest {

    @Test
    public void testParserByStages() throws IOException {
        Parser parser = new Parser("C:\\Users\\Jakub\\IdeaProjects\\Parser\\main\\src\\main\\resources\\test.csv", '\t', true);
        assertNotEquals(null, parser);
        Invoice invoice = parser.saveToXML();
        assertNotEquals(null, invoice);
        parser.resetParser("C:\\Users\\Jakub\\IdeaProjects\\Parser\\main\\src\\main\\resources\\test.xlsx", '\t', false);
        Invoice invoice2 = parser.saveToXML();
        assertNotEquals(null, invoice2);
    }
    @Test
    public void testParserByStages2() throws IOException {
        Parser parser = new Parser("C:\\Users\\Jakub\\IdeaProjects\\Parser\\main\\src\\main\\resources\\test.xlsx", '\t', false);
        assertNotEquals(null, parser);
        Invoice invoice = parser.saveToXML();
        assertNotEquals(null, invoice);
        parser.resetParser("C:\\Users\\Jakub\\IdeaProjects\\Parser\\main\\src\\main\\resources\\test.csv", '\t', true);
        Invoice invoice2 = parser.saveToXML();
        assertNotEquals(null, invoice2);
    }
}
