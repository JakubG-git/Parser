//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.17 at 01:52:22 PM CET 
//


package pl.edu.agh.kis.generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Podstawowy zestaw danych identyfikacyjnych o osobie fizycznej z identyfikatorem NIP albo PESEL
 * 
 * <p>Java class for TIdentyfikatorOsobyFizycznej1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIdentyfikatorOsobyFizycznej1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="NIP" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TNrNIP"/&gt;
 *           &lt;element name="PESEL" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TNrPESEL"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ImiePierwsze" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TImie"/&gt;
 *         &lt;element name="Nazwisko" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TNazwisko"/&gt;
 *         &lt;element name="DataUrodzenia" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIdentyfikatorOsobyFizycznej1", propOrder = {
    "nip",
    "pesel",
    "imiePierwsze",
    "nazwisko",
    "dataUrodzenia"
})
public class TIdentyfikatorOsobyFizycznej1 {

    @XmlElement(name = "NIP")
    protected String nip;
    @XmlElement(name = "PESEL")
    protected String pesel;
    @XmlElement(name = "ImiePierwsze", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String imiePierwsze;
    @XmlElement(name = "Nazwisko", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String nazwisko;
    @XmlElement(name = "DataUrodzenia", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataUrodzenia;

    /**
     * Gets the value of the nip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIP() {
        return nip;
    }

    /**
     * Sets the value of the nip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIP(String value) {
        this.nip = value;
    }

    /**
     * Gets the value of the pesel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPESEL() {
        return pesel;
    }

    /**
     * Sets the value of the pesel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPESEL(String value) {
        this.pesel = value;
    }

    /**
     * Gets the value of the imiePierwsze property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImiePierwsze() {
        return imiePierwsze;
    }

    /**
     * Sets the value of the imiePierwsze property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImiePierwsze(String value) {
        this.imiePierwsze = value;
    }

    /**
     * Gets the value of the nazwisko property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwisko() {
        return nazwisko;
    }

    /**
     * Sets the value of the nazwisko property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwisko(String value) {
        this.nazwisko = value;
    }

    /**
     * Gets the value of the dataUrodzenia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataUrodzenia() {
        return dataUrodzenia;
    }

    /**
     * Sets the value of the dataUrodzenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataUrodzenia(XMLGregorianCalendar value) {
        this.dataUrodzenia = value;
    }

}
