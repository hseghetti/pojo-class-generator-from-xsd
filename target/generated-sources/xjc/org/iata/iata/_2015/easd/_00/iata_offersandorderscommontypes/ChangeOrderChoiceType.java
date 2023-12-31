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
import javax.xml.bind.annotation.XmlType;


/**
 * Change Order Choice
 * 
 * <p>Java class for ChangeOrderChoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeOrderChoiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AcceptCancelledOffer" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}AcceptCancelOfferType"/&gt;
 *         &lt;element name="AcceptChange" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SelectedOrderItemType"/&gt;
 *         &lt;element name="AcceptOrderItemList" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}AcceptOrderItemListType"/&gt;
 *         &lt;element name="AcceptRepricedOrder" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}AcceptRepricedOrderType"/&gt;
 *         &lt;element name="AcceptSelectedQuotedOfferList" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}AcceptSelectedQuotedOfferListType"/&gt;
 *         &lt;element name="CancelUnpaidOrder" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CancelUnpaidOrderType"/&gt;
 *         &lt;element name="UpdatePax" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}OrderChangeUpdatePaxType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeOrderChoiceType", propOrder = {
    "acceptCancelledOffer",
    "acceptChange",
    "acceptOrderItemList",
    "acceptRepricedOrder",
    "acceptSelectedQuotedOfferList",
    "cancelUnpaidOrder",
    "updatePax"
})
public class ChangeOrderChoiceType {

    @XmlElement(name = "AcceptCancelledOffer")
    protected AcceptCancelOfferType acceptCancelledOffer;
    @XmlElement(name = "AcceptChange")
    protected SelectedOrderItemType acceptChange;
    @XmlElement(name = "AcceptOrderItemList")
    protected AcceptOrderItemListType acceptOrderItemList;
    @XmlElement(name = "AcceptRepricedOrder")
    protected AcceptRepricedOrderType acceptRepricedOrder;
    @XmlElement(name = "AcceptSelectedQuotedOfferList")
    protected AcceptSelectedQuotedOfferListType acceptSelectedQuotedOfferList;
    @XmlElement(name = "CancelUnpaidOrder")
    protected CancelUnpaidOrderType cancelUnpaidOrder;
    @XmlElement(name = "UpdatePax")
    protected OrderChangeUpdatePaxType updatePax;

    /**
     * Gets the value of the acceptCancelledOffer property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptCancelOfferType }
     *     
     */
    public AcceptCancelOfferType getAcceptCancelledOffer() {
        return acceptCancelledOffer;
    }

    /**
     * Sets the value of the acceptCancelledOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptCancelOfferType }
     *     
     */
    public void setAcceptCancelledOffer(AcceptCancelOfferType value) {
        this.acceptCancelledOffer = value;
    }

    /**
     * Gets the value of the acceptChange property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedOrderItemType }
     *     
     */
    public SelectedOrderItemType getAcceptChange() {
        return acceptChange;
    }

    /**
     * Sets the value of the acceptChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedOrderItemType }
     *     
     */
    public void setAcceptChange(SelectedOrderItemType value) {
        this.acceptChange = value;
    }

    /**
     * Gets the value of the acceptOrderItemList property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptOrderItemListType }
     *     
     */
    public AcceptOrderItemListType getAcceptOrderItemList() {
        return acceptOrderItemList;
    }

    /**
     * Sets the value of the acceptOrderItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptOrderItemListType }
     *     
     */
    public void setAcceptOrderItemList(AcceptOrderItemListType value) {
        this.acceptOrderItemList = value;
    }

    /**
     * Gets the value of the acceptRepricedOrder property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptRepricedOrderType }
     *     
     */
    public AcceptRepricedOrderType getAcceptRepricedOrder() {
        return acceptRepricedOrder;
    }

    /**
     * Sets the value of the acceptRepricedOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptRepricedOrderType }
     *     
     */
    public void setAcceptRepricedOrder(AcceptRepricedOrderType value) {
        this.acceptRepricedOrder = value;
    }

    /**
     * Gets the value of the acceptSelectedQuotedOfferList property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptSelectedQuotedOfferListType }
     *     
     */
    public AcceptSelectedQuotedOfferListType getAcceptSelectedQuotedOfferList() {
        return acceptSelectedQuotedOfferList;
    }

    /**
     * Sets the value of the acceptSelectedQuotedOfferList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptSelectedQuotedOfferListType }
     *     
     */
    public void setAcceptSelectedQuotedOfferList(AcceptSelectedQuotedOfferListType value) {
        this.acceptSelectedQuotedOfferList = value;
    }

    /**
     * Gets the value of the cancelUnpaidOrder property.
     * 
     * @return
     *     possible object is
     *     {@link CancelUnpaidOrderType }
     *     
     */
    public CancelUnpaidOrderType getCancelUnpaidOrder() {
        return cancelUnpaidOrder;
    }

    /**
     * Sets the value of the cancelUnpaidOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelUnpaidOrderType }
     *     
     */
    public void setCancelUnpaidOrder(CancelUnpaidOrderType value) {
        this.cancelUnpaidOrder = value;
    }

    /**
     * Gets the value of the updatePax property.
     * 
     * @return
     *     possible object is
     *     {@link OrderChangeUpdatePaxType }
     *     
     */
    public OrderChangeUpdatePaxType getUpdatePax() {
        return updatePax;
    }

    /**
     * Sets the value of the updatePax property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderChangeUpdatePaxType }
     *     
     */
    public void setUpdatePax(OrderChangeUpdatePaxType value) {
        this.updatePax = value;
    }

}
