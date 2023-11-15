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
 * <p>Java class for ConsequenceOfInactionCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConsequenceOfInactionCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AutoAcceptance"/&gt;
 *     &lt;enumeration value="AutoCancellation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConsequenceOfInactionCodeContentType")
@XmlEnum
public enum ConsequenceOfInactionCodeContentType {


    /**
     * Auto-acceptance by airline
     * 
     */
    @XmlEnumValue("AutoAcceptance")
    AUTO_ACCEPTANCE("AutoAcceptance"),

    /**
     * Auto-cancellation by airline
     * 
     */
    @XmlEnumValue("AutoCancellation")
    AUTO_CANCELLATION("AutoCancellation");
    private final String value;

    ConsequenceOfInactionCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConsequenceOfInactionCodeContentType fromValue(String v) {
        for (ConsequenceOfInactionCodeContentType c: ConsequenceOfInactionCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
