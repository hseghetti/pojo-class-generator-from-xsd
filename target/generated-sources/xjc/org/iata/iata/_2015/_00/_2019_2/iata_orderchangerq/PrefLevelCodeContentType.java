//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderchangerq;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrefLevelCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrefLevelCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Exclude"/&gt;
 *     &lt;enumeration value="Preferred"/&gt;
 *     &lt;enumeration value="Required"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PrefLevelCodeContentType")
@XmlEnum
public enum PrefLevelCodeContentType {

    @XmlEnumValue("Exclude")
    EXCLUDE("Exclude"),
    @XmlEnumValue("Preferred")
    PREFERRED("Preferred"),

    /**
     * female description
     * 
     */
    @XmlEnumValue("Required")
    REQUIRED("Required");
    private final String value;

    PrefLevelCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrefLevelCodeContentType fromValue(String v) {
        for (PrefLevelCodeContentType c: PrefLevelCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
