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
 *         &lt;element name="DifferentialTypeCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DifferentialTypeCodeType"/&gt;
 *         &lt;element name="DiffPrice" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DiffPriceAndFareDetailsType"/&gt;
 *         &lt;element name="NewPrice" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PriceAndFareDetailsType"/&gt;
 *         &lt;element name="OldPrice" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PriceAndFareDetailsType" minOccurs="0"/&gt;
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
    "diffPrice",
    "newPrice",
    "oldPrice"
})
public class PriceDifferentialType {

    @XmlElement(name = "DifferentialTypeCode", required = true)
    @XmlSchemaType(name = "token")
    protected DifferentialTypeCodeContentType differentialTypeCode;
    @XmlElement(name = "DiffPrice", required = true)
    protected DiffPriceAndFareDetailsType diffPrice;
    @XmlElement(name = "NewPrice", required = true)
    protected PriceAndFareDetailsType newPrice;
    @XmlElement(name = "OldPrice")
    protected PriceAndFareDetailsType oldPrice;

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
     * Gets the value of the diffPrice property.
     * 
     * @return
     *     possible object is
     *     {@link DiffPriceAndFareDetailsType }
     *     
     */
    public DiffPriceAndFareDetailsType getDiffPrice() {
        return diffPrice;
    }

    /**
     * Sets the value of the diffPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiffPriceAndFareDetailsType }
     *     
     */
    public void setDiffPrice(DiffPriceAndFareDetailsType value) {
        this.diffPrice = value;
    }

    /**
     * Gets the value of the newPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAndFareDetailsType }
     *     
     */
    public PriceAndFareDetailsType getNewPrice() {
        return newPrice;
    }

    /**
     * Sets the value of the newPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndFareDetailsType }
     *     
     */
    public void setNewPrice(PriceAndFareDetailsType value) {
        this.newPrice = value;
    }

    /**
     * Gets the value of the oldPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAndFareDetailsType }
     *     
     */
    public PriceAndFareDetailsType getOldPrice() {
        return oldPrice;
    }

    /**
     * Sets the value of the oldPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndFareDetailsType }
     *     
     */
    public void setOldPrice(PriceAndFareDetailsType value) {
        this.oldPrice = value;
    }

}
