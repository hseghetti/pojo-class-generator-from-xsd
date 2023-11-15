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
 * A choice of Cabin Type Association to leg(s) or a segment
 * 
 * <p>Java class for CabinTypeAssociationChoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinTypeAssociationChoiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="LegCabinAssociations" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}LegCabinAssociationsType"/&gt;
 *         &lt;element name="SegmentCabinType" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CabinTypeType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinTypeAssociationChoiceType", propOrder = {
    "legCabinAssociations",
    "segmentCabinType"
})
public class CabinTypeAssociationChoiceType {

    @XmlElement(name = "LegCabinAssociations")
    protected LegCabinAssociationsType legCabinAssociations;
    @XmlElement(name = "SegmentCabinType")
    protected CabinTypeType segmentCabinType;

    /**
     * Gets the value of the legCabinAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link LegCabinAssociationsType }
     *     
     */
    public LegCabinAssociationsType getLegCabinAssociations() {
        return legCabinAssociations;
    }

    /**
     * Sets the value of the legCabinAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegCabinAssociationsType }
     *     
     */
    public void setLegCabinAssociations(LegCabinAssociationsType value) {
        this.legCabinAssociations = value;
    }

    /**
     * Gets the value of the segmentCabinType property.
     * 
     * @return
     *     possible object is
     *     {@link CabinTypeType }
     *     
     */
    public CabinTypeType getSegmentCabinType() {
        return segmentCabinType;
    }

    /**
     * Sets the value of the segmentCabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinTypeType }
     *     
     */
    public void setSegmentCabinType(CabinTypeType value) {
        this.segmentCabinType = value;
    }

}
