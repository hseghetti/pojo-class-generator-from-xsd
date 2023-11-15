//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_seatavailabilityrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type of compartment of an aircraft, offering specific services (e.g. business class, economy).
 * 
 * <p>Java class for CabinTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CabinTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_SeatAvailabilityRQ}CabinTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CabinTypeName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_SeatAvailabilityRQ}NameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinTypeType", propOrder = {
    "cabinTypeCode",
    "cabinTypeName"
})
public class CabinTypeType {

    @XmlElement(name = "CabinTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cabinTypeCode;
    @XmlElement(name = "CabinTypeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cabinTypeName;

    /**
     * Gets the value of the cabinTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinTypeCode() {
        return cabinTypeCode;
    }

    /**
     * Sets the value of the cabinTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinTypeCode(String value) {
        this.cabinTypeCode = value;
    }

    /**
     * Gets the value of the cabinTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinTypeName() {
        return cabinTypeName;
    }

    /**
     * Sets the value of the cabinTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinTypeName(String value) {
        this.cabinTypeName = value;
    }

}
