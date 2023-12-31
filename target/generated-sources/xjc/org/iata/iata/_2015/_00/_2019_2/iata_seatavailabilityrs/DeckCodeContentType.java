//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_seatavailabilityrs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeckCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeckCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Lower"/&gt;
 *     &lt;enumeration value="Main"/&gt;
 *     &lt;enumeration value="Upper"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeckCodeContentType")
@XmlEnum
public enum DeckCodeContentType {


    /**
     * Lower Deck
     * 
     */
    @XmlEnumValue("Lower")
    LOWER("Lower"),

    /**
     * Main Deck
     * 
     */
    @XmlEnumValue("Main")
    MAIN("Main"),

    /**
     * Upper Deck
     * 
     */
    @XmlEnumValue("Upper")
    UPPER("Upper");
    private final String value;

    DeckCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeckCodeContentType fromValue(String v) {
        for (DeckCodeContentType c: DeckCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
