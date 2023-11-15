//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015.easd._00.iata_offersandorderscommontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Party committing to pay. In the case of a Credit or Debit Card this would be the Cardholder.
 * 
 * <p>Java class for PayerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayerEmailAddress" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}EmailAddressType" minOccurs="0"/&gt;
 *         &lt;element name="PayerName" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PayerNameType" minOccurs="0"/&gt;
 *         &lt;element name="PayerPhoneNumber" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PhoneType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAddress" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaymentAddressType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerType", propOrder = {
    "payerEmailAddress",
    "payerName",
    "payerPhoneNumber",
    "paymentAddress"
})
public class PayerType {

    @XmlElement(name = "PayerEmailAddress")
    protected EmailAddressType payerEmailAddress;
    @XmlElement(name = "PayerName")
    protected PayerNameType payerName;
    @XmlElement(name = "PayerPhoneNumber")
    protected PhoneType payerPhoneNumber;
    @XmlElement(name = "PaymentAddress")
    protected PaymentAddressType paymentAddress;

    /**
     * Gets the value of the payerEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressType }
     *     
     */
    public EmailAddressType getPayerEmailAddress() {
        return payerEmailAddress;
    }

    /**
     * Sets the value of the payerEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressType }
     *     
     */
    public void setPayerEmailAddress(EmailAddressType value) {
        this.payerEmailAddress = value;
    }

    /**
     * Gets the value of the payerName property.
     * 
     * @return
     *     possible object is
     *     {@link PayerNameType }
     *     
     */
    public PayerNameType getPayerName() {
        return payerName;
    }

    /**
     * Sets the value of the payerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerNameType }
     *     
     */
    public void setPayerName(PayerNameType value) {
        this.payerName = value;
    }

    /**
     * Gets the value of the payerPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneType }
     *     
     */
    public PhoneType getPayerPhoneNumber() {
        return payerPhoneNumber;
    }

    /**
     * Sets the value of the payerPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *     
     */
    public void setPayerPhoneNumber(PhoneType value) {
        this.payerPhoneNumber = value;
    }

    /**
     * Gets the value of the paymentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAddressType }
     *     
     */
    public PaymentAddressType getPaymentAddress() {
        return paymentAddress;
    }

    /**
     * Sets the value of the paymentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAddressType }
     *     
     */
    public void setPaymentAddress(PaymentAddressType value) {
        this.paymentAddress = value;
    }

}
