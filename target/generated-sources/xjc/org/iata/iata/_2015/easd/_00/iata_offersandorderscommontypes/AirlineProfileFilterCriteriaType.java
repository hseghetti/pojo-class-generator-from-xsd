//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015.easd._00.iata_offersandorderscommontypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Criteria to filter airline profile response information.
 * 
 * <p>Java class for AirlineProfileFilterCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineProfileFilterCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineProfileCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}FilterAirlineProfileType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AllProfilesInd" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}IndType" minOccurs="0"/&gt;
 *         &lt;element name="MediaURL_Ind" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}IndType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineProfileFilterCriteriaType", propOrder = {
    "airlineProfileCriteria",
    "allProfilesInd",
    "mediaURLInd"
})
public class AirlineProfileFilterCriteriaType {

    @XmlElement(name = "AirlineProfileCriteria")
    protected List<FilterAirlineProfileType> airlineProfileCriteria;
    @XmlElement(name = "AllProfilesInd")
    protected Boolean allProfilesInd;
    @XmlElement(name = "MediaURL_Ind")
    protected Boolean mediaURLInd;

    /**
     * Gets the value of the airlineProfileCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airlineProfileCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirlineProfileCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterAirlineProfileType }
     * 
     * 
     */
    public List<FilterAirlineProfileType> getAirlineProfileCriteria() {
        if (airlineProfileCriteria == null) {
            airlineProfileCriteria = new ArrayList<FilterAirlineProfileType>();
        }
        return this.airlineProfileCriteria;
    }

    /**
     * Gets the value of the allProfilesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllProfilesInd() {
        return allProfilesInd;
    }

    /**
     * Sets the value of the allProfilesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllProfilesInd(Boolean value) {
        this.allProfilesInd = value;
    }

    /**
     * Gets the value of the mediaURLInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMediaURLInd() {
        return mediaURLInd;
    }

    /**
     * Sets the value of the mediaURLInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMediaURLInd(Boolean value) {
        this.mediaURLInd = value;
    }

}