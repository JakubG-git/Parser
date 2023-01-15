package pl.edu.agh.kis;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class InvoiceTest {
    @Test
    public void testInvoice() {
        assertNotEquals(null, new Invoice());
    }
    @Test
    public void testInvoiceByStages(){
        Invoice.Companies companies = new Invoice.Companies();
        assertNotEquals(null, companies);
        Invoice.InvoiceRows invoiceRows = new Invoice.InvoiceRows();
        assertNotEquals(null, invoiceRows);
        InvoiceSummary invoiceSummary = new InvoiceSummary();
        assertNotEquals(null, invoiceSummary);
        InvoiceSummary invoiceSummary2 = new InvoiceSummary();
        assertNotEquals(null, invoiceSummary2);
        assertNotEquals(null, new Invoice(companies.companyArrayList, invoiceSummary, invoiceRows.invoiceRowArrayList, invoiceSummary2));
    }
    @Test
    public void testInvoiceCompanies() {

        ArrayList<Company> companies = new ArrayList<>();
        assertNotEquals(null, companies);
        assertNotEquals(null, new Invoice.Companies(companies));
    }
    @Test
    public void testInvoiceInvoiceRows() {
        ArrayList<InvoiceRow> invoiceRows = new ArrayList<>();
        assertNotEquals(null, invoiceRows);
        assertNotEquals(null, new Invoice.InvoiceRows(invoiceRows));
    }

}
