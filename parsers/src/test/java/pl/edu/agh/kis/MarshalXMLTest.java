package pl.edu.agh.kis;

import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MarshalXMLTest {
    @Test
    public void testMarshalXML() throws IOException, JAXBException {
        String path = "..\\test.csv";
        String path2 = "..\\testTest.xml";
        Parser parser = new Parser(path, '\t', true);
        MarshalXML marshalXML = new MarshalXML(parser.saveToXML(), path2);
        assertNotEquals(null, marshalXML);
        marshalXML.marshalXML();
    }

}
