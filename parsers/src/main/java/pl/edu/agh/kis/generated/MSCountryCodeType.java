//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.16 at 07:33:06 PM CET 
//


package pl.edu.agh.kis.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MSCountryCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MSCountryCode_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AT"/&gt;
 *     &lt;enumeration value="BE"/&gt;
 *     &lt;enumeration value="BG"/&gt;
 *     &lt;enumeration value="CY"/&gt;
 *     &lt;enumeration value="CZ"/&gt;
 *     &lt;enumeration value="DK"/&gt;
 *     &lt;enumeration value="EE"/&gt;
 *     &lt;enumeration value="FI"/&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="DE"/&gt;
 *     &lt;enumeration value="EL"/&gt;
 *     &lt;enumeration value="HR"/&gt;
 *     &lt;enumeration value="HU"/&gt;
 *     &lt;enumeration value="IE"/&gt;
 *     &lt;enumeration value="IT"/&gt;
 *     &lt;enumeration value="LV"/&gt;
 *     &lt;enumeration value="LT"/&gt;
 *     &lt;enumeration value="LU"/&gt;
 *     &lt;enumeration value="MT"/&gt;
 *     &lt;enumeration value="NL"/&gt;
 *     &lt;enumeration value="PL"/&gt;
 *     &lt;enumeration value="PT"/&gt;
 *     &lt;enumeration value="RO"/&gt;
 *     &lt;enumeration value="SK"/&gt;
 *     &lt;enumeration value="SI"/&gt;
 *     &lt;enumeration value="ES"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="GB"/&gt;
 *     &lt;enumeration value="IC"/&gt;
 *     &lt;enumeration value="XI"/&gt;
 *     &lt;enumeration value="XJ"/&gt;
 *     &lt;enumeration value="MC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MSCountryCode_Type", namespace = "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2013/05/23/eD/KodyCECHKRAJOW/")
@XmlEnum
public enum MSCountryCodeType {

    AT,
    BE,
    BG,
    CY,
    CZ,
    DK,
    EE,
    FI,
    FR,
    DE,
    EL,
    HR,
    HU,
    IE,
    IT,
    LV,
    LT,
    LU,
    MT,
    NL,
    PL,
    PT,
    RO,
    SK,
    SI,
    ES,
    SE,
    GB,
    IC,
    XI,
    XJ,
    MC;

    public String value() {
        return name();
    }

    public static MSCountryCodeType fromValue(String v) {
        return valueOf(v);
    }

}
