//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderrulesrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Allows for the querying of rules based on Order information or Filed Fare information.
 * 
 * <p>Java class for CoreRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoreRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FareRef" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderRulesRQ}FareRefType"/&gt;
 *         &lt;element name="OrderRef" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderRulesRQ}OrderRefType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoreRequestType", propOrder = {
    "fareRef",
    "orderRef"
})
public class CoreRequestType {

    @XmlElement(name = "FareRef")
    protected FareRefType fareRef;
    @XmlElement(name = "OrderRef")
    protected OrderRefType orderRef;

    /**
     * Gets the value of the fareRef property.
     * 
     * @return
     *     possible object is
     *     {@link FareRefType }
     *     
     */
    public FareRefType getFareRef() {
        return fareRef;
    }

    /**
     * Sets the value of the fareRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRefType }
     *     
     */
    public void setFareRef(FareRefType value) {
        this.fareRef = value;
    }

    /**
     * Gets the value of the orderRef property.
     * 
     * @return
     *     possible object is
     *     {@link OrderRefType }
     *     
     */
    public OrderRefType getOrderRef() {
        return orderRef;
    }

    /**
     * Sets the value of the orderRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderRefType }
     *     
     */
    public void setOrderRef(OrderRefType value) {
        this.orderRef = value;
    }

}
