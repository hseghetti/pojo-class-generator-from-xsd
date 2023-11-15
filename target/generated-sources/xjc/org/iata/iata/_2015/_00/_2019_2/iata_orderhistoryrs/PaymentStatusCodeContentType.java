//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderhistoryrs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentStatusCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentStatusCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACCEPTED"/&gt;
 *     &lt;enumeration value="ALLOCATED"/&gt;
 *     &lt;enumeration value="CLOSED"/&gt;
 *     &lt;enumeration value="COMMITTED"/&gt;
 *     &lt;enumeration value="RECEIVED"/&gt;
 *     &lt;enumeration value="REFUNDED"/&gt;
 *     &lt;enumeration value="SENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentStatusCodeContentType")
@XmlEnum
public enum PaymentStatusCodeContentType {


    /**
     * The commitments to pay was accepted./At the Payment Level to indicate that a payment has been authorized, etc. or the status in not needed
     * 
     */
    ACCEPTED,

    /**
     * The value of compensation was allocated to the corresponding Order Item.
     * 
     */
    ALLOCATED,

    /**
     * The payment process was done.
     * 
     */
    CLOSED,

    /**
     * The payer has committed to pay the compensation./When NDC indicates that part of a payment is to be applied to an order item
     * 
     */
    COMMITTED,

    /**
     * The compensation was received./ The actual receipt of funds is a function of the accounting system, or it it expected that the revenue accounting system will update the order when the bank transmits funds to the airline? Don't think we need this.
     * 
     */
    RECEIVED,

    /**
     * The compensation was transfered back to the payer./When an order item is cancelled or changed, we expect that any payments applied to the item will be un-applied. this leaves a credit balance on the order that can be applied to a new item of refunded.
     * 
     */
    REFUNDED,

    /**
     * The compensation was transfered.
     * 
     */
    SENT;

    public String value() {
        return name();
    }

    public static PaymentStatusCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
