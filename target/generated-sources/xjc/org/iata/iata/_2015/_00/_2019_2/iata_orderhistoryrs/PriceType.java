//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderhistoryrs;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for PriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="BaseAmountGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="CurConversion" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}CurConversionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Discount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}DiscountType" minOccurs="0"/&gt;
 *         &lt;element name="EquivAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="Fee" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}FeeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyUnitAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyUnitName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}NameType" minOccurs="0"/&gt;
 *         &lt;element name="Markup" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}MarkupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Surcharge" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}SurchargeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxSummary" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}TaxSummaryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}AmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceType", propOrder = {
    "baseAmount",
    "baseAmountGuaranteeTimeLimitDateTime",
    "curConversion",
    "discount",
    "equivAmount",
    "fee",
    "loyaltyUnitAmount",
    "loyaltyUnitName",
    "markup",
    "surcharge",
    "taxSummary",
    "totalAmount"
})
public class PriceType {

    @XmlElement(name = "BaseAmount")
    protected AmountType baseAmount;
    @XmlElement(name = "BaseAmountGuaranteeTimeLimitDateTime")
    protected DateTimeType baseAmountGuaranteeTimeLimitDateTime;
    @XmlElement(name = "CurConversion")
    protected List<CurConversionType> curConversion;
    @XmlElement(name = "Discount")
    protected DiscountType discount;
    @XmlElement(name = "EquivAmount")
    protected AmountType equivAmount;
    @XmlElement(name = "Fee")
    protected List<FeeType> fee;
    @XmlElement(name = "LoyaltyUnitAmount")
    protected AmountType loyaltyUnitAmount;
    @XmlElement(name = "LoyaltyUnitName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String loyaltyUnitName;
    @XmlElement(name = "Markup")
    protected List<MarkupType> markup;
    @XmlElement(name = "Surcharge")
    protected List<SurchargeType> surcharge;
    @XmlElement(name = "TaxSummary")
    protected List<TaxSummaryType> taxSummary;
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
     * Gets the value of the curConversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curConversion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurConversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurConversionType }
     * 
     * 
     */
    public List<CurConversionType> getCurConversion() {
        if (curConversion == null) {
            curConversion = new ArrayList<CurConversionType>();
        }
        return this.curConversion;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountType }
     *     
     */
    public DiscountType getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountType }
     *     
     */
    public void setDiscount(DiscountType value) {
        this.discount = value;
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
     * Gets the value of the fee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeType }
     * 
     * 
     */
    public List<FeeType> getFee() {
        if (fee == null) {
            fee = new ArrayList<FeeType>();
        }
        return this.fee;
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
     * Gets the value of the markup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkupType }
     * 
     * 
     */
    public List<MarkupType> getMarkup() {
        if (markup == null) {
            markup = new ArrayList<MarkupType>();
        }
        return this.markup;
    }

    /**
     * Gets the value of the surcharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surcharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurcharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurchargeType }
     * 
     * 
     */
    public List<SurchargeType> getSurcharge() {
        if (surcharge == null) {
            surcharge = new ArrayList<SurchargeType>();
        }
        return this.surcharge;
    }

    /**
     * Gets the value of the taxSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxSummaryType }
     * 
     * 
     */
    public List<TaxSummaryType> getTaxSummary() {
        if (taxSummary == null) {
            taxSummary = new ArrayList<TaxSummaryType>();
        }
        return this.taxSummary;
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
