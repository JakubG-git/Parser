package pl.edu.agh.kis;
import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotEquals;


/**
 * Class for testing Main
 * @author Jakub Głowacki
 */
public class MainTest {
    /**
     * Test for Main
     * Tests if main program runs
     */
    @Test
    public void testMain() throws JAXBException, IOException {
        Main.main(new String[0]);
        assertNotEquals(null, new String[0]);

        Main.main(new String[]{"..\\test.csv", "target\\test.xml"});
        Main.main(new String[]{"..\\test.xlsx", "target\\test2.xml"});
        Main.main(new String[]{"..\\test2023.xlsx", "target\\test2023.xml"});
        Main.main(new String[]{"..\\short.csv", "target\\short.xml"});
        Main.main(new String[]{"..\\test.2137", "target\\test3.xml"});
    }
}
