//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_offerpricerq;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LengthUnitCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LengthUnitCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CMT"/&gt;
 *     &lt;enumeration value="FOT"/&gt;
 *     &lt;enumeration value="INH"/&gt;
 *     &lt;enumeration value="MTR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LengthUnitCodeContentType")
@XmlEnum
public enum LengthUnitCodeContentType {


    /**
     * Centimeter
     * 
     */
    CMT,

    /**
     * Foot
     * 
     */
    FOT,

    /**
     * Inch
     * 
     */
    INH,

    /**
     * Meter
     * 
     */
    MTR;

    public String value() {
        return name();
    }

    public static LengthUnitCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}