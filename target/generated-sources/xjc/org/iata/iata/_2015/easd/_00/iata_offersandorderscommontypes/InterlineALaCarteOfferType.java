//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015.easd._00.iata_offersandorderscommontypes;

import java.math.BigDecimal;
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
 * A proposal to sell a specific set of products or Services under specific conditions, for a certain price. Can be the response to a shopping request. 
 *  Can be a regular Offer or an A La Carte Offer. A La Carte Offer is defined as a container for A La Carte Offer Items. This supports a shopping basket concept for non-flight services. The main purpose of this structure is to reduce the size of the messages by inserting Offer Items which are applicable to multiple flight-related Offers.
 *  NB. For the OfferID of the ALaCarteOffer: Default OfferID identifier for A La Carte Offer Items in a scenario where items here are not selected for a flight-related Offer above.
 *  Business Identifier Fields:
 *  - [Shopping Response] Shopping Response ID 
 *  - Offer ID
 *  - [Carrier] Airline Designator Code
 * 
 * <p>Java class for InterlineALaCarteOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterlineALaCarteOfferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaggageDisclosureRefID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CommissionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DescType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DisclosureRefID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="MatchAppText" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}TextType" minOccurs="0"/&gt;
 *         &lt;element name="MatchPercent" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PercentType" minOccurs="0"/&gt;
 *         &lt;element name="MatchTypeCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}MatchTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="OfferExpirationTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="OfferID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ID_Type"/&gt;
 *         &lt;element name="OfferItem" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ALaCarteOfferItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}AirlineDesigCodeType"/&gt;
 *         &lt;element name="PenaltyRefID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RedemptionInd" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}IndType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedDateInd" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}IndType" minOccurs="0"/&gt;
 *         &lt;element name="TotalPrice" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PriceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterlineALaCarteOfferType", propOrder = {
    "baggageDisclosureRefID",
    "commission",
    "desc",
    "disclosureRefID",
    "matchAppText",
    "matchPercent",
    "matchTypeCode",
    "offerExpirationTimeLimitDateTime",
    "offerID",
    "offerItem",
    "ownerCode",
    "penaltyRefID",
    "redemptionInd",
    "requestedDateInd",
    "totalPrice"
})
public class InterlineALaCarteOfferType {

    @XmlElement(name = "BaggageDisclosureRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> baggageDisclosureRefID;
    @XmlElement(name = "Commission")
    protected List<CommissionType> commission;
    @XmlElement(name = "Desc")
    protected List<DescType> desc;
    @XmlElement(name = "DisclosureRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String disclosureRefID;
    @XmlElement(name = "MatchAppText")
    protected String matchAppText;
    @XmlElement(name = "MatchPercent")
    protected BigDecimal matchPercent;
    @XmlElement(name = "MatchTypeCode")
    @XmlSchemaType(name = "token")
    protected MatchTypeCodeContentType matchTypeCode;
    @XmlElement(name = "OfferExpirationTimeLimitDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offerExpirationTimeLimitDateTime;
    @XmlElement(name = "OfferID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerID;
    @XmlElement(name = "OfferItem", required = true)
    protected List<ALaCarteOfferItemType> offerItem;
    @XmlElement(name = "OwnerCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    @XmlElement(name = "PenaltyRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> penaltyRefID;
    @XmlElement(name = "RedemptionInd")
    protected Boolean redemptionInd;
    @XmlElement(name = "RequestedDateInd")
    protected Boolean requestedDateInd;
    @XmlElement(name = "TotalPrice")
    protected PriceType totalPrice;

    /**
     * Gets the value of the baggageDisclosureRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageDisclosureRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageDisclosureRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBaggageDisclosureRefID() {
        if (baggageDisclosureRefID == null) {
            baggageDisclosureRefID = new ArrayList<String>();
        }
        return this.baggageDisclosureRefID;
    }

    /**
     * Gets the value of the commission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionType }
     * 
     * 
     */
    public List<CommissionType> getCommission() {
        if (commission == null) {
            commission = new ArrayList<CommissionType>();
        }
        return this.commission;
    }

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescType }
     * 
     * 
     */
    public List<DescType> getDesc() {
        if (desc == null) {
            desc = new ArrayList<DescType>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the disclosureRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosureRefID() {
        return disclosureRefID;
    }

    /**
     * Sets the value of the disclosureRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclosureRefID(String value) {
        this.disclosureRefID = value;
    }

    /**
     * Gets the value of the matchAppText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchAppText() {
        return matchAppText;
    }

    /**
     * Sets the value of the matchAppText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchAppText(String value) {
        this.matchAppText = value;
    }

    /**
     * Gets the value of the matchPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMatchPercent() {
        return matchPercent;
    }

    /**
     * Sets the value of the matchPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMatchPercent(BigDecimal value) {
        this.matchPercent = value;
    }

    /**
     * Gets the value of the matchTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link MatchTypeCodeContentType }
     *     
     */
    public MatchTypeCodeContentType getMatchTypeCode() {
        return matchTypeCode;
    }

    /**
     * Sets the value of the matchTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchTypeCodeContentType }
     *     
     */
    public void setMatchTypeCode(MatchTypeCodeContentType value) {
        this.matchTypeCode = value;
    }

    /**
     * Gets the value of the offerExpirationTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOfferExpirationTimeLimitDateTime() {
        return offerExpirationTimeLimitDateTime;
    }

    /**
     * Sets the value of the offerExpirationTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOfferExpirationTimeLimitDateTime(XMLGregorianCalendar value) {
        this.offerExpirationTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the offerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferID() {
        return offerID;
    }

    /**
     * Sets the value of the offerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferID(String value) {
        this.offerID = value;
    }

    /**
     * Gets the value of the offerItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ALaCarteOfferItemType }
     * 
     * 
     */
    public List<ALaCarteOfferItemType> getOfferItem() {
        if (offerItem == null) {
            offerItem = new ArrayList<ALaCarteOfferItemType>();
        }
        return this.offerItem;
    }

    /**
     * Gets the value of the ownerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

    /**
     * Gets the value of the penaltyRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenaltyRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPenaltyRefID() {
        if (penaltyRefID == null) {
            penaltyRefID = new ArrayList<String>();
        }
        return this.penaltyRefID;
    }

    /**
     * Gets the value of the redemptionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRedemptionInd() {
        return redemptionInd;
    }

    /**
     * Sets the value of the redemptionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRedemptionInd(Boolean value) {
        this.redemptionInd = value;
    }

    /**
     * Gets the value of the requestedDateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestedDateInd() {
        return requestedDateInd;
    }

    /**
     * Sets the value of the requestedDateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestedDateInd(Boolean value) {
        this.requestedDateInd = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setTotalPrice(PriceType value) {
        this.totalPrice = value;
    }

}
