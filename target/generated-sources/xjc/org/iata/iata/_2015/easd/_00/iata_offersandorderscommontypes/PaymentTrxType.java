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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Additional identification and URLs used to further describe a secure payment transaction.
 * 
 * <p>Java class for PaymentTrxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTrxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}TextType" minOccurs="0"/&gt;
 *         &lt;element name="InputCurCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CurCodeType" minOccurs="0"/&gt;
 *         &lt;element name="MaximumTryInd" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}IndType" minOccurs="0"/&gt;
 *         &lt;element name="NotProcessedInd" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}IndType" minOccurs="0"/&gt;
 *         &lt;element name="OriginalID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAddressVerification" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaymentAddressVerificationType" minOccurs="0"/&gt;
 *         &lt;element name="RetryInd" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}IndType" minOccurs="0"/&gt;
 *         &lt;element name="SettlementCurCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CurCodeType" minOccurs="0"/&gt;
 *         &lt;element name="TimestampDateTime" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="TrxDataText" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}TextType" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="TrxID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrxTypeText" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}TextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTrxType", propOrder = {
    "descText",
    "inputCurCode",
    "maximumTryInd",
    "notProcessedInd",
    "originalID",
    "paymentAddressVerification",
    "retryInd",
    "settlementCurCode",
    "timestampDateTime",
    "trxDataText",
    "trxID",
    "trxTypeText"
})
public class PaymentTrxType {

    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "InputCurCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String inputCurCode;
    @XmlElement(name = "MaximumTryInd")
    protected Boolean maximumTryInd;
    @XmlElement(name = "NotProcessedInd")
    protected Boolean notProcessedInd;
    @XmlElement(name = "OriginalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originalID;
    @XmlElement(name = "PaymentAddressVerification")
    protected PaymentAddressVerificationType paymentAddressVerification;
    @XmlElement(name = "RetryInd")
    protected Boolean retryInd;
    @XmlElement(name = "SettlementCurCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String settlementCurCode;
    @XmlElement(name = "TimestampDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestampDateTime;
    @XmlElement(name = "TrxDataText")
    protected List<String> trxDataText;
    @XmlElement(name = "TrxID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String trxID;
    @XmlElement(name = "TrxTypeText")
    protected String trxTypeText;

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
     * Gets the value of the inputCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputCurCode() {
        return inputCurCode;
    }

    /**
     * Sets the value of the inputCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputCurCode(String value) {
        this.inputCurCode = value;
    }

    /**
     * Gets the value of the maximumTryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumTryInd() {
        return maximumTryInd;
    }

    /**
     * Sets the value of the maximumTryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumTryInd(Boolean value) {
        this.maximumTryInd = value;
    }

    /**
     * Gets the value of the notProcessedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotProcessedInd() {
        return notProcessedInd;
    }

    /**
     * Sets the value of the notProcessedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotProcessedInd(Boolean value) {
        this.notProcessedInd = value;
    }

    /**
     * Gets the value of the originalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalID() {
        return originalID;
    }

    /**
     * Sets the value of the originalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalID(String value) {
        this.originalID = value;
    }

    /**
     * Gets the value of the paymentAddressVerification property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAddressVerificationType }
     *     
     */
    public PaymentAddressVerificationType getPaymentAddressVerification() {
        return paymentAddressVerification;
    }

    /**
     * Sets the value of the paymentAddressVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAddressVerificationType }
     *     
     */
    public void setPaymentAddressVerification(PaymentAddressVerificationType value) {
        this.paymentAddressVerification = value;
    }

    /**
     * Gets the value of the retryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetryInd() {
        return retryInd;
    }

    /**
     * Sets the value of the retryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetryInd(Boolean value) {
        this.retryInd = value;
    }

    /**
     * Gets the value of the settlementCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementCurCode() {
        return settlementCurCode;
    }

    /**
     * Sets the value of the settlementCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementCurCode(String value) {
        this.settlementCurCode = value;
    }

    /**
     * Gets the value of the timestampDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestampDateTime() {
        return timestampDateTime;
    }

    /**
     * Sets the value of the timestampDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestampDateTime(XMLGregorianCalendar value) {
        this.timestampDateTime = value;
    }

    /**
     * Gets the value of the trxDataText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trxDataText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrxDataText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTrxDataText() {
        if (trxDataText == null) {
            trxDataText = new ArrayList<String>();
        }
        return this.trxDataText;
    }

    /**
     * Gets the value of the trxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxID() {
        return trxID;
    }

    /**
     * Sets the value of the trxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxID(String value) {
        this.trxID = value;
    }

    /**
     * Gets the value of the trxTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxTypeText() {
        return trxTypeText;
    }

    /**
     * Sets the value of the trxTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxTypeText(String value) {
        this.trxTypeText = value;
    }

}
