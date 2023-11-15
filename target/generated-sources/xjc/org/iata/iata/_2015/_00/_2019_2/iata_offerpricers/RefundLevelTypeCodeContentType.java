//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_offerpricers;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundLevelTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundLevelTypeCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Full"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Partial"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RefundLevelTypeCodeContentType")
@XmlEnum
public enum RefundLevelTypeCodeContentType {


    /**
     * Fully Refundable
     * 
     */
    @XmlEnumValue("Full")
    FULL("Full"),

    /**
     * Non Refundable
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Partial")
    PARTIAL("Partial");
    private final String value;

    RefundLevelTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundLevelTypeCodeContentType fromValue(String v) {
        for (RefundLevelTypeCodeContentType c: RefundLevelTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
