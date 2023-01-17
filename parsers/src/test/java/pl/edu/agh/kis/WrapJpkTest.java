package pl.edu.agh.kis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class WrapJpkTest {
    @Test
    public void testWrapJpk() {
        WrapJpk wrapJpk = new WrapJpk();
        assertNotEquals(null, wrapJpk);
    }

}
