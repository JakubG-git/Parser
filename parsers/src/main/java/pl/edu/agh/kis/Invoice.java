package pl.edu.agh.kis;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoice class represents all invoices
 * @author Jakub Głowacki
 */
@XmlRootElement(name = "invoice")
public class Invoice {
    /**
     * List of all invoices(per company)
     */
    @XmlRootElement(name = "companies")
    static class Companies {
        @XmlElement(name = "company")
        ArrayList<Company> companyArrayList = new ArrayList<>();

        /**
         * Constructor for Companies class.
         * It is needed for JAXB to work properly.
         */
        public Companies() {/* JAXB needs it */}

        /**
         * Constructor for Companies class.
         * @param companyArrayList - list of all companies with invoices
         */
        public Companies(List<Company> companyArrayList) {
            this.companyArrayList = (ArrayList<Company>) companyArrayList;
        }
    }
    @XmlRootElement(name = "invoiceRows")
    static class InvoiceRows{
        @XmlElement(name = "invoiceRow")
        ArrayList<InvoiceRow> invoiceRowArrayList = new ArrayList<>();
        /**
         * Constructor for InvoiceRows class.
         * It is needed for JAXB to work properly.
         */
        public InvoiceRows() {/* JAXB needs it */}
        /**
         * Constructor for InvoiceRows class.
         * @param invoiceRowArrayList - list of all invoice rows
         */
        public InvoiceRows(List<InvoiceRow> invoiceRowArrayList) {
            this.invoiceRowArrayList = (ArrayList<InvoiceRow>) invoiceRowArrayList;
        }
    }
    @XmlElement(name = "companies")
    private Companies companies = new Companies();
    @XmlElement(name = "invoiceSummary")
    private InvoiceSummary invoiceSummary = new InvoiceSummary();

    @XmlElement(name = "invoiceRows")
    private InvoiceRows invoiceRows = new InvoiceRows();

    @XmlElement(name = "invoiceRowSummary")
    private InvoiceSummary invoiceSummary2 = new InvoiceSummary();

    /**
     * Constructor for Invoice class.
     * It is needed for JAXB to work properly.
     */
    public Invoice() {/* JAXB needs it */}

    /**
     * Constructor for Invoice class.
     * @param companies - list of all companies with invoices
     * @param invoiceSummary - summary of all invoices
     * @param invoiceRows - list of all invoice rows
     * @param invoiceSummary2 - summary of all invoice rows
     */
    public Invoice(List<Company> companies, InvoiceSummary invoiceSummary, List<InvoiceRow> invoiceRows, InvoiceSummary invoiceSummary2) {
        this.companies = new Companies(companies);
        this.invoiceSummary = invoiceSummary;
        this.invoiceRows = new InvoiceRows(invoiceRows);
        this.invoiceSummary2 = invoiceSummary2;
    }


}
