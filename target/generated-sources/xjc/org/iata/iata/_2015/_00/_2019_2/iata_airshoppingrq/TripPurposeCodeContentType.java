//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_airshoppingrq;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripPurposeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TripPurposeCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="BusinessAndLeisure"/&gt;
 *     &lt;enumeration value="Leisure"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TripPurposeCodeContentType")
@XmlEnum
public enum TripPurposeCodeContentType {

    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("BusinessAndLeisure")
    BUSINESS_AND_LEISURE("BusinessAndLeisure"),
    @XmlEnumValue("Leisure")
    LEISURE("Leisure"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    TripPurposeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TripPurposeCodeContentType fromValue(String v) {
        for (TripPurposeCodeContentType c: TripPurposeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
