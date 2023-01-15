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
    }
}
