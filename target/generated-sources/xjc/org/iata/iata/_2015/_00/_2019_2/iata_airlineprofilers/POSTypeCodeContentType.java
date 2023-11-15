//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_airlineprofilers;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POS_TypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="POS_TypeCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "POS_TypeCodeContentType")
@XmlEnum
public enum POSTypeCodeContentType {


    /**
     * Airline Specific Codes
     * 
     */
    A,

    /**
     * Home IATA Agency No.
     * 
     */
    H,

    /**
     * IATA Travel Agency No.
     * 
     */
    I,

    /**
     * LNIATA Number (CRT Address)
     * 
     */
    L,

    /**
     * Pseudo Code/Travel Agency Code
     * 
     */
    T,

    /**
     * Home Travel Agency Code
     * 
     */
    U,

    /**
     * CRS/CXR Department Code
     * 
     */
    V,

    /**
     * Department/Identifier
     * 
     */
    X;

    public String value() {
        return name();
    }

    public static POSTypeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
