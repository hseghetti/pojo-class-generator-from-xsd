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
 * This is a container for a flight request type which allow multiple Origin and Destination flight criteria to be input in this type of request.
 * 
 * <p>Java class for InterlineFlightRequestOriginDestinationsCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterlineFlightRequestOriginDestinationsCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JourneyDurationCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}JourneyDurationCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OriginDestCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}InterlineOriginDestCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterlineFlightRequestOriginDestinationsCriteriaType", propOrder = {
    "journeyDurationCriteria",
    "originDestCriteria"
})
public class InterlineFlightRequestOriginDestinationsCriteriaType {

    @XmlElement(name = "JourneyDurationCriteria")
    protected List<JourneyDurationCriteriaType> journeyDurationCriteria;
    @XmlElement(name = "OriginDestCriteria")
    protected List<InterlineOriginDestCriteriaType> originDestCriteria;

    /**
     * Gets the value of the journeyDurationCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyDurationCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyDurationCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyDurationCriteriaType }
     * 
     * 
     */
    public List<JourneyDurationCriteriaType> getJourneyDurationCriteria() {
        if (journeyDurationCriteria == null) {
            journeyDurationCriteria = new ArrayList<JourneyDurationCriteriaType>();
        }
        return this.journeyDurationCriteria;
    }

    /**
     * Gets the value of the originDestCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterlineOriginDestCriteriaType }
     * 
     * 
     */
    public List<InterlineOriginDestCriteriaType> getOriginDestCriteria() {
        if (originDestCriteria == null) {
            originDestCriteria = new ArrayList<InterlineOriginDestCriteriaType>();
        }
        return this.originDestCriteria;
    }

}
