//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.16 at 07:33:06 PM CET 
//


package pl.edu.agh.kis.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Pełny zestaw danych o osobie fizycznej lub niefizycznej - bez elementu Poczta w adresie polskim
 * 
 * <p>Java class for TPodmiotDowolnyPelny1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPodmiotDowolnyPelny1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="OsobaFizyczna" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TIdentyfikatorOsobyFizycznejPelny"/&gt;
 *           &lt;element name="OsobaNiefizyczna" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TIdentyfikatorOsobyNiefizycznejPelny"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="AdresZamieszkaniaSiedziby"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TAdres1"&gt;
 *                 &lt;attribute name="rodzajAdresu" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="RAD" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPodmiotDowolnyPelny1", propOrder = {
    "osobaFizyczna",
    "osobaNiefizyczna",
    "adresZamieszkaniaSiedziby"
})
public class TPodmiotDowolnyPelny1 {

    @XmlElement(name = "OsobaFizyczna")
    protected TIdentyfikatorOsobyFizycznejPelny osobaFizyczna;
    @XmlElement(name = "OsobaNiefizyczna")
    protected TIdentyfikatorOsobyNiefizycznejPelny osobaNiefizyczna;
    @XmlElement(name = "AdresZamieszkaniaSiedziby", required = true)
    protected TPodmiotDowolnyPelny1 .AdresZamieszkaniaSiedziby adresZamieszkaniaSiedziby;

    /**
     * Gets the value of the osobaFizyczna property.
     * 
     * @return
     *     possible object is
     *     {@link TIdentyfikatorOsobyFizycznejPelny }
     *     
     */
    public TIdentyfikatorOsobyFizycznejPelny getOsobaFizyczna() {
        return osobaFizyczna;
    }

    /**
     * Sets the value of the osobaFizyczna property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIdentyfikatorOsobyFizycznejPelny }
     *     
     */
    public void setOsobaFizyczna(TIdentyfikatorOsobyFizycznejPelny value) {
        this.osobaFizyczna = value;
    }

    /**
     * Gets the value of the osobaNiefizyczna property.
     * 
     * @return
     *     possible object is
     *     {@link TIdentyfikatorOsobyNiefizycznejPelny }
     *     
     */
    public TIdentyfikatorOsobyNiefizycznejPelny getOsobaNiefizyczna() {
        return osobaNiefizyczna;
    }

    /**
     * Sets the value of the osobaNiefizyczna property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIdentyfikatorOsobyNiefizycznejPelny }
     *     
     */
    public void setOsobaNiefizyczna(TIdentyfikatorOsobyNiefizycznejPelny value) {
        this.osobaNiefizyczna = value;
    }

    /**
     * Gets the value of the adresZamieszkaniaSiedziby property.
     * 
     * @return
     *     possible object is
     *     {@link TPodmiotDowolnyPelny1 .AdresZamieszkaniaSiedziby }
     *     
     */
    public TPodmiotDowolnyPelny1 .AdresZamieszkaniaSiedziby getAdresZamieszkaniaSiedziby() {
        return adresZamieszkaniaSiedziby;
    }

    /**
     * Sets the value of the adresZamieszkaniaSiedziby property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPodmiotDowolnyPelny1 .AdresZamieszkaniaSiedziby }
     *     
     */
    public void setAdresZamieszkaniaSiedziby(TPodmiotDowolnyPelny1 .AdresZamieszkaniaSiedziby value) {
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
     *     &lt;extension base="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TAdres1"&gt;
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
        extends TAdres1
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
