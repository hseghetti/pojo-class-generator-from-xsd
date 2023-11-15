//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_seatavailabilityrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * This node is used to indicate by when payment commitment must be received for confirmed Order Item in an Order.  To indicate instant payment, the duration field should be populated with a value of 0.  If no value is returned, then no advice has been given.
 * 
 * <p>Java class for PaymentTimeLimitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTimeLimitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_SeatAvailabilityRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTimeLimitDuration" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_SeatAvailabilityRS}DurationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTimeLimitType", propOrder = {
    "paymentTimeLimitDateTime",
    "paymentTimeLimitDuration"
})
public class PaymentTimeLimitType {

    @XmlElement(name = "PaymentTimeLimitDateTime")
    protected DateTimeType paymentTimeLimitDateTime;
    @XmlElement(name = "PaymentTimeLimitDuration")
    protected Duration paymentTimeLimitDuration;

    /**
     * Gets the value of the paymentTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPaymentTimeLimitDateTime() {
        return paymentTimeLimitDateTime;
    }

    /**
     * Sets the value of the paymentTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setPaymentTimeLimitDateTime(DateTimeType value) {
        this.paymentTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the paymentTimeLimitDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPaymentTimeLimitDuration() {
        return paymentTimeLimitDuration;
    }

    /**
     * Sets the value of the paymentTimeLimitDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPaymentTimeLimitDuration(Duration value) {
        this.paymentTimeLimitDuration = value;
    }

}
