//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015.easd._00.iata_offersandorderscommontypes;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer summary that includes highest, lowest, and number of matched offers included in the response.
 * 
 * <p>Java class for OffersSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffersSummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HighestOfferPrice" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PriceSummaryType" minOccurs="0"/&gt;
 *         &lt;element name="LowestOfferPrice" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PriceSummaryType" minOccurs="0"/&gt;
 *         &lt;element name="MatchedOfferQty" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}QtyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffersSummaryType", propOrder = {
    "highestOfferPrice",
    "lowestOfferPrice",
    "matchedOfferQty"
})
public class OffersSummaryType {

    @XmlElement(name = "HighestOfferPrice")
    protected PriceSummaryType highestOfferPrice;
    @XmlElement(name = "LowestOfferPrice")
    protected PriceSummaryType lowestOfferPrice;
    @XmlElement(name = "MatchedOfferQty")
    protected BigDecimal matchedOfferQty;

    /**
     * Gets the value of the highestOfferPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSummaryType }
     *     
     */
    public PriceSummaryType getHighestOfferPrice() {
        return highestOfferPrice;
    }

    /**
     * Sets the value of the highestOfferPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSummaryType }
     *     
     */
    public void setHighestOfferPrice(PriceSummaryType value) {
        this.highestOfferPrice = value;
    }

    /**
     * Gets the value of the lowestOfferPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSummaryType }
     *     
     */
    public PriceSummaryType getLowestOfferPrice() {
        return lowestOfferPrice;
    }

    /**
     * Sets the value of the lowestOfferPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSummaryType }
     *     
     */
    public void setLowestOfferPrice(PriceSummaryType value) {
        this.lowestOfferPrice = value;
    }

    /**
     * Gets the value of the matchedOfferQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMatchedOfferQty() {
        return matchedOfferQty;
    }

    /**
     * Sets the value of the matchedOfferQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMatchedOfferQty(BigDecimal value) {
        this.matchedOfferQty = value;
    }

}