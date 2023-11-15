//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_seatavailabilityrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * Container to describe where a Stop Over can be added into an Itinerary. The Stop Over location is tied to the Arrival Port of the referenced Pax Segment (or Pax Leg) referenced and contains the maximum time permitted at that stop.
 * 
 * <p>Java class for StopOverLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopOverLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaximumDuration" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_SeatAvailabilityRS}DurationType" minOccurs="0"/&gt;
 *         &lt;element name="PaxLegRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_SeatAvailabilityRS}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="PaxSegmentRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_SeatAvailabilityRS}ID_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopOverLocationType", propOrder = {
    "maximumDuration",
    "paxLegRefID",
    "paxSegmentRefID"
})
public class StopOverLocationType {

    @XmlElement(name = "MaximumDuration")
    protected Duration maximumDuration;
    @XmlElement(name = "PaxLegRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxLegRefID;
    @XmlElement(name = "PaxSegmentRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxSegmentRefID;

    /**
     * Gets the value of the maximumDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumDuration() {
        return maximumDuration;
    }

    /**
     * Sets the value of the maximumDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumDuration(Duration value) {
        this.maximumDuration = value;
    }

    /**
     * Gets the value of the paxLegRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxLegRefID() {
        return paxLegRefID;
    }

    /**
     * Sets the value of the paxLegRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxLegRefID(String value) {
        this.paxLegRefID = value;
    }

    /**
     * Gets the value of the paxSegmentRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxSegmentRefID() {
        return paxSegmentRefID;
    }

    /**
     * Sets the value of the paxSegmentRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxSegmentRefID(String value) {
        this.paxSegmentRefID = value;
    }

}
