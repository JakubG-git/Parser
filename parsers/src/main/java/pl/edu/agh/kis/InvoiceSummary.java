package pl.edu.agh.kis;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.math.BigDecimal;
/**
 * Class for invoice summary.
 * @author Jakub Głowacki
 */
@XmlRootElement
public class InvoiceSummary {

    private int numberOfInvoices = 0;

    private BigDecimal totalValue = BigDecimal.ZERO;
    /**
     * Constructor for InvoiceSummary class.
     * It is needed for JAXB to work properly.
     */
    public InvoiceSummary(){ /* JAXB needs it */ }
    /**
     * Method for adding a data to the invoice summary.
     * @param netValue - String with net value of the invoice
     */
    public void appendData(String netValue){
        netValue = netValue.replaceAll("[^0-9.,]","")
                .replace(",",".")
                .replace(" ","");
        totalValue = totalValue.add(new BigDecimal(netValue));
        numberOfInvoices++;
    }
    /**
     * Method for adding a data to the invoice summary.
     * @param netValue - BigDecimal with net value of the invoice
     */
    public void appendData(BigDecimal netValue){
        numberOfInvoices++;
        totalValue = totalValue.add(netValue);
    }

    /**
     * Setter for numberOfInvoices.
     * @param numberOfInvoices - number of invoices
     */
    public void setNumberOfInvoices(int numberOfInvoices){
         this.numberOfInvoices = numberOfInvoices;
    }

    /**
     * Getter for numberOfInvoices.
     * @return number of invoices
     */
    public int getNumberOfInvoices() {
        return this.numberOfInvoices;
    }

    /**
     * Getter for totalValue.
     * @return total value of all invoices
     */
    public BigDecimal getTotalValue() {
        return totalValue;
    }
}
