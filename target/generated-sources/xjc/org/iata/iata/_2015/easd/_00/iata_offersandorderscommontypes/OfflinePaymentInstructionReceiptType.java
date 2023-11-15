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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Contains instructions from the Airline relating to payment using other payment capabilities 'offline' from EASD data exchange. For example, by use of an airline payment gateway.
 * 
 * <p>Java class for OfflinePaymentInstructionReceiptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflinePaymentInstructionReceiptType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentBrandCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CreditCardVendorCodeType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentGatewayURI" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}URI_Type" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTypeCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaymentMethodCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflinePaymentInstructionReceiptType", propOrder = {
    "paymentBrandCode",
    "paymentGatewayURI",
    "paymentTypeCode"
})
public class OfflinePaymentInstructionReceiptType {

    @XmlElement(name = "PaymentBrandCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentBrandCode;
    @XmlElement(name = "PaymentGatewayURI")
    @XmlSchemaType(name = "anyURI")
    protected String paymentGatewayURI;
    @XmlElement(name = "PaymentTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentTypeCode;

    /**
     * Gets the value of the paymentBrandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentBrandCode() {
        return paymentBrandCode;
    }

    /**
     * Sets the value of the paymentBrandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentBrandCode(String value) {
        this.paymentBrandCode = value;
    }

    /**
     * Gets the value of the paymentGatewayURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentGatewayURI() {
        return paymentGatewayURI;
    }

    /**
     * Sets the value of the paymentGatewayURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentGatewayURI(String value) {
        this.paymentGatewayURI = value;
    }

    /**
     * Gets the value of the paymentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /**
     * Sets the value of the paymentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeCode(String value) {
        this.paymentTypeCode = value;
    }

}
