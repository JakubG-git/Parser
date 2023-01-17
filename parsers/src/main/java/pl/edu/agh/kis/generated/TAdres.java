//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.17 at 01:52:22 PM CET 
//


package pl.edu.agh.kis.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dane określające adres
 * 
 * <p>Java class for TAdres complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAdres"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="AdresPol" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TAdresPolski"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="AdresZagr" type="{http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/}TAdresZagraniczny"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAdres", propOrder = {
    "adresPol",
    "adresZagr"
})
@XmlSeeAlso({
    pl.edu.agh.kis.generated.TOsobaFizyczna.AdresZamieszkania.class,
    pl.edu.agh.kis.generated.TOsobaFizyczna1 .AdresZamieszkania.class,
    pl.edu.agh.kis.generated.TOsobaFizyczna2 .AdresZamieszkania.class,
    pl.edu.agh.kis.generated.TOsobaNiefizyczna.AdresSiedziby.class,
    pl.edu.agh.kis.generated.TPodmiotDowolny.AdresZamieszkaniaSiedziby.class,
    pl.edu.agh.kis.generated.TOsobaFizycznaPelna.AdresZamieszkania.class,
    pl.edu.agh.kis.generated.TOsobaNiefizycznaPelna.AdresSiedziby.class,
    pl.edu.agh.kis.generated.TPodmiotDowolnyPelny.AdresZamieszkaniaSiedziby.class
})
public class TAdres {

    @XmlElement(name = "AdresPol")
    protected TAdresPolski adresPol;
    @XmlElement(name = "AdresZagr")
    protected TAdresZagraniczny adresZagr;

    /**
     * Gets the value of the adresPol property.
     * 
     * @return
     *     possible object is
     *     {@link TAdresPolski }
     *     
     */
    public TAdresPolski getAdresPol() {
        return adresPol;
    }

    /**
     * Sets the value of the adresPol property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAdresPolski }
     *     
     */
    public void setAdresPol(TAdresPolski value) {
        this.adresPol = value;
    }

    /**
     * Gets the value of the adresZagr property.
     * 
     * @return
     *     possible object is
     *     {@link TAdresZagraniczny }
     *     
     */
    public TAdresZagraniczny getAdresZagr() {
        return adresZagr;
    }

    /**
     * Sets the value of the adresZagr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAdresZagraniczny }
     *     
     */
    public void setAdresZagr(TAdresZagraniczny value) {
        this.adresZagr = value;
    }

}
