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
 * Seat Assignment Associations
 * 
 * <p>Java class for SeatAssignmentAssociationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatAssignmentAssociationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="DatedOperatingLegRef" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DatedOperatingLegRefType"/&gt;
 *         &lt;element name="PaxSegmentRef" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaxSegmentRefType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatAssignmentAssociationsType", propOrder = {
    "datedOperatingLegRef",
    "paxSegmentRef"
})
public class SeatAssignmentAssociationsType {

    @XmlElement(name = "DatedOperatingLegRef")
    protected DatedOperatingLegRefType datedOperatingLegRef;
    @XmlElement(name = "PaxSegmentRef")
    protected PaxSegmentRefType paxSegmentRef;

    /**
     * Gets the value of the datedOperatingLegRef property.
     * 
     * @return
     *     possible object is
     *     {@link DatedOperatingLegRefType }
     *     
     */
    public DatedOperatingLegRefType getDatedOperatingLegRef() {
        return datedOperatingLegRef;
    }

    /**
     * Sets the value of the datedOperatingLegRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedOperatingLegRefType }
     *     
     */
    public void setDatedOperatingLegRef(DatedOperatingLegRefType value) {
        this.datedOperatingLegRef = value;
    }

    /**
     * Gets the value of the paxSegmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link PaxSegmentRefType }
     *     
     */
    public PaxSegmentRefType getPaxSegmentRef() {
        return paxSegmentRef;
    }

    /**
     * Sets the value of the paxSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxSegmentRefType }
     *     
     */
    public void setPaxSegmentRef(PaxSegmentRefType value) {
        this.paxSegmentRef = value;
    }

}
