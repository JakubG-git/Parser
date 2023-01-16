package pl.edu.agh.kis;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;

import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * Class for invoice row.
 * @author Jakub Głowacki
 */
@Getter
@XmlRootElement
public class InvoiceRow {
    @XmlElement
    String invoiceNumber;
    @XmlElement
    String invoiceDescription;
    @XmlElement
    BigDecimal amountOfGoods;
    @XmlElement
    BigDecimal pricePerGood;
    @XmlElement
    BigDecimal pricePerGoodBrutto;
    @XmlElement
    BigDecimal netValue;
    @XmlElement
    int taxRate;

    /**
     * BigDecimal converter for String
     * @param value - String to be converted
     * @return BigDecimal value
     */
    private BigDecimal convertStringToBigDecimal(String value){
        value = value.replaceAll("[^0-9.,]","")
                .replace(",",".")
                .replace(" ","");
        return new BigDecimal(value);
    }

    /**
     * Constructor for InvoiceRow class.
     * It is needed for JAXB to work properly.
     */
    public InvoiceRow(){/* JAXB needs it */}

    /**
     * Method for adding a new detail to the invoice row.
     * @param i - number of the detail(header number counting from 0)
     * @param value - value of the detail
     */
    public void appendData(int i, String value){
        switch (i){
            case 5:
                invoiceNumber = value;
                break;
            case 6:
                invoiceDescription = value;
                break;
            case 7:
                amountOfGoods = convertStringToBigDecimal(value);;
                break;
            case 8:
                pricePerGood = convertStringToBigDecimal(value);
                break;
            case 9:
                taxRate = (int)(Float.parseFloat(value));
                pricePerGoodBrutto = pricePerGood.multiply(BigDecimal.valueOf(1 + taxRate / 100.0)).setScale(2, RoundingMode.HALF_EVEN);
                break;
            case 11:
                netValue = convertStringToBigDecimal(value);
                break;
            default:
                break;
        }

    }
    public String getTaxRate(){
        return taxRate + "";
    }

}
