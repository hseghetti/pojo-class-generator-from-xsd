//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderretrieverq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Payload information for OrderListRQ.
 * 
 * <p>Java class for RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderRetrieveRQ}OrderFilterCriteriaType"/&gt;
 *         &lt;element name="OrderRetrieveParameters" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderRetrieveRQ}ResponseParametersType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "orderFilterCriteria",
    "orderRetrieveParameters"
})
public class RequestType {

    @XmlElement(name = "OrderFilterCriteria", required = true)
    protected OrderFilterCriteriaType orderFilterCriteria;
    @XmlElement(name = "OrderRetrieveParameters")
    protected ResponseParametersType orderRetrieveParameters;

    /**
     * Gets the value of the orderFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link OrderFilterCriteriaType }
     *     
     */
    public OrderFilterCriteriaType getOrderFilterCriteria() {
        return orderFilterCriteria;
    }

    /**
     * Sets the value of the orderFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderFilterCriteriaType }
     *     
     */
    public void setOrderFilterCriteria(OrderFilterCriteriaType value) {
        this.orderFilterCriteria = value;
    }

    /**
     * Gets the value of the orderRetrieveParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParametersType }
     *     
     */
    public ResponseParametersType getOrderRetrieveParameters() {
        return orderRetrieveParameters;
    }

    /**
     * Sets the value of the orderRetrieveParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParametersType }
     *     
     */
    public void setOrderRetrieveParameters(ResponseParametersType value) {
        this.orderRetrieveParameters = value;
    }

}
