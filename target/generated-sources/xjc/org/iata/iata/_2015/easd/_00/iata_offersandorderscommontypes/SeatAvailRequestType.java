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
import javax.xml.bind.annotation.XmlType;


/**
 * Request content for Seat Availability Request message
 * 
 * <p>Java class for SeatAvailRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatAvailRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactInfoList" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ContactInfoListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DatedMarketingSegmentList" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DatedMarketingSegmentListType" minOccurs="0"/&gt;
 *         &lt;element name="DatedOperatingLegList" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DatedOperatingLegListType" minOccurs="0"/&gt;
 *         &lt;element name="DatedOperatingSegmentList" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DatedOperatingSegmentListType" minOccurs="0"/&gt;
 *         &lt;element name="DisclosureList" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DisclosureListType" minOccurs="0"/&gt;
 *         &lt;element name="FareWaiver" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}FareWaiverType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}MetadataType" minOccurs="0"/&gt;
 *         &lt;element name="OfferCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}OfferCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="Pax" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaxType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentFunctions" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaymentFunctionsCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Policy" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PolicyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResponseParameters" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ResponseParametersRequestType" minOccurs="0"/&gt;
 *         &lt;element name="SeatAvailCoreRequest" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SeatAvailCoreRequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatAvailRequestType", propOrder = {
    "contactInfoList",
    "datedMarketingSegmentList",
    "datedOperatingLegList",
    "datedOperatingSegmentList",
    "disclosureList",
    "fareWaiver",
    "metadata",
    "offerCriteria",
    "pax",
    "paymentFunctions",
    "policy",
    "responseParameters",
    "seatAvailCoreRequest"
})
public class SeatAvailRequestType {

    @XmlElement(name = "ContactInfoList")
    protected List<ContactInfoListType> contactInfoList;
    @XmlElement(name = "DatedMarketingSegmentList")
    protected DatedMarketingSegmentListType datedMarketingSegmentList;
    @XmlElement(name = "DatedOperatingLegList")
    protected DatedOperatingLegListType datedOperatingLegList;
    @XmlElement(name = "DatedOperatingSegmentList")
    protected DatedOperatingSegmentListType datedOperatingSegmentList;
    @XmlElement(name = "DisclosureList")
    protected DisclosureListType disclosureList;
    @XmlElement(name = "FareWaiver")
    protected List<FareWaiverType> fareWaiver;
    @XmlElement(name = "Metadata")
    protected MetadataType metadata;
    @XmlElement(name = "OfferCriteria")
    protected OfferCriteriaType offerCriteria;
    @XmlElement(name = "Pax")
    protected List<PaxType> pax;
    @XmlElement(name = "PaymentFunctions")
    protected List<PaymentFunctionsCriteriaType> paymentFunctions;
    @XmlElement(name = "Policy")
    protected List<PolicyType> policy;
    @XmlElement(name = "ResponseParameters")
    protected ResponseParametersRequestType responseParameters;
    @XmlElement(name = "SeatAvailCoreRequest", required = true)
    protected SeatAvailCoreRequestType seatAvailCoreRequest;

    /**
     * Gets the value of the contactInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfoListType }
     * 
     * 
     */
    public List<ContactInfoListType> getContactInfoList() {
        if (contactInfoList == null) {
            contactInfoList = new ArrayList<ContactInfoListType>();
        }
        return this.contactInfoList;
    }

    /**
     * Gets the value of the datedMarketingSegmentList property.
     * 
     * @return
     *     possible object is
     *     {@link DatedMarketingSegmentListType }
     *     
     */
    public DatedMarketingSegmentListType getDatedMarketingSegmentList() {
        return datedMarketingSegmentList;
    }

    /**
     * Sets the value of the datedMarketingSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedMarketingSegmentListType }
     *     
     */
    public void setDatedMarketingSegmentList(DatedMarketingSegmentListType value) {
        this.datedMarketingSegmentList = value;
    }

    /**
     * Gets the value of the datedOperatingLegList property.
     * 
     * @return
     *     possible object is
     *     {@link DatedOperatingLegListType }
     *     
     */
    public DatedOperatingLegListType getDatedOperatingLegList() {
        return datedOperatingLegList;
    }

    /**
     * Sets the value of the datedOperatingLegList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedOperatingLegListType }
     *     
     */
    public void setDatedOperatingLegList(DatedOperatingLegListType value) {
        this.datedOperatingLegList = value;
    }

    /**
     * Gets the value of the datedOperatingSegmentList property.
     * 
     * @return
     *     possible object is
     *     {@link DatedOperatingSegmentListType }
     *     
     */
    public DatedOperatingSegmentListType getDatedOperatingSegmentList() {
        return datedOperatingSegmentList;
    }

    /**
     * Sets the value of the datedOperatingSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedOperatingSegmentListType }
     *     
     */
    public void setDatedOperatingSegmentList(DatedOperatingSegmentListType value) {
        this.datedOperatingSegmentList = value;
    }

    /**
     * Gets the value of the disclosureList property.
     * 
     * @return
     *     possible object is
     *     {@link DisclosureListType }
     *     
     */
    public DisclosureListType getDisclosureList() {
        return disclosureList;
    }

    /**
     * Sets the value of the disclosureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosureListType }
     *     
     */
    public void setDisclosureList(DisclosureListType value) {
        this.disclosureList = value;
    }

    /**
     * Gets the value of the fareWaiver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareWaiver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareWaiver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareWaiverType }
     * 
     * 
     */
    public List<FareWaiverType> getFareWaiver() {
        if (fareWaiver == null) {
            fareWaiver = new ArrayList<FareWaiverType>();
        }
        return this.fareWaiver;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataType }
     *     
     */
    public MetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataType }
     *     
     */
    public void setMetadata(MetadataType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the offerCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link OfferCriteriaType }
     *     
     */
    public OfferCriteriaType getOfferCriteria() {
        return offerCriteria;
    }

    /**
     * Sets the value of the offerCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferCriteriaType }
     *     
     */
    public void setOfferCriteria(OfferCriteriaType value) {
        this.offerCriteria = value;
    }

    /**
     * Gets the value of the pax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxType }
     * 
     * 
     */
    public List<PaxType> getPax() {
        if (pax == null) {
            pax = new ArrayList<PaxType>();
        }
        return this.pax;
    }

    /**
     * Gets the value of the paymentFunctions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFunctions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFunctions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentFunctionsCriteriaType }
     * 
     * 
     */
    public List<PaymentFunctionsCriteriaType> getPaymentFunctions() {
        if (paymentFunctions == null) {
            paymentFunctions = new ArrayList<PaymentFunctionsCriteriaType>();
        }
        return this.paymentFunctions;
    }

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyType }
     * 
     * 
     */
    public List<PolicyType> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<PolicyType>();
        }
        return this.policy;
    }

    /**
     * Gets the value of the responseParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParametersRequestType }
     *     
     */
    public ResponseParametersRequestType getResponseParameters() {
        return responseParameters;
    }

    /**
     * Sets the value of the responseParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParametersRequestType }
     *     
     */
    public void setResponseParameters(ResponseParametersRequestType value) {
        this.responseParameters = value;
    }

    /**
     * Gets the value of the seatAvailCoreRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAvailCoreRequestType }
     *     
     */
    public SeatAvailCoreRequestType getSeatAvailCoreRequest() {
        return seatAvailCoreRequest;
    }

    /**
     * Sets the value of the seatAvailCoreRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAvailCoreRequestType }
     *     
     */
    public void setSeatAvailCoreRequest(SeatAvailCoreRequestType value) {
        this.seatAvailCoreRequest = value;
    }

}