//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_offerpricers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A device that enables its owner (the cardholder) to make a payment by electronic funds transfer.
 * 
 * <p>Java class for PaymentCard2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCard2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardBrandCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CreditCardVendorCodeType"/&gt;
 *         &lt;element name="CardIssuingCountryCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CardProductTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="CardTypeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="CryptographyKey" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CryptographyKeyType" minOccurs="0"/&gt;
 *         &lt;element name="SecurePayerAuthenticationVersion" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}SecurePayerAuthenticationVersionType" minOccurs="0"/&gt;
 *         &lt;element name="VerificationInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}IndType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCard2Type", propOrder = {
    "cardBrandCode",
    "cardIssuingCountryCode",
    "cardProductTypeCode",
    "cardTypeText",
    "cryptographyKey",
    "securePayerAuthenticationVersion",
    "verificationInd"
})
public class PaymentCard2Type {

    @XmlElement(name = "CardBrandCode", required = true)
    protected String cardBrandCode;
    @XmlElement(name = "CardIssuingCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardIssuingCountryCode;
    @XmlElement(name = "CardProductTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardProductTypeCode;
    @XmlElement(name = "CardTypeText")
    protected String cardTypeText;
    @XmlElement(name = "CryptographyKey")
    protected CryptographyKeyType cryptographyKey;
    @XmlElement(name = "SecurePayerAuthenticationVersion")
    protected SecurePayerAuthenticationVersionType securePayerAuthenticationVersion;
    @XmlElement(name = "VerificationInd")
    protected Boolean verificationInd;

    /**
     * Gets the value of the cardBrandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBrandCode() {
        return cardBrandCode;
    }

    /**
     * Sets the value of the cardBrandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBrandCode(String value) {
        this.cardBrandCode = value;
    }

    /**
     * Gets the value of the cardIssuingCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssuingCountryCode() {
        return cardIssuingCountryCode;
    }

    /**
     * Sets the value of the cardIssuingCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssuingCountryCode(String value) {
        this.cardIssuingCountryCode = value;
    }

    /**
     * Gets the value of the cardProductTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardProductTypeCode() {
        return cardProductTypeCode;
    }

    /**
     * Sets the value of the cardProductTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardProductTypeCode(String value) {
        this.cardProductTypeCode = value;
    }

    /**
     * Gets the value of the cardTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTypeText() {
        return cardTypeText;
    }

    /**
     * Sets the value of the cardTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTypeText(String value) {
        this.cardTypeText = value;
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
     * Gets the value of the securePayerAuthenticationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePayerAuthenticationVersionType }
     *     
     */
    public SecurePayerAuthenticationVersionType getSecurePayerAuthenticationVersion() {
        return securePayerAuthenticationVersion;
    }

    /**
     * Sets the value of the securePayerAuthenticationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePayerAuthenticationVersionType }
     *     
     */
    public void setSecurePayerAuthenticationVersion(SecurePayerAuthenticationVersionType value) {
        this.securePayerAuthenticationVersion = value;
    }

    /**
     * Gets the value of the verificationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerificationInd() {
        return verificationInd;
    }

    /**
     * Sets the value of the verificationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerificationInd(Boolean value) {
        this.verificationInd = value;
    }

}
