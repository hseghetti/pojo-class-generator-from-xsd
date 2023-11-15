//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightCharacteristicCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightCharacteristicCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AirportChange"/&gt;
 *     &lt;enumeration value="Direct"/&gt;
 *     &lt;enumeration value="NonStop"/&gt;
 *     &lt;enumeration value="OvernightStop"/&gt;
 *     &lt;enumeration value="RedEye"/&gt;
 *     &lt;enumeration value="WaitList"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FlightCharacteristicCodeContentType")
@XmlEnum
public enum FlightCharacteristicCodeContentType {

    @XmlEnumValue("AirportChange")
    AIRPORT_CHANGE("AirportChange"),
    @XmlEnumValue("Direct")
    DIRECT("Direct"),
    @XmlEnumValue("NonStop")
    NON_STOP("NonStop"),
    @XmlEnumValue("OvernightStop")
    OVERNIGHT_STOP("OvernightStop"),
    @XmlEnumValue("RedEye")
    RED_EYE("RedEye"),
    @XmlEnumValue("WaitList")
    WAIT_LIST("WaitList");
    private final String value;

    FlightCharacteristicCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightCharacteristicCodeContentType fromValue(String v) {
        for (FlightCharacteristicCodeContentType c: FlightCharacteristicCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
