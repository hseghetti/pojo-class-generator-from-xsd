//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderreshoprq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * A collection of segments which satisfies transportation of a passenger for a given origin and destination.
 * 
 * <p>Java class for PaxJourneyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxJourneyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Duration" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRQ}DurationType" minOccurs="0"/&gt;
 *         &lt;element name="PaxJourneyID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRQ}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="PaxSegment" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRQ}PaxSegmentType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxJourneyType", propOrder = {
    "duration",
    "paxJourneyID",
    "paxSegment"
})
public class PaxJourneyType {

    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "PaxJourneyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxJourneyID;
    @XmlElement(name = "PaxSegment", required = true)
    protected List<PaxSegmentType> paxSegment;

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the paxJourneyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxJourneyID() {
        return paxJourneyID;
    }

    /**
     * Sets the value of the paxJourneyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxJourneyID(String value) {
        this.paxJourneyID = value;
    }

    /**
     * Gets the value of the paxSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxSegmentType }
     * 
     * 
     */
    public List<PaxSegmentType> getPaxSegment() {
        if (paxSegment == null) {
            paxSegment = new ArrayList<PaxSegmentType>();
        }
        return this.paxSegment;
    }

}
