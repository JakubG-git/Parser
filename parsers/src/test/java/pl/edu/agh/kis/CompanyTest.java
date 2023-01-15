package pl.edu.agh.kis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CompanyTest {
    @Test
    public void testCompany() {
        assertNotEquals(null, new Company());
    }
    @Test
    public void testAppendData() {
        Company company = new Company();
        company.appendData("key", "value");
        assertNotEquals(null, company);
    }
}
