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
 * Interline Order Service Association
 * 
 * <p>Java class for InterlineOrderServiceAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterlineOrderServiceAssociationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="PaxSegmentReferences" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaxSegmentRefListType"/&gt;
 *         &lt;element name="SeatOnLeg" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SeatOnLegType"/&gt;
 *         &lt;element name="ServiceDefinitionRef" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}OrderServiceDefinitionRefType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterlineOrderServiceAssociationType", propOrder = {
    "paxSegmentReferences",
    "seatOnLeg",
    "serviceDefinitionRef"
})
public class InterlineOrderServiceAssociationType {

    @XmlElement(name = "PaxSegmentReferences")
    protected PaxSegmentRefListType paxSegmentReferences;
    @XmlElement(name = "SeatOnLeg")
    protected SeatOnLegType seatOnLeg;
    @XmlElement(name = "ServiceDefinitionRef")
    protected OrderServiceDefinitionRefType serviceDefinitionRef;

    /**
     * Gets the value of the paxSegmentReferences property.
     * 
     * @return
     *     possible object is
     *     {@link PaxSegmentRefListType }
     *     
     */
    public PaxSegmentRefListType getPaxSegmentReferences() {
        return paxSegmentReferences;
    }

    /**
     * Sets the value of the paxSegmentReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxSegmentRefListType }
     *     
     */
    public void setPaxSegmentReferences(PaxSegmentRefListType value) {
        this.paxSegmentReferences = value;
    }

    /**
     * Gets the value of the seatOnLeg property.
     * 
     * @return
     *     possible object is
     *     {@link SeatOnLegType }
     *     
     */
    public SeatOnLegType getSeatOnLeg() {
        return seatOnLeg;
    }

    /**
     * Sets the value of the seatOnLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatOnLegType }
     *     
     */
    public void setSeatOnLeg(SeatOnLegType value) {
        this.seatOnLeg = value;
    }

    /**
     * Gets the value of the serviceDefinitionRef property.
     * 
     * @return
     *     possible object is
     *     {@link OrderServiceDefinitionRefType }
     *     
     */
    public OrderServiceDefinitionRefType getServiceDefinitionRef() {
        return serviceDefinitionRef;
    }

    /**
     * Sets the value of the serviceDefinitionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderServiceDefinitionRefType }
     *     
     */
    public void setServiceDefinitionRef(OrderServiceDefinitionRefType value) {
        this.serviceDefinitionRef = value;
    }

}
