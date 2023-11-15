//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_servicedeliverynotifrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Information related to the settlement of a transaction through monetary or other compensations. For example, a payment may be applied to an entire Order or individual Order Items.
 * 
 * <p>Java class for PaymentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactInfoRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}DescType" minOccurs="0"/&gt;
 *         &lt;element name="OrderItemRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}ID_Type"/&gt;
 *         &lt;element name="PaymentStatusCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}PaymentStatusCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInfoType", propOrder = {
    "contactInfoRefID",
    "desc",
    "orderItemRefID",
    "paymentStatusCode"
})
public class PaymentInfoType {

    @XmlElement(name = "ContactInfoRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String contactInfoRefID;
    @XmlElement(name = "Desc")
    protected DescType desc;
    @XmlElement(name = "OrderItemRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderItemRefID;
    @XmlElement(name = "PaymentStatusCode")
    @XmlSchemaType(name = "token")
    protected PaymentStatusCodeContentType paymentStatusCode;

    /**
     * Gets the value of the contactInfoRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInfoRefID() {
        return contactInfoRefID;
    }

    /**
     * Sets the value of the contactInfoRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInfoRefID(String value) {
        this.contactInfoRefID = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link DescType }
     *     
     */
    public DescType getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescType }
     *     
     */
    public void setDesc(DescType value) {
        this.desc = value;
    }

    /**
     * Gets the value of the orderItemRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemRefID() {
        return orderItemRefID;
    }

    /**
     * Sets the value of the orderItemRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderItemRefID(String value) {
        this.orderItemRefID = value;
    }

    /**
     * Gets the value of the paymentStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusCodeContentType }
     *     
     */
    public PaymentStatusCodeContentType getPaymentStatusCode() {
        return paymentStatusCode;
    }

    /**
     * Sets the value of the paymentStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusCodeContentType }
     *     
     */
    public void setPaymentStatusCode(PaymentStatusCodeContentType value) {
        this.paymentStatusCode = value;
    }

}