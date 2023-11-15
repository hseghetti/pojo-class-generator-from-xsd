//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * For each OfferItem, this function allows the airline to inform the seller about amount differential type if this OfferItem is chosen.
 * 
 * <p>Java class for PriceDifferentialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceDifferentialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DifferentialTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRQ}DifferentialTypeCodeType"/&gt;
 *         &lt;element name="GrandTotalAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRQ}AmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceDifferentialType", propOrder = {
    "differentialTypeCode",
    "grandTotalAmount"
})
public class PriceDifferentialType {

    @XmlElement(name = "DifferentialTypeCode", required = true)
    @XmlSchemaType(name = "token")
    protected DifferentialTypeCodeContentType differentialTypeCode;
    @XmlElement(name = "GrandTotalAmount", required = true)
    protected AmountType grandTotalAmount;

    /**
     * Gets the value of the differentialTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DifferentialTypeCodeContentType }
     *     
     */
    public DifferentialTypeCodeContentType getDifferentialTypeCode() {
        return differentialTypeCode;
    }

    /**
     * Sets the value of the differentialTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DifferentialTypeCodeContentType }
     *     
     */
    public void setDifferentialTypeCode(DifferentialTypeCodeContentType value) {
        this.differentialTypeCode = value;
    }

    /**
     * Gets the value of the grandTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGrandTotalAmount() {
        return grandTotalAmount;
    }

    /**
     * Sets the value of the grandTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGrandTotalAmount(AmountType value) {
        this.grandTotalAmount = value;
    }

}