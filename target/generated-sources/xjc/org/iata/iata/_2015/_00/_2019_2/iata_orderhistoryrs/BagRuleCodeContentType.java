//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderhistoryrs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BagRuleCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BagRuleCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Y"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BagRuleCodeContentType")
@XmlEnum
public enum BagRuleCodeContentType {


    /**
     * Disclosure with NO US DOT Reservation
     * 
     */
    D("D"),

    /**
     * No Disclosure or US DOT Reservation
     * 
     */
    N("N"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Disclosure and US DOT Reservation
     * 
     */
    Y("Y");
    private final String value;

    BagRuleCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BagRuleCodeContentType fromValue(String v) {
        for (BagRuleCodeContentType c: BagRuleCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
