package pl.edu.agh.kis;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.math.BigDecimal;
/**
 * Class for invoice summary.
 * @author Jakub Głowacki
 */
@XmlRootElement
public class InvoiceSummary {

    @XmlElement
    private int numberOfInvoices = 0;
    @XmlElement
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
     * Setter for totalValue.
     * @param totalValue - total value of all invoices
     */
    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    /**
     * Getter for numberOfInvoices.
     * @return number of invoices
     */
    public int getNumberOfInvoices() {
        return numberOfInvoices;
    }

    /**
     * Getter for totalValue.
     * @return total value of all invoices
     */
    public BigDecimal getTotalValue() {
        return totalValue;
    }
}
