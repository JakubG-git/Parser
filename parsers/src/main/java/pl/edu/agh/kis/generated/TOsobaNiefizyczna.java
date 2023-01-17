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
 * Podstawowy zestaw danych o osobie niefizycznej
 * 
 * <p>Java class for TOsobaNiefizyczna complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TOsobaNiefizyczna"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OsobaNiefizyczna" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TIdentyfikatorOsobyNiefizycznej"/&gt;
 *         &lt;element name="AdresSiedziby"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TAdres"&gt;
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
@XmlType(name = "TOsobaNiefizyczna", propOrder = {
    "osobaNiefizyczna",
    "adresSiedziby"
})
public class TOsobaNiefizyczna {

    @XmlElement(name = "OsobaNiefizyczna", required = true)
    protected TIdentyfikatorOsobyNiefizycznej osobaNiefizyczna;
    @XmlElement(name = "AdresSiedziby", required = true)
    protected TOsobaNiefizyczna.AdresSiedziby adresSiedziby;

    /**
     * Gets the value of the osobaNiefizyczna property.
     * 
     * @return
     *     possible object is
     *     {@link TIdentyfikatorOsobyNiefizycznej }
     *     
     */
    public TIdentyfikatorOsobyNiefizycznej getOsobaNiefizyczna() {
        return osobaNiefizyczna;
    }

    /**
     * Sets the value of the osobaNiefizyczna property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIdentyfikatorOsobyNiefizycznej }
     *     
     */
    public void setOsobaNiefizyczna(TIdentyfikatorOsobyNiefizycznej value) {
        this.osobaNiefizyczna = value;
    }

    /**
     * Gets the value of the adresSiedziby property.
     * 
     * @return
     *     possible object is
     *     {@link TOsobaNiefizyczna.AdresSiedziby }
     *     
     */
    public TOsobaNiefizyczna.AdresSiedziby getAdresSiedziby() {
        return adresSiedziby;
    }

    /**
     * Sets the value of the adresSiedziby property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOsobaNiefizyczna.AdresSiedziby }
     *     
     */
    public void setAdresSiedziby(TOsobaNiefizyczna.AdresSiedziby value) {
        this.adresSiedziby = value;
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
    public static class AdresSiedziby
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
