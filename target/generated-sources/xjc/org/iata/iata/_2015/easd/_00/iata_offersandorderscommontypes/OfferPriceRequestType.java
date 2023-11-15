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
 * Offer Price Request content for message
 * 
 * <p>Java class for OfferPriceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferPriceRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ShoppingRequestDataListsType" minOccurs="0"/&gt;
 *         &lt;element name="InExchForTicket" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PenaltyRefType" minOccurs="0"/&gt;
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}MetadataType" minOccurs="0"/&gt;
 *         &lt;element name="OfferCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}OfferCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="OriginDestRefID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentFunctions" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaymentAssociatedOfferFunctionsCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Policy" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PolicyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PricedOffer" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PricedOfferType"/&gt;
 *         &lt;element name="ResponseParameters" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ResponseParametersRequestType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferPriceRequestType", propOrder = {
    "dataLists",
    "inExchForTicket",
    "metadata",
    "offerCriteria",
    "originDestRefID",
    "paymentFunctions",
    "policy",
    "pricedOffer",
    "responseParameters"
})
public class OfferPriceRequestType {

    @XmlElement(name = "DataLists")
    protected ShoppingRequestDataListsType dataLists;
    @XmlElement(name = "InExchForTicket")
    protected PenaltyRefType inExchForTicket;
    @XmlElement(name = "Metadata")
    protected MetadataType metadata;
    @XmlElement(name = "OfferCriteria")
    protected OfferCriteriaType offerCriteria;
    @XmlElement(name = "OriginDestRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> originDestRefID;
    @XmlElement(name = "PaymentFunctions")
    protected List<PaymentAssociatedOfferFunctionsCriteriaType> paymentFunctions;
    @XmlElement(name = "Policy")
    protected List<PolicyType> policy;
    @XmlElement(name = "PricedOffer", required = true)
    protected PricedOfferType pricedOffer;
    @XmlElement(name = "ResponseParameters")
    protected ResponseParametersRequestType responseParameters;

    /**
     * Gets the value of the dataLists property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingRequestDataListsType }
     *     
     */
    public ShoppingRequestDataListsType getDataLists() {
        return dataLists;
    }

    /**
     * Sets the value of the dataLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingRequestDataListsType }
     *     
     */
    public void setDataLists(ShoppingRequestDataListsType value) {
        this.dataLists = value;
    }

    /**
     * Gets the value of the inExchForTicket property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyRefType }
     *     
     */
    public PenaltyRefType getInExchForTicket() {
        return inExchForTicket;
    }

    /**
     * Sets the value of the inExchForTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyRefType }
     *     
     */
    public void setInExchForTicket(PenaltyRefType value) {
        this.inExchForTicket = value;
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
     * Gets the value of the originDestRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOriginDestRefID() {
        if (originDestRefID == null) {
            originDestRefID = new ArrayList<String>();
        }
        return this.originDestRefID;
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
     * {@link PaymentAssociatedOfferFunctionsCriteriaType }
     * 
     * 
     */
    public List<PaymentAssociatedOfferFunctionsCriteriaType> getPaymentFunctions() {
        if (paymentFunctions == null) {
            paymentFunctions = new ArrayList<PaymentAssociatedOfferFunctionsCriteriaType>();
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
     * Gets the value of the pricedOffer property.
     * 
     * @return
     *     possible object is
     *     {@link PricedOfferType }
     *     
     */
    public PricedOfferType getPricedOffer() {
        return pricedOffer;
    }

    /**
     * Sets the value of the pricedOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedOfferType }
     *     
     */
    public void setPricedOffer(PricedOfferType value) {
        this.pricedOffer = value;
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

}