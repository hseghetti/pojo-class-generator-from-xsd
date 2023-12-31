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
 * <p>Java class for ChangeTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangeTypeCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Flight"/&gt;
 *     &lt;enumeration value="Name"/&gt;
 *     &lt;enumeration value="Service"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChangeTypeCodeContentType")
@XmlEnum
public enum ChangeTypeCodeContentType {


    /**
     * This identifies  Flight detail changes.  changes to the core flight details. departure and arrival points and airline.
     * 
     */
    @XmlEnumValue("Flight")
    FLIGHT("Flight"),

    /**
     * Name based changes.    Changes to the passenger(s) names.
     * 
     */
    @XmlEnumValue("Name")
    NAME("Name"),

    /**
     * This identifies  Service non flight changes.   seat preferences/food/baggage etc.
     * 
     */
    @XmlEnumValue("Service")
    SERVICE("Service");
    private final String value;

    ChangeTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChangeTypeCodeContentType fromValue(String v) {
        for (ChangeTypeCodeContentType c: ChangeTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
