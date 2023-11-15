//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderviewrs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellerFollowupActionCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellerFollowupActionCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Accept"/&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *     &lt;enumeration value="Contact Airline"/&gt;
 *     &lt;enumeration value="Reshop"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SellerFollowupActionCodeContentType")
@XmlEnum
public enum SellerFollowupActionCodeContentType {


    /**
     * Accept
     * 
     */
    @XmlEnumValue("Accept")
    ACCEPT("Accept"),

    /**
     * Cancel, with ability to add optional FareWaiver
     * 
     */
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),

    /**
     * Contact Airline with the ability to include an option URL for the contact details.
     * 
     */
    @XmlEnumValue("Contact Airline")
    CONTACT_AIRLINE("Contact Airline"),

    /**
     * Reshop, with ability to add optional FareWaiver
     * 
     */
    @XmlEnumValue("Reshop")
    RESHOP("Reshop");
    private final String value;

    SellerFollowupActionCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellerFollowupActionCodeContentType fromValue(String v) {
        for (SellerFollowupActionCodeContentType c: SellerFollowupActionCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
