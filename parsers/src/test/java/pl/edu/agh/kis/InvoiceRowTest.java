package pl.edu.agh.kis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class InvoiceRowTest {
    @Test
    public void testInvoiceRow() {
        assertNotEquals(null, new InvoiceRow());
    }
    @Test
    public void testAppendData() {
        InvoiceRow invoiceRow = new InvoiceRow();
        for (int i = 5; i < 10; i++) {
            invoiceRow.appendData(i,  "1");
        }
        invoiceRow.appendData(11, "23");
        invoiceRow.appendData(2137, "2137");
        assertNotEquals(null, invoiceRow);
    }
}
