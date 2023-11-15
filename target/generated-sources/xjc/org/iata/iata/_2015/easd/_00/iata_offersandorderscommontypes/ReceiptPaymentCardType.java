//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015.easd._00.iata_offersandorderscommontypes;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A specialization of Payment Card as part of the summary of a processed payment, defined as a device that enables its owner (the cardholder) to make a payment by electronic funds transfer.
 * 
 * <p>Java class for ReceiptPaymentCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptPaymentCardType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardBrandCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CreditCardVendorCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CardholderAddress" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PostalAddressType" minOccurs="0"/&gt;
 *         &lt;element name="CardHolderName" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}NameType" minOccurs="0"/&gt;
 *         &lt;element name="CardIssuerName" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ProperNameType" minOccurs="0"/&gt;
 *         &lt;element name="CardIssuingCountryCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CardNumber" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaymentCardNumberType" minOccurs="0"/&gt;
 *         &lt;element name="CardProductTypeCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="CardSecurityCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="CardSeqNumber" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="CardTypeText" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}TextType" minOccurs="0"/&gt;
 *         &lt;element name="CryptographyKey" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CryptographyKeyType" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PayCardDateTextType" minOccurs="0"/&gt;
 *         &lt;element name="EncryptedData" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}EncryptedDataType" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDate" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PayCardDateTextType" minOccurs="0"/&gt;
 *         &lt;element name="MaskedCardID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}MaskedCardID_Type" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInstrumentOwnershipCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}OwnershipTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ProtectedCardID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReconciliationID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecurePaymentAuthenticationInstructionsVersion1" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SecurePaymentAuthenticationInstructionsVersion1Type" minOccurs="0"/&gt;
 *         &lt;element name="SecurePaymentAuthenticationInstructionsVersion2" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SecurePaymentAuthenticationInstructionsVersion2Type" minOccurs="0"/&gt;
 *         &lt;element name="SecurePaymentVersion1" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SecurePaymentVersion1Type" minOccurs="0"/&gt;
 *         &lt;element name="SecurePaymentVersion2" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SecurePaymentVersion2Type" minOccurs="0"/&gt;
 *         &lt;element name="SecureProgram" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SecureProgramType" minOccurs="0"/&gt;
 *         &lt;element name="TokenizedCardID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ID_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptPaymentCardType", propOrder = {
    "cardBrandCode",
    "cardholderAddress",
    "cardHolderName",
    "cardIssuerName",
    "cardIssuingCountryCode",
    "cardNumber",
    "cardProductTypeCode",
    "cardSecurityCode",
    "cardSeqNumber",
    "cardTypeText",
    "cryptographyKey",
    "effectiveDate",
    "encryptedData",
    "expirationDate",
    "maskedCardID",
    "paymentInstrumentOwnershipCode",
    "protectedCardID",
    "reconciliationID",
    "securePaymentAuthenticationInstructionsVersion1",
    "securePaymentAuthenticationInstructionsVersion2",
    "securePaymentVersion1",
    "securePaymentVersion2",
    "secureProgram",
    "tokenizedCardID"
})
public class ReceiptPaymentCardType {

    @XmlElement(name = "CardBrandCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardBrandCode;
    @XmlElement(name = "CardholderAddress")
    protected PostalAddressType cardholderAddress;
    @XmlElement(name = "CardHolderName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardHolderName;
    @XmlElement(name = "CardIssuerName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardIssuerName;
    @XmlElement(name = "CardIssuingCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardIssuingCountryCode;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "CardProductTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardProductTypeCode;
    @XmlElement(name = "CardSecurityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardSecurityCode;
    @XmlElement(name = "CardSeqNumber")
    protected BigDecimal cardSeqNumber;
    @XmlElement(name = "CardTypeText")
    protected String cardTypeText;
    @XmlElement(name = "CryptographyKey")
    protected CryptographyKeyType cryptographyKey;
    @XmlElement(name = "EffectiveDate")
    protected String effectiveDate;
    @XmlElement(name = "EncryptedData")
    protected EncryptedDataType encryptedData;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "MaskedCardID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String maskedCardID;
    @XmlElement(name = "PaymentInstrumentOwnershipCode")
    @XmlSchemaType(name = "token")
    protected OwnershipTypeCodeContentType paymentInstrumentOwnershipCode;
    @XmlElement(name = "ProtectedCardID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String protectedCardID;
    @XmlElement(name = "ReconciliationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reconciliationID;
    @XmlElement(name = "SecurePaymentAuthenticationInstructionsVersion1")
    protected SecurePaymentAuthenticationInstructionsVersion1Type securePaymentAuthenticationInstructionsVersion1;
    @XmlElement(name = "SecurePaymentAuthenticationInstructionsVersion2")
    protected SecurePaymentAuthenticationInstructionsVersion2Type securePaymentAuthenticationInstructionsVersion2;
    @XmlElement(name = "SecurePaymentVersion1")
    protected SecurePaymentVersion1Type securePaymentVersion1;
    @XmlElement(name = "SecurePaymentVersion2")
    protected SecurePaymentVersion2Type securePaymentVersion2;
    @XmlElement(name = "SecureProgram")
    protected SecureProgramType secureProgram;
    @XmlElement(name = "TokenizedCardID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tokenizedCardID;

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
     * Gets the value of the cardholderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressType }
     *     
     */
    public PostalAddressType getCardholderAddress() {
        return cardholderAddress;
    }

    /**
     * Sets the value of the cardholderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressType }
     *     
     */
    public void setCardholderAddress(PostalAddressType value) {
        this.cardholderAddress = value;
    }

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the cardIssuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssuerName() {
        return cardIssuerName;
    }

    /**
     * Sets the value of the cardIssuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssuerName(String value) {
        this.cardIssuerName = value;
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
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
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
     * Gets the value of the cardSecurityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSecurityCode() {
        return cardSecurityCode;
    }

    /**
     * Sets the value of the cardSecurityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSecurityCode(String value) {
        this.cardSecurityCode = value;
    }

    /**
     * Gets the value of the cardSeqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCardSeqNumber() {
        return cardSeqNumber;
    }

    /**
     * Sets the value of the cardSeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCardSeqNumber(BigDecimal value) {
        this.cardSeqNumber = value;
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
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the encryptedData property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedDataType }
     *     
     */
    public EncryptedDataType getEncryptedData() {
        return encryptedData;
    }

    /**
     * Sets the value of the encryptedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedDataType }
     *     
     */
    public void setEncryptedData(EncryptedDataType value) {
        this.encryptedData = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the maskedCardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedCardID() {
        return maskedCardID;
    }

    /**
     * Sets the value of the maskedCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedCardID(String value) {
        this.maskedCardID = value;
    }

    /**
     * Gets the value of the paymentInstrumentOwnershipCode property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipTypeCodeContentType }
     *     
     */
    public OwnershipTypeCodeContentType getPaymentInstrumentOwnershipCode() {
        return paymentInstrumentOwnershipCode;
    }

    /**
     * Sets the value of the paymentInstrumentOwnershipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipTypeCodeContentType }
     *     
     */
    public void setPaymentInstrumentOwnershipCode(OwnershipTypeCodeContentType value) {
        this.paymentInstrumentOwnershipCode = value;
    }

    /**
     * Gets the value of the protectedCardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedCardID() {
        return protectedCardID;
    }

    /**
     * Sets the value of the protectedCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedCardID(String value) {
        this.protectedCardID = value;
    }

    /**
     * Gets the value of the reconciliationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationID() {
        return reconciliationID;
    }

    /**
     * Sets the value of the reconciliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationID(String value) {
        this.reconciliationID = value;
    }

    /**
     * Gets the value of the securePaymentAuthenticationInstructionsVersion1 property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentAuthenticationInstructionsVersion1Type }
     *     
     */
    public SecurePaymentAuthenticationInstructionsVersion1Type getSecurePaymentAuthenticationInstructionsVersion1() {
        return securePaymentAuthenticationInstructionsVersion1;
    }

    /**
     * Sets the value of the securePaymentAuthenticationInstructionsVersion1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentAuthenticationInstructionsVersion1Type }
     *     
     */
    public void setSecurePaymentAuthenticationInstructionsVersion1(SecurePaymentAuthenticationInstructionsVersion1Type value) {
        this.securePaymentAuthenticationInstructionsVersion1 = value;
    }

    /**
     * Gets the value of the securePaymentAuthenticationInstructionsVersion2 property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentAuthenticationInstructionsVersion2Type }
     *     
     */
    public SecurePaymentAuthenticationInstructionsVersion2Type getSecurePaymentAuthenticationInstructionsVersion2() {
        return securePaymentAuthenticationInstructionsVersion2;
    }

    /**
     * Sets the value of the securePaymentAuthenticationInstructionsVersion2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentAuthenticationInstructionsVersion2Type }
     *     
     */
    public void setSecurePaymentAuthenticationInstructionsVersion2(SecurePaymentAuthenticationInstructionsVersion2Type value) {
        this.securePaymentAuthenticationInstructionsVersion2 = value;
    }

    /**
     * Gets the value of the securePaymentVersion1 property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentVersion1Type }
     *     
     */
    public SecurePaymentVersion1Type getSecurePaymentVersion1() {
        return securePaymentVersion1;
    }

    /**
     * Sets the value of the securePaymentVersion1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentVersion1Type }
     *     
     */
    public void setSecurePaymentVersion1(SecurePaymentVersion1Type value) {
        this.securePaymentVersion1 = value;
    }

    /**
     * Gets the value of the securePaymentVersion2 property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentVersion2Type }
     *     
     */
    public SecurePaymentVersion2Type getSecurePaymentVersion2() {
        return securePaymentVersion2;
    }

    /**
     * Sets the value of the securePaymentVersion2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentVersion2Type }
     *     
     */
    public void setSecurePaymentVersion2(SecurePaymentVersion2Type value) {
        this.securePaymentVersion2 = value;
    }

    /**
     * Gets the value of the secureProgram property.
     * 
     * @return
     *     possible object is
     *     {@link SecureProgramType }
     *     
     */
    public SecureProgramType getSecureProgram() {
        return secureProgram;
    }

    /**
     * Sets the value of the secureProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecureProgramType }
     *     
     */
    public void setSecureProgram(SecureProgramType value) {
        this.secureProgram = value;
    }

    /**
     * Gets the value of the tokenizedCardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenizedCardID() {
        return tokenizedCardID;
    }

    /**
     * Sets the value of the tokenizedCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenizedCardID(String value) {
        this.tokenizedCardID = value;
    }

}