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
 * Request content for Order Retrieve message
 * 
 * <p>Java class for OrderRetrieveRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderRetrieveRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderValidationFilterCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}OrderValidationFilterCriteriaType"/&gt;
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
@XmlType(name = "OrderRetrieveRequestType", propOrder = {
    "orderValidationFilterCriteria",
    "responseParameters"
})
public class OrderRetrieveRequestType {

    @XmlElement(name = "OrderValidationFilterCriteria", required = true)
    protected OrderValidationFilterCriteriaType orderValidationFilterCriteria;
    @XmlElement(name = "ResponseParameters")
    protected ResponseParametersRequestType responseParameters;

    /**
     * Gets the value of the orderValidationFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link OrderValidationFilterCriteriaType }
     *     
     */
    public OrderValidationFilterCriteriaType getOrderValidationFilterCriteria() {
        return orderValidationFilterCriteria;
    }

    /**
     * Sets the value of the orderValidationFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderValidationFilterCriteriaType }
     *     
     */
    public void setOrderValidationFilterCriteria(OrderValidationFilterCriteriaType value) {
        this.orderValidationFilterCriteria = value;
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