//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_invguaranteers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Guaranteed inventory associations.
 * 
 * <p>Java class for AssociationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Offer" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_InvGuaranteeRS}OfferType" minOccurs="0"/&gt;
 *         &lt;element name="Order" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_InvGuaranteeRS}OrderType" minOccurs="0"/&gt;
 *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_InvGuaranteeRS}ShoppingResponseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociationsType", propOrder = {
    "offer",
    "order",
    "shoppingResponse"
})
public class AssociationsType {

    @XmlElement(name = "Offer")
    protected OfferType offer;
    @XmlElement(name = "Order")
    protected OrderType order;
    @XmlElement(name = "ShoppingResponse")
    protected ShoppingResponseType shoppingResponse;

    /**
     * Gets the value of the offer property.
     * 
     * @return
     *     possible object is
     *     {@link OfferType }
     *     
     */
    public OfferType getOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType }
     *     
     */
    public void setOffer(OfferType value) {
        this.offer = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrder(OrderType value) {
        this.order = value;
    }

    /**
     * Gets the value of the shoppingResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseType }
     *     
     */
    public ShoppingResponseType getShoppingResponse() {
        return shoppingResponse;
    }

    /**
     * Sets the value of the shoppingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseType }
     *     
     */
    public void setShoppingResponse(ShoppingResponseType value) {
        this.shoppingResponse = value;
    }

}