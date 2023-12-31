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
 * Physical container for message data elements
 * 
 * <p>Java class for OrderQuotePayloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderQuotePayloadType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactInfoList" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ContactInfoListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExistingOrder" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ExistingOrderType" minOccurs="0"/&gt;
 *         &lt;element name="FareWaiver" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}FareWaiverType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrderCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}OrderCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="PaxList" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaxType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentFunctions" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaymentAssociatedFunctionsCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RepricedOrder" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}RepricedOrderType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseParameters" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ResponseParametersRequestType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectedOffers" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SelectedOfferType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderQuotePayloadType", propOrder = {
    "contactInfoList",
    "existingOrder",
    "fareWaiver",
    "orderCriteria",
    "paxList",
    "paymentFunctions",
    "repricedOrder",
    "responseParameters",
    "selectedOffers"
})
public class OrderQuotePayloadType {

    @XmlElement(name = "ContactInfoList")
    protected List<ContactInfoListType> contactInfoList;
    @XmlElement(name = "ExistingOrder")
    protected ExistingOrderType existingOrder;
    @XmlElement(name = "FareWaiver")
    protected List<FareWaiverType> fareWaiver;
    @XmlElement(name = "OrderCriteria")
    protected OrderCriteriaType orderCriteria;
    @XmlElement(name = "PaxList")
    protected List<PaxType> paxList;
    @XmlElement(name = "PaymentFunctions")
    protected List<PaymentAssociatedFunctionsCriteriaType> paymentFunctions;
    @XmlElement(name = "RepricedOrder")
    protected RepricedOrderType repricedOrder;
    @XmlElement(name = "ResponseParameters")
    protected List<ResponseParametersRequestType> responseParameters;
    @XmlElement(name = "SelectedOffers")
    protected List<SelectedOfferType> selectedOffers;

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
     * Gets the value of the existingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ExistingOrderType }
     *     
     */
    public ExistingOrderType getExistingOrder() {
        return existingOrder;
    }

    /**
     * Sets the value of the existingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistingOrderType }
     *     
     */
    public void setExistingOrder(ExistingOrderType value) {
        this.existingOrder = value;
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
     * Gets the value of the orderCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCriteriaType }
     *     
     */
    public OrderCriteriaType getOrderCriteria() {
        return orderCriteria;
    }

    /**
     * Sets the value of the orderCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCriteriaType }
     *     
     */
    public void setOrderCriteria(OrderCriteriaType value) {
        this.orderCriteria = value;
    }

    /**
     * Gets the value of the paxList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxType }
     * 
     * 
     */
    public List<PaxType> getPaxList() {
        if (paxList == null) {
            paxList = new ArrayList<PaxType>();
        }
        return this.paxList;
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
     * {@link PaymentAssociatedFunctionsCriteriaType }
     * 
     * 
     */
    public List<PaymentAssociatedFunctionsCriteriaType> getPaymentFunctions() {
        if (paymentFunctions == null) {
            paymentFunctions = new ArrayList<PaymentAssociatedFunctionsCriteriaType>();
        }
        return this.paymentFunctions;
    }

    /**
     * Gets the value of the repricedOrder property.
     * 
     * @return
     *     possible object is
     *     {@link RepricedOrderType }
     *     
     */
    public RepricedOrderType getRepricedOrder() {
        return repricedOrder;
    }

    /**
     * Sets the value of the repricedOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepricedOrderType }
     *     
     */
    public void setRepricedOrder(RepricedOrderType value) {
        this.repricedOrder = value;
    }

    /**
     * Gets the value of the responseParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseParametersRequestType }
     * 
     * 
     */
    public List<ResponseParametersRequestType> getResponseParameters() {
        if (responseParameters == null) {
            responseParameters = new ArrayList<ResponseParametersRequestType>();
        }
        return this.responseParameters;
    }

    /**
     * Gets the value of the selectedOffers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedOffers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedOffers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectedOfferType }
     * 
     * 
     */
    public List<SelectedOfferType> getSelectedOffers() {
        if (selectedOffers == null) {
            selectedOffers = new ArrayList<SelectedOfferType>();
        }
        return this.selectedOffers;
    }

}
