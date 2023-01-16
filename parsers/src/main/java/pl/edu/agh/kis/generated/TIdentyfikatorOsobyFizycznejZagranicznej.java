//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.16 at 07:33:06 PM CET 
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
 * Zestaw danych identyfikacyjnych dla osoby fizycznej zagranicznej
 * 
 * <p>Java class for TIdentyfikatorOsobyFizycznejZagranicznej complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIdentyfikatorOsobyFizycznejZagranicznej"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImiePierwsze" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TImie"/&gt;
 *         &lt;element name="Nazwisko" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TNazwisko"/&gt;
 *         &lt;element name="DataUrodzenia" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TData"/&gt;
 *         &lt;element name="MiejsceUrodzenia" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TMiejscowosc"/&gt;
 *         &lt;element name="ImieOjca" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TImie" minOccurs="0"/&gt;
 *         &lt;element name="ImieMatki" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TImie" minOccurs="0"/&gt;
 *         &lt;element name="NIP" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TNrNIP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIdentyfikatorOsobyFizycznejZagranicznej", propOrder = {
    "imiePierwsze",
    "nazwisko",
    "dataUrodzenia",
    "miejsceUrodzenia",
    "imieOjca",
    "imieMatki",
    "nip"
})
public class TIdentyfikatorOsobyFizycznejZagranicznej {

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
    @XmlElement(name = "MiejsceUrodzenia", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String miejsceUrodzenia;
    @XmlElement(name = "ImieOjca")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String imieOjca;
    @XmlElement(name = "ImieMatki")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String imieMatki;
    @XmlElement(name = "NIP")
    protected String nip;

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

    /**
     * Gets the value of the miejsceUrodzenia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiejsceUrodzenia() {
        return miejsceUrodzenia;
    }

    /**
     * Sets the value of the miejsceUrodzenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiejsceUrodzenia(String value) {
        this.miejsceUrodzenia = value;
    }

    /**
     * Gets the value of the imieOjca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImieOjca() {
        return imieOjca;
    }

    /**
     * Sets the value of the imieOjca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImieOjca(String value) {
        this.imieOjca = value;
    }

    /**
     * Gets the value of the imieMatki property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImieMatki() {
        return imieMatki;
    }

    /**
     * Sets the value of the imieMatki property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImieMatki(String value) {
        this.imieMatki = value;
    }

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

}
