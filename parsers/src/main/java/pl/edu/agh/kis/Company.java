package pl.edu.agh.kis;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Class for storing details of a single invoice.
 * @author Jakub Głowacki
 */
@XmlRootElement
public class Company{
    /**
     * HashMap for storing details of a single invoice.
     * Key is a name of the detail, value is a value of the detail.
     * Details are stored in the same order as they are in the XML file.
     * @see LinkedHashMap
     */
    @XmlElement
    private final HashMap<String, String> invoiceDetails = new LinkedHashMap<>(15, 0.75f, false);
    /**
     * Constructor for Invoice class.
     * It is needed for JAXB to work properly.
     */
    public Company(){/* JAXB needs it */}

    /**
     * Method for adding a new detail to the invoice.
     * @param key - name of the detail
     * @param value - value of the detail
     */
    public void appendData(String key, String value){
        invoiceDetails.put(key, value);
    }
}
