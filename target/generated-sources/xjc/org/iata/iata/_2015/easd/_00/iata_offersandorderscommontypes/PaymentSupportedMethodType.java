//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015.easd._00.iata_offersandorderscommontypes;

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
 * Contains information relating to payment method acceptance. This always relates to the airlines payment acceptance terms regardless of preference expressed by a seller using PaymentCriteria.
 * 
 * <p>Java class for PaymentSupportedMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentSupportedMethodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClearanceMethods" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ClearanceMethodsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CryptographyKey" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CryptographyKeyType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentBrandCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaymentBrandCodeType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethodAddlInfo" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaymentMethodAddlInfoType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethodCountryCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentRedirectionInd" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}IndType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentSurcharge" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaymentSurchargeType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTypeCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaymentTypeCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSupportedMethodType", propOrder = {
    "clearanceMethods",
    "cryptographyKey",
    "paymentBrandCode",
    "paymentMethodAddlInfo",
    "paymentMethodCountryCode",
    "paymentRedirectionInd",
    "paymentSurcharge",
    "paymentTypeCode"
})
public class PaymentSupportedMethodType {

    @XmlElement(name = "ClearanceMethods")
    protected List<ClearanceMethodsType> clearanceMethods;
    @XmlElement(name = "CryptographyKey")
    protected CryptographyKeyType cryptographyKey;
    @XmlElement(name = "PaymentBrandCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentBrandCode;
    @XmlElement(name = "PaymentMethodAddlInfo")
    protected PaymentMethodAddlInfoType paymentMethodAddlInfo;
    @XmlElement(name = "PaymentMethodCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentMethodCountryCode;
    @XmlElement(name = "PaymentRedirectionInd")
    protected Boolean paymentRedirectionInd;
    @XmlElement(name = "PaymentSurcharge")
    protected PaymentSurchargeType paymentSurcharge;
    @XmlElement(name = "PaymentTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentTypeCode;

    /**
     * Gets the value of the clearanceMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clearanceMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClearanceMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClearanceMethodsType }
     * 
     * 
     */
    public List<ClearanceMethodsType> getClearanceMethods() {
        if (clearanceMethods == null) {
            clearanceMethods = new ArrayList<ClearanceMethodsType>();
        }
        return this.clearanceMethods;
    }

    /**
     * Gets the value of the cryptographyKey property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographyKeyType }
     *     
     */
    public CryptographyKeyType getCryptographyKey() {
        return cryptographyKey;
    }

    /**
     * Sets the value of the cryptographyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographyKeyType }
     *     
     */
    public void setCryptographyKey(CryptographyKeyType value) {
        this.cryptographyKey = value;
    }

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
     * Gets the value of the paymentMethodAddlInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodAddlInfoType }
     *     
     */
    public PaymentMethodAddlInfoType getPaymentMethodAddlInfo() {
        return paymentMethodAddlInfo;
    }

    /**
     * Sets the value of the paymentMethodAddlInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodAddlInfoType }
     *     
     */
    public void setPaymentMethodAddlInfo(PaymentMethodAddlInfoType value) {
        this.paymentMethodAddlInfo = value;
    }

    /**
     * Gets the value of the paymentMethodCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodCountryCode() {
        return paymentMethodCountryCode;
    }

    /**
     * Sets the value of the paymentMethodCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodCountryCode(String value) {
        this.paymentMethodCountryCode = value;
    }

    /**
     * Gets the value of the paymentRedirectionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentRedirectionInd() {
        return paymentRedirectionInd;
    }

    /**
     * Sets the value of the paymentRedirectionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentRedirectionInd(Boolean value) {
        this.paymentRedirectionInd = value;
    }

    /**
     * Gets the value of the paymentSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentSurchargeType }
     *     
     */
    public PaymentSurchargeType getPaymentSurcharge() {
        return paymentSurcharge;
    }

    /**
     * Sets the value of the paymentSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentSurchargeType }
     *     
     */
    public void setPaymentSurcharge(PaymentSurchargeType value) {
        this.paymentSurcharge = value;
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