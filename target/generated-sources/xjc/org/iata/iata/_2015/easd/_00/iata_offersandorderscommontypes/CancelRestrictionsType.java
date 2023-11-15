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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * These are a set of qualifying conditions/rules/restrictions that are related to a constrained priced grouping of services for the Cancellation action.
 * 
 * <p>Java class for CancelRestrictionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelRestrictionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowedModificationInd" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}IndType" minOccurs="0"/&gt;
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}TextType" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDateTime" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDateTime" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="Fee" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ChangeOrCancelFeeType" minOccurs="0"/&gt;
 *         &lt;element name="JourneyStageCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}JourneyStageTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="Refund" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}RefundType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelRestrictionsType", propOrder = {
    "allowedModificationInd",
    "descText",
    "effectiveDateTime",
    "expirationDateTime",
    "fee",
    "journeyStageCode",
    "paxRefID",
    "refund"
})
public class CancelRestrictionsType {

    @XmlElement(name = "AllowedModificationInd")
    protected Boolean allowedModificationInd;
    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "EffectiveDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDateTime;
    @XmlElement(name = "ExpirationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDateTime;
    @XmlElement(name = "Fee")
    protected ChangeOrCancelFeeType fee;
    @XmlElement(name = "JourneyStageCode")
    @XmlSchemaType(name = "token")
    protected JourneyStageTypeCodeContentType journeyStageCode;
    @XmlElement(name = "PaxRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxRefID;
    @XmlElement(name = "Refund")
    protected RefundType refund;

    /**
     * Gets the value of the allowedModificationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowedModificationInd() {
        return allowedModificationInd;
    }

    /**
     * Sets the value of the allowedModificationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowedModificationInd(Boolean value) {
        this.allowedModificationInd = value;
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
     * Gets the value of the effectiveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * Sets the value of the effectiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDateTime(XMLGregorianCalendar value) {
        this.effectiveDateTime = value;
    }

    /**
     * Gets the value of the expirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDateTime() {
        return expirationDateTime;
    }

    /**
     * Sets the value of the expirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDateTime(XMLGregorianCalendar value) {
        this.expirationDateTime = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeOrCancelFeeType }
     *     
     */
    public ChangeOrCancelFeeType getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeOrCancelFeeType }
     *     
     */
    public void setFee(ChangeOrCancelFeeType value) {
        this.fee = value;
    }

    /**
     * Gets the value of the journeyStageCode property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyStageTypeCodeContentType }
     *     
     */
    public JourneyStageTypeCodeContentType getJourneyStageCode() {
        return journeyStageCode;
    }

    /**
     * Sets the value of the journeyStageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyStageTypeCodeContentType }
     *     
     */
    public void setJourneyStageCode(JourneyStageTypeCodeContentType value) {
        this.journeyStageCode = value;
    }

    /**
     * Gets the value of the paxRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxRefID() {
        return paxRefID;
    }

    /**
     * Sets the value of the paxRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxRefID(String value) {
        this.paxRefID = value;
    }

    /**
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link RefundType }
     *     
     */
    public RefundType getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundType }
     *     
     */
    public void setRefund(RefundType value) {
        this.refund = value;
    }

}
