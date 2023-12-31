//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderlistrq;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceBookingStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceBookingStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CONFIRMED"/&gt;
 *     &lt;enumeration value="REQUESTED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceBookingStatusContentType")
@XmlEnum
public enum ServiceBookingStatusContentType {


    /**
     * Inventory owner confirms he is able to provide the Service.
     * 
     */
    CONFIRMED,

    /**
     * OM requests the Service from the Inventory owner.
     * 
     */
    REQUESTED;

    public String value() {
        return name();
    }

    public static ServiceBookingStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
