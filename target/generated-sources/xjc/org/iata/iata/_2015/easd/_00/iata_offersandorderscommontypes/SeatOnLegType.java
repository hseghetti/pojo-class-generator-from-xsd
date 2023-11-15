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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A sitting place for a passenger or crew in a cabin compartment on a Dated Operating Leg.
 *  Business Identifier Fields:
 *  - [Dated Operating Leg] (all identifier fields)
 *  - [Seat] (all identifier fields)
 * 
 * <p>Java class for SeatOnLegType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatOnLegType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OccupationStatusCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SeatStatusCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Seat" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SeatType"/&gt;
 *         &lt;element name="SeatAssignmentAssociations" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SeatAssignmentAssociationsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatOnLegType", propOrder = {
    "occupationStatusCode",
    "seat",
    "seatAssignmentAssociations"
})
public class SeatOnLegType {

    @XmlElement(name = "OccupationStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String occupationStatusCode;
    @XmlElement(name = "Seat", required = true)
    protected SeatType seat;
    @XmlElement(name = "SeatAssignmentAssociations", required = true)
    protected SeatAssignmentAssociationsType seatAssignmentAssociations;

    /**
     * Gets the value of the occupationStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationStatusCode() {
        return occupationStatusCode;
    }

    /**
     * Sets the value of the occupationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationStatusCode(String value) {
        this.occupationStatusCode = value;
    }

    /**
     * Gets the value of the seat property.
     * 
     * @return
     *     possible object is
     *     {@link SeatType }
     *     
     */
    public SeatType getSeat() {
        return seat;
    }

    /**
     * Sets the value of the seat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatType }
     *     
     */
    public void setSeat(SeatType value) {
        this.seat = value;
    }

    /**
     * Gets the value of the seatAssignmentAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAssignmentAssociationsType }
     *     
     */
    public SeatAssignmentAssociationsType getSeatAssignmentAssociations() {
        return seatAssignmentAssociations;
    }

    /**
     * Sets the value of the seatAssignmentAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAssignmentAssociationsType }
     *     
     */
    public void setSeatAssignmentAssociations(SeatAssignmentAssociationsType value) {
        this.seatAssignmentAssociations = value;
    }

}
