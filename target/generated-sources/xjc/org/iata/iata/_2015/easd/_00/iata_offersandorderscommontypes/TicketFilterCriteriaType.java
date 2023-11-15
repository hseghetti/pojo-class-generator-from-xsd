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
 * This is a specialization of the ticket class for use has filter criteria
 *  base definition:
 *  The accountable document issued by or on behalf of a carrier which includes notices and the flight and passenger coupons contained therein.
 * 
 * <p>Java class for TicketFilterCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketFilterCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IssueDateRange" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DateRangeType" minOccurs="0"/&gt;
 *         &lt;element name="TicketingLocationCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}IATA_LocationCodeType" minOccurs="0"/&gt;
 *         &lt;element name="TicketNumber" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}TextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketFilterCriteriaType", propOrder = {
    "issueDateRange",
    "ticketingLocationCode",
    "ticketNumber"
})
public class TicketFilterCriteriaType {

    @XmlElement(name = "IssueDateRange")
    protected DateRangeType issueDateRange;
    @XmlElement(name = "TicketingLocationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ticketingLocationCode;
    @XmlElement(name = "TicketNumber")
    protected String ticketNumber;

    /**
     * Gets the value of the issueDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRangeType }
     *     
     */
    public DateRangeType getIssueDateRange() {
        return issueDateRange;
    }

    /**
     * Sets the value of the issueDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRangeType }
     *     
     */
    public void setIssueDateRange(DateRangeType value) {
        this.issueDateRange = value;
    }

    /**
     * Gets the value of the ticketingLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingLocationCode() {
        return ticketingLocationCode;
    }

    /**
     * Sets the value of the ticketingLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingLocationCode(String value) {
        this.ticketingLocationCode = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

}