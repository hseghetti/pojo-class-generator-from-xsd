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
 * Update Order
 * 
 * <p>Java class for UpdateOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CancelOrderRef" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CancelOrderRefType"/&gt;
 *         &lt;element name="ReshopOrder" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ReshopOrderType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOrderType", propOrder = {
    "cancelOrderRef",
    "reshopOrder"
})
public class UpdateOrderType {

    @XmlElement(name = "CancelOrderRef")
    protected CancelOrderRefType cancelOrderRef;
    @XmlElement(name = "ReshopOrder")
    protected ReshopOrderType reshopOrder;

    /**
     * Gets the value of the cancelOrderRef property.
     * 
     * @return
     *     possible object is
     *     {@link CancelOrderRefType }
     *     
     */
    public CancelOrderRefType getCancelOrderRef() {
        return cancelOrderRef;
    }

    /**
     * Sets the value of the cancelOrderRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelOrderRefType }
     *     
     */
    public void setCancelOrderRef(CancelOrderRefType value) {
        this.cancelOrderRef = value;
    }

    /**
     * Gets the value of the reshopOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ReshopOrderType }
     *     
     */
    public ReshopOrderType getReshopOrder() {
        return reshopOrder;
    }

    /**
     * Sets the value of the reshopOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReshopOrderType }
     *     
     */
    public void setReshopOrder(ReshopOrderType value) {
        this.reshopOrder = value;
    }

}