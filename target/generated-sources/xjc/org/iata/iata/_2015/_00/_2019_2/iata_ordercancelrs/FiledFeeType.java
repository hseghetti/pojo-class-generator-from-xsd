//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_ordercancelrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Filed fee information relating to a coupon, including the Bankers Seller Rate used to convert the filed amount into the currency of payment.
 * 
 * <p>Java class for FiledFeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FiledFeeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BankersSellerRate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}RateType"/&gt;
 *         &lt;element name="FeeAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}AmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiledFeeType", propOrder = {
    "bankersSellerRate",
    "feeAmount"
})
public class FiledFeeType {

    @XmlElement(name = "BankersSellerRate", required = true)
    protected RateType bankersSellerRate;
    @XmlElement(name = "FeeAmount", required = true)
    protected AmountType feeAmount;

    /**
     * Gets the value of the bankersSellerRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getBankersSellerRate() {
        return bankersSellerRate;
    }

    /**
     * Sets the value of the bankersSellerRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setBankersSellerRate(RateType value) {
        this.bankersSellerRate = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFeeAmount(AmountType value) {
        this.feeAmount = value;
    }

}