//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_airshoppingrs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoundingPrecisionCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoundingPrecisionCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Down"/&gt;
 *     &lt;enumeration value="Up"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoundingPrecisionCodeContentType")
@XmlEnum
public enum RoundingPrecisionCodeContentType {


    /**
     * round down
     * 
     */
    @XmlEnumValue("Down")
    DOWN("Down"),

    /**
     * round up
     * 
     */
    @XmlEnumValue("Up")
    UP("Up");
    private final String value;

    RoundingPrecisionCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoundingPrecisionCodeContentType fromValue(String v) {
        for (RoundingPrecisionCodeContentType c: RoundingPrecisionCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
