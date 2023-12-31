//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_ordercancelrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Reservation change information which describes new flight information as it relates to a changed reservation.
 * 
 * <p>Java class for ResChangeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResChangeInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaxSegment" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}PaxSegmentType" minOccurs="0"/&gt;
 *         &lt;element name="ResStatusCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}CodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResChangeInfoType", propOrder = {
    "paxSegment",
    "resStatusCode"
})
public class ResChangeInfoType {

    @XmlElement(name = "PaxSegment")
    protected PaxSegmentType paxSegment;
    @XmlElement(name = "ResStatusCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String resStatusCode;

    /**
     * Gets the value of the paxSegment property.
     * 
     * @return
     *     possible object is
     *     {@link PaxSegmentType }
     *     
     */
    public PaxSegmentType getPaxSegment() {
        return paxSegment;
    }

    /**
     * Sets the value of the paxSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxSegmentType }
     *     
     */
    public void setPaxSegment(PaxSegmentType value) {
        this.paxSegment = value;
    }

    /**
     * Gets the value of the resStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResStatusCode() {
        return resStatusCode;
    }

    /**
     * Sets the value of the resStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResStatusCode(String value) {
        this.resStatusCode = value;
    }

}
