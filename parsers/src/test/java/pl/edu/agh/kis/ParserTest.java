package pl.edu.agh.kis;

import org.apache.commons.math3.util.Pair;
import org.junit.jupiter.api.Test;
import pl.edu.agh.kis.generated.JPK;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ParserTest {

    @Test
    public void testParserByStages() throws IOException {
        Parser parser = new Parser("..\\test.csv", '\t', true);
        assertNotEquals(null, parser);
        Pair<Invoice, JPK> pair = parser.saveToXML();
        Invoice invoice = pair.getKey();
        assertNotEquals(null, invoice);
        parser.resetParser("..\\test.xlsx", '\t', false);
        Invoice invoice2 = parser.saveToXML().getKey();
        assertNotEquals(null, invoice2);
    }
    @Test
    public void testParserByStages2() throws IOException {
        Parser parser = new Parser("..\\test.xlsx", '\t', false);
        assertNotEquals(null, parser);
        Invoice invoice = parser.saveToXML().getKey();
        assertNotEquals(null, invoice);
        parser.resetParser("..\\test.csv", '\t', true);
        Invoice invoice2 = parser.saveToXML().getKey();
        assertNotEquals(null, invoice2);
    }
}
