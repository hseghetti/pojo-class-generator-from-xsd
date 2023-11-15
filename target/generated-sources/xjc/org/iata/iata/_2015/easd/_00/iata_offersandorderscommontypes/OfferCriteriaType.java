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


/**
 * Further qualifies the flight request by influencing which results are returned in the shopping response, including preferred or required criteria.
 * 
 * <p>Java class for OfferCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaggagePricingCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}BaggagePricingCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="FareCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}FareCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PricingMethodCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PricingMethodCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProgramCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ProgramCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PromotionCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PromotionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SeatCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SeatCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ServiceCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpecialNeedsCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SpecialServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TripPurposeCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}TripPurposeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="WaitListCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PrefLevelType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferCriteriaType", propOrder = {
    "baggagePricingCriteria",
    "fareCriteria",
    "pricingMethodCriteria",
    "programCriteria",
    "promotionCriteria",
    "seatCriteria",
    "serviceCriteria",
    "specialNeedsCriteria",
    "tripPurposeCode",
    "waitListCriteria"
})
public class OfferCriteriaType {

    @XmlElement(name = "BaggagePricingCriteria")
    protected BaggagePricingCriteriaType baggagePricingCriteria;
    @XmlElement(name = "FareCriteria")
    protected List<FareCriteriaType> fareCriteria;
    @XmlElement(name = "PricingMethodCriteria")
    protected List<PricingMethodCriteriaType> pricingMethodCriteria;
    @XmlElement(name = "ProgramCriteria")
    protected List<ProgramCriteriaType> programCriteria;
    @XmlElement(name = "PromotionCriteria")
    protected List<PromotionType> promotionCriteria;
    @XmlElement(name = "SeatCriteria")
    protected List<SeatCriteriaType> seatCriteria;
    @XmlElement(name = "ServiceCriteria")
    protected List<ServiceCriteriaType> serviceCriteria;
    @XmlElement(name = "SpecialNeedsCriteria")
    protected List<SpecialServiceType> specialNeedsCriteria;
    @XmlElement(name = "TripPurposeCode")
    @XmlSchemaType(name = "string")
    protected TripPurposeCodeContentType tripPurposeCode;
    @XmlElement(name = "WaitListCriteria")
    protected PrefLevelType waitListCriteria;

    /**
     * Gets the value of the baggagePricingCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link BaggagePricingCriteriaType }
     *     
     */
    public BaggagePricingCriteriaType getBaggagePricingCriteria() {
        return baggagePricingCriteria;
    }

    /**
     * Sets the value of the baggagePricingCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggagePricingCriteriaType }
     *     
     */
    public void setBaggagePricingCriteria(BaggagePricingCriteriaType value) {
        this.baggagePricingCriteria = value;
    }

    /**
     * Gets the value of the fareCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareCriteriaType }
     * 
     * 
     */
    public List<FareCriteriaType> getFareCriteria() {
        if (fareCriteria == null) {
            fareCriteria = new ArrayList<FareCriteriaType>();
        }
        return this.fareCriteria;
    }

    /**
     * Gets the value of the pricingMethodCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingMethodCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingMethodCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingMethodCriteriaType }
     * 
     * 
     */
    public List<PricingMethodCriteriaType> getPricingMethodCriteria() {
        if (pricingMethodCriteria == null) {
            pricingMethodCriteria = new ArrayList<PricingMethodCriteriaType>();
        }
        return this.pricingMethodCriteria;
    }

    /**
     * Gets the value of the programCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgramCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgramCriteriaType }
     * 
     * 
     */
    public List<ProgramCriteriaType> getProgramCriteria() {
        if (programCriteria == null) {
            programCriteria = new ArrayList<ProgramCriteriaType>();
        }
        return this.programCriteria;
    }

    /**
     * Gets the value of the promotionCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionType }
     * 
     * 
     */
    public List<PromotionType> getPromotionCriteria() {
        if (promotionCriteria == null) {
            promotionCriteria = new ArrayList<PromotionType>();
        }
        return this.promotionCriteria;
    }

    /**
     * Gets the value of the seatCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatCriteriaType }
     * 
     * 
     */
    public List<SeatCriteriaType> getSeatCriteria() {
        if (seatCriteria == null) {
            seatCriteria = new ArrayList<SeatCriteriaType>();
        }
        return this.seatCriteria;
    }

    /**
     * Gets the value of the serviceCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCriteriaType }
     * 
     * 
     */
    public List<ServiceCriteriaType> getServiceCriteria() {
        if (serviceCriteria == null) {
            serviceCriteria = new ArrayList<ServiceCriteriaType>();
        }
        return this.serviceCriteria;
    }

    /**
     * Gets the value of the specialNeedsCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialNeedsCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialNeedsCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialServiceType }
     * 
     * 
     */
    public List<SpecialServiceType> getSpecialNeedsCriteria() {
        if (specialNeedsCriteria == null) {
            specialNeedsCriteria = new ArrayList<SpecialServiceType>();
        }
        return this.specialNeedsCriteria;
    }

    /**
     * Gets the value of the tripPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TripPurposeCodeContentType }
     *     
     */
    public TripPurposeCodeContentType getTripPurposeCode() {
        return tripPurposeCode;
    }

    /**
     * Sets the value of the tripPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripPurposeCodeContentType }
     *     
     */
    public void setTripPurposeCode(TripPurposeCodeContentType value) {
        this.tripPurposeCode = value;
    }

    /**
     * Gets the value of the waitListCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelType }
     *     
     */
    public PrefLevelType getWaitListCriteria() {
        return waitListCriteria;
    }

    /**
     * Sets the value of the waitListCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelType }
     *     
     */
    public void setWaitListCriteria(PrefLevelType value) {
        this.waitListCriteria = value;
    }

}