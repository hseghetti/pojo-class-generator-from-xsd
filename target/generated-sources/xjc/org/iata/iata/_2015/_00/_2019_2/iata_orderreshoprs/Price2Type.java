//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderreshoprs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The amount of money expected, required, or given in payment for something.
 * 
 * <p>Java class for Price2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Price2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRS}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="BaseAmountGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="EquivAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRS}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyUnitAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRS}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyUnitName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRS}NameType" minOccurs="0"/&gt;
 *         &lt;element name="MaskedInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRS}IndType" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRS}AmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price2Type", propOrder = {
    "baseAmount",
    "baseAmountGuaranteeTimeLimitDateTime",
    "equivAmount",
    "loyaltyUnitAmount",
    "loyaltyUnitName",
    "maskedInd",
    "totalAmount"
})
public class Price2Type {

    @XmlElement(name = "BaseAmount")
    protected AmountType baseAmount;
    @XmlElement(name = "BaseAmountGuaranteeTimeLimitDateTime")
    protected DateTimeType baseAmountGuaranteeTimeLimitDateTime;
    @XmlElement(name = "EquivAmount")
    protected AmountType equivAmount;
    @XmlElement(name = "LoyaltyUnitAmount")
    protected AmountType loyaltyUnitAmount;
    @XmlElement(name = "LoyaltyUnitName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String loyaltyUnitName;
    @XmlElement(name = "MaskedInd")
    protected Boolean maskedInd;
    @XmlElement(name = "TotalAmount")
    protected AmountType totalAmount;

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBaseAmount(AmountType value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the baseAmountGuaranteeTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getBaseAmountGuaranteeTimeLimitDateTime() {
        return baseAmountGuaranteeTimeLimitDateTime;
    }

    /**
     * Sets the value of the baseAmountGuaranteeTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setBaseAmountGuaranteeTimeLimitDateTime(DateTimeType value) {
        this.baseAmountGuaranteeTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the equivAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEquivAmount() {
        return equivAmount;
    }

    /**
     * Sets the value of the equivAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEquivAmount(AmountType value) {
        this.equivAmount = value;
    }

    /**
     * Gets the value of the loyaltyUnitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoyaltyUnitAmount() {
        return loyaltyUnitAmount;
    }

    /**
     * Sets the value of the loyaltyUnitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoyaltyUnitAmount(AmountType value) {
        this.loyaltyUnitAmount = value;
    }

    /**
     * Gets the value of the loyaltyUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyUnitName() {
        return loyaltyUnitName;
    }

    /**
     * Sets the value of the loyaltyUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyUnitName(String value) {
        this.loyaltyUnitName = value;
    }

    /**
     * Gets the value of the maskedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaskedInd() {
        return maskedInd;
    }

    /**
     * Sets the value of the maskedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaskedInd(Boolean value) {
        this.maskedInd = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAmount(AmountType value) {
        this.totalAmount = value;
    }

}
