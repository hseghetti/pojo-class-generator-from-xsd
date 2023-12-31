//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_ordersalesinfoaccountingdocnotifrq;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Deduction from the price amount, made in advance of its payment.
 * 
 * <p>Java class for DiscountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AppText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInfoAccountingDocNotifRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInfoAccountingDocNotifRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="DiscountAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInfoAccountingDocNotifRQ}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPercent" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInfoAccountingDocNotifRQ}PercentType" minOccurs="0"/&gt;
 *         &lt;element name="PreDiscountedAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInfoAccountingDocNotifRQ}AmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountType", propOrder = {
    "appText",
    "descText",
    "discountAmount",
    "discountPercent",
    "preDiscountedAmount"
})
public class DiscountType {

    @XmlElement(name = "AppText")
    protected String appText;
    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "DiscountAmount")
    protected AmountType discountAmount;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElement(name = "PreDiscountedAmount")
    protected AmountType preDiscountedAmount;

    /**
     * Gets the value of the appText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppText() {
        return appText;
    }

    /**
     * Sets the value of the appText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppText(String value) {
        this.appText = value;
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
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDiscountAmount(AmountType value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the preDiscountedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPreDiscountedAmount() {
        return preDiscountedAmount;
    }

    /**
     * Sets the value of the preDiscountedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPreDiscountedAmount(AmountType value) {
        this.preDiscountedAmount = value;
    }

}
