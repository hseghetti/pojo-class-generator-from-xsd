//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_airlineprofilers;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;choice&gt;
 *         &lt;element name="DirectionalIndText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="OfferDestPoint" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileRS}GeographicFilterCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OfferOriginPoint" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileRS}GeographicFilterCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TravelWithin" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileRS}GeographicFilterCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
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
    protected List<GeographicFilterCriteriaType> offerDestPoint;
    @XmlElement(name = "OfferOriginPoint")
    protected List<GeographicFilterCriteriaType> offerOriginPoint;
    @XmlElement(name = "TravelWithin")
    protected List<GeographicFilterCriteriaType> travelWithin;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerDestPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferDestPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeographicFilterCriteriaType }
     * 
     * 
     */
    public List<GeographicFilterCriteriaType> getOfferDestPoint() {
        if (offerDestPoint == null) {
            offerDestPoint = new ArrayList<GeographicFilterCriteriaType>();
        }
        return this.offerDestPoint;
    }

    /**
     * Gets the value of the offerOriginPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerOriginPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferOriginPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeographicFilterCriteriaType }
     * 
     * 
     */
    public List<GeographicFilterCriteriaType> getOfferOriginPoint() {
        if (offerOriginPoint == null) {
            offerOriginPoint = new ArrayList<GeographicFilterCriteriaType>();
        }
        return this.offerOriginPoint;
    }

    /**
     * Gets the value of the travelWithin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelWithin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelWithin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeographicFilterCriteriaType }
     * 
     * 
     */
    public List<GeographicFilterCriteriaType> getTravelWithin() {
        if (travelWithin == null) {
            travelWithin = new ArrayList<GeographicFilterCriteriaType>();
        }
        return this.travelWithin;
    }

}
