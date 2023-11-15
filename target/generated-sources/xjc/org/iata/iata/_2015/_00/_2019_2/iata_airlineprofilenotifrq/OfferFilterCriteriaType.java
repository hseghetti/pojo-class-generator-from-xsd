//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_airlineprofilenotifrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Filters results based on offer preferences/criteria.
 * 
 * <p>Java class for OfferFilterCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferFilterCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DirectionalIndText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileNotifRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="OfferDestPoint" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileNotifRQ}GeographicFilterCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="OfferOriginPoint" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileNotifRQ}GeographicFilterCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="TravelWithin" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileNotifRQ}GeographicFilterCriteriaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferFilterCriteriaType", propOrder = {
    "directionalIndText",
    "offerDestPoint",
    "offerOriginPoint",
    "travelWithin"
})
public class OfferFilterCriteriaType {

    @XmlElement(name = "DirectionalIndText")
    protected String directionalIndText;
    @XmlElement(name = "OfferDestPoint")
    protected GeographicFilterCriteriaType offerDestPoint;
    @XmlElement(name = "OfferOriginPoint")
    protected GeographicFilterCriteriaType offerOriginPoint;
    @XmlElement(name = "TravelWithin")
    protected GeographicFilterCriteriaType travelWithin;

    /**
     * Gets the value of the directionalIndText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectionalIndText() {
        return directionalIndText;
    }

    /**
     * Sets the value of the directionalIndText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectionalIndText(String value) {
        this.directionalIndText = value;
    }

    /**
     * Gets the value of the offerDestPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicFilterCriteriaType }
     *     
     */
    public GeographicFilterCriteriaType getOfferDestPoint() {
        return offerDestPoint;
    }

    /**
     * Sets the value of the offerDestPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicFilterCriteriaType }
     *     
     */
    public void setOfferDestPoint(GeographicFilterCriteriaType value) {
        this.offerDestPoint = value;
    }

    /**
     * Gets the value of the offerOriginPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicFilterCriteriaType }
     *     
     */
    public GeographicFilterCriteriaType getOfferOriginPoint() {
        return offerOriginPoint;
    }

    /**
     * Sets the value of the offerOriginPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicFilterCriteriaType }
     *     
     */
    public void setOfferOriginPoint(GeographicFilterCriteriaType value) {
        this.offerOriginPoint = value;
    }

    /**
     * Gets the value of the travelWithin property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicFilterCriteriaType }
     *     
     */
    public GeographicFilterCriteriaType getTravelWithin() {
        return travelWithin;
    }

    /**
     * Sets the value of the travelWithin property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicFilterCriteriaType }
     *     
     */
    public void setTravelWithin(GeographicFilterCriteriaType value) {
        this.travelWithin = value;
    }

}
