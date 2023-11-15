//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderchangenotifrq;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PenaltyTypeCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Cancellation"/&gt;
 *     &lt;enumeration value="Change"/&gt;
 *     &lt;enumeration value="NoShow"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Upgrade"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PenaltyTypeCodeContentType")
@XmlEnum
public enum PenaltyTypeCodeContentType {


    /**
     * Cancellation
     * 
     */
    @XmlEnumValue("Cancellation")
    CANCELLATION("Cancellation"),

    /**
     * Change
     * 
     */
    @XmlEnumValue("Change")
    CHANGE("Change"),

    /**
     * NoShow
     * 
     */
    @XmlEnumValue("NoShow")
    NO_SHOW("NoShow"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Upgrade
     * 
     */
    @XmlEnumValue("Upgrade")
    UPGRADE("Upgrade");
    private final String value;

    PenaltyTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PenaltyTypeCodeContentType fromValue(String v) {
        for (PenaltyTypeCodeContentType c: PenaltyTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
