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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Origin and Destination airport/city pair which confines a passenger journey or an aircraft flight.
 *  Business Identifier Fields:
 *  - [Station] (Origin Station) IATA Location Code
 *  - [Station] (Destination Station) IATA Location Code
 * 
 * <p>Java class for OriginDestCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CabinType" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ShoppingRequestCabinTypeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CalendarDateCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CalendarDateCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionCriteriaRefID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="DestArrivalCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DestArrivalCriteriaType"/&gt;
 *         &lt;element name="JourneyDurationCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}JourneyDurationCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="OriginDepCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}OriginDepCriteriaType"/&gt;
 *         &lt;element name="OriginDestID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ID_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestCriteriaType", propOrder = {
    "cabinType",
    "calendarDateCriteria",
    "connectionCriteriaRefID",
    "destArrivalCriteria",
    "journeyDurationCriteria",
    "originDepCriteria",
    "originDestID"
})
public class OriginDestCriteriaType {

    @XmlElement(name = "CabinType")
    protected List<ShoppingRequestCabinTypeType> cabinType;
    @XmlElement(name = "CalendarDateCriteria")
    protected CalendarDateCriteriaType calendarDateCriteria;
    @XmlElement(name = "ConnectionCriteriaRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String connectionCriteriaRefID;
    @XmlElement(name = "DestArrivalCriteria", required = true)
    protected DestArrivalCriteriaType destArrivalCriteria;
    @XmlElement(name = "JourneyDurationCriteria")
    protected JourneyDurationCriteriaType journeyDurationCriteria;
    @XmlElement(name = "OriginDepCriteria", required = true)
    protected OriginDepCriteriaType originDepCriteria;
    @XmlElement(name = "OriginDestID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originDestID;

    /**
     * Gets the value of the cabinType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShoppingRequestCabinTypeType }
     * 
     * 
     */
    public List<ShoppingRequestCabinTypeType> getCabinType() {
        if (cabinType == null) {
            cabinType = new ArrayList<ShoppingRequestCabinTypeType>();
        }
        return this.cabinType;
    }

    /**
     * Gets the value of the calendarDateCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDateCriteriaType }
     *     
     */
    public CalendarDateCriteriaType getCalendarDateCriteria() {
        return calendarDateCriteria;
    }

    /**
     * Sets the value of the calendarDateCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDateCriteriaType }
     *     
     */
    public void setCalendarDateCriteria(CalendarDateCriteriaType value) {
        this.calendarDateCriteria = value;
    }

    /**
     * Gets the value of the connectionCriteriaRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionCriteriaRefID() {
        return connectionCriteriaRefID;
    }

    /**
     * Sets the value of the connectionCriteriaRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionCriteriaRefID(String value) {
        this.connectionCriteriaRefID = value;
    }

    /**
     * Gets the value of the destArrivalCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link DestArrivalCriteriaType }
     *     
     */
    public DestArrivalCriteriaType getDestArrivalCriteria() {
        return destArrivalCriteria;
    }

    /**
     * Sets the value of the destArrivalCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestArrivalCriteriaType }
     *     
     */
    public void setDestArrivalCriteria(DestArrivalCriteriaType value) {
        this.destArrivalCriteria = value;
    }

    /**
     * Gets the value of the journeyDurationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyDurationCriteriaType }
     *     
     */
    public JourneyDurationCriteriaType getJourneyDurationCriteria() {
        return journeyDurationCriteria;
    }

    /**
     * Sets the value of the journeyDurationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyDurationCriteriaType }
     *     
     */
    public void setJourneyDurationCriteria(JourneyDurationCriteriaType value) {
        this.journeyDurationCriteria = value;
    }

    /**
     * Gets the value of the originDepCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDepCriteriaType }
     *     
     */
    public OriginDepCriteriaType getOriginDepCriteria() {
        return originDepCriteria;
    }

    /**
     * Sets the value of the originDepCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDepCriteriaType }
     *     
     */
    public void setOriginDepCriteria(OriginDepCriteriaType value) {
        this.originDepCriteria = value;
    }

    /**
     * Gets the value of the originDestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDestID() {
        return originDestID;
    }

    /**
     * Sets the value of the originDestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginDestID(String value) {
        this.originDestID = value;
    }

}