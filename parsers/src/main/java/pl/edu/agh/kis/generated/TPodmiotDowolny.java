//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.17 at 02:13:18 PM CET 
//


package pl.edu.agh.kis.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Podstawowy zestaw danych o osobie fizycznej lub niefizycznej
 * 
 * <p>Java class for TPodmiotDowolny complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPodmiotDowolny"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TPodmiotDowolnyBezAdresu"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdresZamieszkaniaSiedziby"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TAdres"&gt;
 *                 &lt;attribute name="rodzajAdresu" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="RAD" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPodmiotDowolny", propOrder = {
    "adresZamieszkaniaSiedziby"
})
public class TPodmiotDowolny
    extends TPodmiotDowolnyBezAdresu
{

    @XmlElement(name = "AdresZamieszkaniaSiedziby", required = true)
    protected TPodmiotDowolny.AdresZamieszkaniaSiedziby adresZamieszkaniaSiedziby;

    /**
     * Gets the value of the adresZamieszkaniaSiedziby property.
     * 
     * @return
     *     possible object is
     *     {@link TPodmiotDowolny.AdresZamieszkaniaSiedziby }
     *     
     */
    public TPodmiotDowolny.AdresZamieszkaniaSiedziby getAdresZamieszkaniaSiedziby() {
        return adresZamieszkaniaSiedziby;
    }

    /**
     * Sets the value of the adresZamieszkaniaSiedziby property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPodmiotDowolny.AdresZamieszkaniaSiedziby }
     *     
     */
    public void setAdresZamieszkaniaSiedziby(TPodmiotDowolny.AdresZamieszkaniaSiedziby value) {
        this.adresZamieszkaniaSiedziby = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TAdres"&gt;
     *       &lt;attribute name="rodzajAdresu" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="RAD" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdresZamieszkaniaSiedziby
        extends TAdres
    {

        @XmlAttribute(name = "rodzajAdresu", required = true)
        protected String rodzajAdresu;

        /**
         * Gets the value of the rodzajAdresu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRodzajAdresu() {
            if (rodzajAdresu == null) {
                return "RAD";
            } else {
                return rodzajAdresu;
            }
        }

        /**
         * Sets the value of the rodzajAdresu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRodzajAdresu(String value) {
            this.rodzajAdresu = value;
        }

    }

}
