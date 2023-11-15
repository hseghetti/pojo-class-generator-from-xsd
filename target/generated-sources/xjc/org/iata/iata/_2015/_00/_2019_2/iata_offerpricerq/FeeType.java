//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_offerpricerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Amount added on to a charge for a specific product, purpose, or service.
 * 
 * <p>Java class for FeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AmountType"/&gt;
 *         &lt;element name="ApproximateInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="DesigText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CodesetValueTextType" minOccurs="0"/&gt;
 *         &lt;element name="GuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="LocalAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="RefundInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}IndType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeType", propOrder = {
    "amount",
    "approximateInd",
    "descText",
    "desigText",
    "guaranteeTimeLimitDateTime",
    "localAmount",
    "refundInd"
})
public class FeeType {

    @XmlElement(name = "Amount", required = true)
    protected AmountType amount;
    @XmlElement(name = "ApproximateInd")
    protected Boolean approximateInd;
    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "DesigText")
    protected String desigText;
    @XmlElement(name = "GuaranteeTimeLimitDateTime")
    protected DateTimeType guaranteeTimeLimitDateTime;
    @XmlElement(name = "LocalAmount")
    protected AmountType localAmount;
    @XmlElement(name = "RefundInd")
    protected Boolean refundInd;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the approximateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproximateInd() {
        return approximateInd;
    }

    /**
     * Sets the value of the approximateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproximateInd(Boolean value) {
        this.approximateInd = value;
    }

    /**
     * Gets the value of the descText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Gets the value of the desigText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesigText() {
        return desigText;
    }

    /**
     * Sets the value of the desigText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesigText(String value) {
        this.desigText = value;
    }

    /**
     * Gets the value of the guaranteeTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getGuaranteeTimeLimitDateTime() {
        return guaranteeTimeLimitDateTime;
    }

    /**
     * Sets the value of the guaranteeTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setGuaranteeTimeLimitDateTime(DateTimeType value) {
        this.guaranteeTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the localAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLocalAmount() {
        return localAmount;
    }

    /**
     * Sets the value of the localAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLocalAmount(AmountType value) {
        this.localAmount = value;
    }

    /**
     * Gets the value of the refundInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundInd() {
        return refundInd;
    }

    /**
     * Sets the value of the refundInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundInd(Boolean value) {
        this.refundInd = value;
    }

}
