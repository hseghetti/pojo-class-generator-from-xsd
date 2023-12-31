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
 * A set of filter criteria based on offer preferences/criteria.
 *  Technical specialized to use just origin and destination points.
 *  
 * 
 * <p>Java class for OfferFilterCriteriawithOriginandDestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferFilterCriteriawithOriginandDestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DirectionalIndText" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}TextType"/&gt;
 *         &lt;element name="OfferDestPoint" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}GeographicFilterCriteriaType"/&gt;
 *         &lt;element name="OfferOriginPoint" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}GeographicFilterCriteriaType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferFilterCriteriawithOriginandDestType", propOrder = {
    "directionalIndText",
    "offerDestPoint",
    "offerOriginPoint"
})
public class OfferFilterCriteriawithOriginandDestType {

    @XmlElement(name = "DirectionalIndText", required = true)
    protected String directionalIndText;
    @XmlElement(name = "OfferDestPoint", required = true)
    protected GeographicFilterCriteriaType offerDestPoint;
    @XmlElement(name = "OfferOriginPoint", required = true)
    protected GeographicFilterCriteriaType offerOriginPoint;

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

}
