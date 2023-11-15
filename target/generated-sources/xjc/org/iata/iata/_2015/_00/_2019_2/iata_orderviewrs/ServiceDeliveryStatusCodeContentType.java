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
 * <p>Java class for ServiceDeliveryStatusCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceDeliveryStatusCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DELIVERED"/&gt;
 *     &lt;enumeration value="EXPIRED"/&gt;
 *     &lt;enumeration value="FAILED TO DELIVER"/&gt;
 *     &lt;enumeration value="IN PROGRESS"/&gt;
 *     &lt;enumeration value="NOT CLAIMED"/&gt;
 *     &lt;enumeration value="READY TO DELIVER"/&gt;
 *     &lt;enumeration value="READY TO PROCEED"/&gt;
 *     &lt;enumeration value="REMOVED"/&gt;
 *     &lt;enumeration value="SUSPENDED"/&gt;
 *     &lt;enumeration value="UNABLE TO DELIVER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceDeliveryStatusCodeContentType")
@XmlEnum
public enum ServiceDeliveryStatusCodeContentType {


    /**
     * Service has been successfully delivered.
     * 
     */
    DELIVERED("DELIVERED"),

    /**
     * Service is no longer available for delivery. Service purchased with an associated time limit for consumption and Service was never claimed. Service having been at least Confirmed is no longer available as the Customer did not claim the Service within a specific time period, as dictated by the Airline.
     * 
     */
    EXPIRED("EXPIRED"),

    /**
     * Service could not be delivered due to AirlineÂ´s or provider limitations.
     * 
     */
    @XmlEnumValue("FAILED TO DELIVER")
    FAILED_TO_DELIVER("FAILED TO DELIVER"),

    /**
     * The DP is in the process of delivering the Service. There is a universal concept that the 'In progress' status may block any further financial transactions; e.g. refund
     * 
     */
    @XmlEnumValue("IN PROGRESS")
    IN_PROGRESS("IN PROGRESS"),

    /**
     * The Service has not been claimed by the Passenger for reasons as a result of Passenger action or inaction. e.g. Passenger no-show, etc.
     * 
     */
    @XmlEnumValue("NOT CLAIMED")
    NOT_CLAIMED("NOT CLAIMED"),

    /**
     * Provider is in a position to start delivery of the Service.
     * 
     */
    @XmlEnumValue("READY TO DELIVER")
    READY_TO_DELIVER("READY TO DELIVER"),

    /**
     * OM is in a position to allow a DP to prepare the Service. Customer is entitled to receive the Service. This is typically a trigger for ORA to begin accounting process.
     * 
     */
    @XmlEnumValue("READY TO PROCEED")
    READY_TO_PROCEED("READY TO PROCEED"),

    /**
     * Service was deleted.
     * 
     */
    REMOVED("REMOVED"),

    /**
     * Delivery of the Service is suspended as a result of an Airline decision.  Can only revert back to the previous status. Exception is that Suspended may go to Removed.  This status may be used in case of fraud detection.
     * 
     */
    SUSPENDED("SUSPENDED"),

    /**
     * It is not possible for the DP to deliver a Service. This could be for reasons of availability, legal or regulatory constraint.
     * 
     */
    @XmlEnumValue("UNABLE TO DELIVER")
    UNABLE_TO_DELIVER("UNABLE TO DELIVER");
    private final String value;

    ServiceDeliveryStatusCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceDeliveryStatusCodeContentType fromValue(String v) {
        for (ServiceDeliveryStatusCodeContentType c: ServiceDeliveryStatusCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
