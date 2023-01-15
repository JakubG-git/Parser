package pl.edu.agh.kis;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class InvoiceSummaryTest {
    @Test
    public void testInvoiceSummary() {
        assertNotEquals(null, new InvoiceSummary());
    }
    @Test
    public void testAppendData() {
        InvoiceSummary invoiceSummary = new InvoiceSummary();
        invoiceSummary.appendData("21,37");
        assertNotEquals(null, invoiceSummary);
    }
    @Test
    public void testAppendData2() {
        InvoiceSummary invoiceSummary = new InvoiceSummary();
        invoiceSummary.appendData(new BigDecimal("21.37"));
        assertNotEquals(null, invoiceSummary);
    }
    @Test
    public void testSetNumberOfInvoices() {
        InvoiceSummary invoiceSummary = new InvoiceSummary();
        invoiceSummary.setNumberOfInvoices(1);
        assertNotEquals(null, invoiceSummary);
    }
}
