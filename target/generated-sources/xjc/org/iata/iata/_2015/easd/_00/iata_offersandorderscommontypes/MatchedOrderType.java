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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * List of Order IDs and order information which match the Filter Criteria specified in OrderListRQ.
 * 
 * <p>Java class for MatchedOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchedOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Arrival" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ArrivalType" minOccurs="0"/&gt;
 *         &lt;element name="CreationDateTime" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="Dep" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DepType" minOccurs="0"/&gt;
 *         &lt;element name="OrderRefID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ID_Type"/&gt;
 *         &lt;element name="OrderStatusCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}OrderStatusCodeType" minOccurs="0"/&gt;
 *         &lt;element name="PaxGroup" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaxGroupType" minOccurs="0"/&gt;
 *         &lt;element name="PaxList" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaxListType" minOccurs="0"/&gt;
 *         &lt;element name="TicketingStatusCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="TravelAgency" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}TravelAgencyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchedOrderType", propOrder = {
    "arrival",
    "creationDateTime",
    "dep",
    "orderRefID",
    "orderStatusCode",
    "paxGroup",
    "paxList",
    "ticketingStatusCode",
    "travelAgency"
})
public class MatchedOrderType {

    @XmlElement(name = "Arrival")
    protected ArrivalType arrival;
    @XmlElement(name = "CreationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlElement(name = "Dep")
    protected DepType dep;
    @XmlElement(name = "OrderRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderRefID;
    @XmlElement(name = "OrderStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderStatusCode;
    @XmlElement(name = "PaxGroup")
    protected PaxGroupType paxGroup;
    @XmlElement(name = "PaxList")
    protected PaxListType paxList;
    @XmlElement(name = "TicketingStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ticketingStatusCode;
    @XmlElement(name = "TravelAgency")
    protected TravelAgencyType travelAgency;

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalType }
     *     
     */
    public ArrivalType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalType }
     *     
     */
    public void setArrival(ArrivalType value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the dep property.
     * 
     * @return
     *     possible object is
     *     {@link DepType }
     *     
     */
    public DepType getDep() {
        return dep;
    }

    /**
     * Sets the value of the dep property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepType }
     *     
     */
    public void setDep(DepType value) {
        this.dep = value;
    }

    /**
     * Gets the value of the orderRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderRefID() {
        return orderRefID;
    }

    /**
     * Sets the value of the orderRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderRefID(String value) {
        this.orderRefID = value;
    }

    /**
     * Gets the value of the orderStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatusCode() {
        return orderStatusCode;
    }

    /**
     * Sets the value of the orderStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatusCode(String value) {
        this.orderStatusCode = value;
    }

    /**
     * Gets the value of the paxGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PaxGroupType }
     *     
     */
    public PaxGroupType getPaxGroup() {
        return paxGroup;
    }

    /**
     * Sets the value of the paxGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxGroupType }
     *     
     */
    public void setPaxGroup(PaxGroupType value) {
        this.paxGroup = value;
    }

    /**
     * Gets the value of the paxList property.
     * 
     * @return
     *     possible object is
     *     {@link PaxListType }
     *     
     */
    public PaxListType getPaxList() {
        return paxList;
    }

    /**
     * Sets the value of the paxList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxListType }
     *     
     */
    public void setPaxList(PaxListType value) {
        this.paxList = value;
    }

    /**
     * Gets the value of the ticketingStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingStatusCode() {
        return ticketingStatusCode;
    }

    /**
     * Sets the value of the ticketingStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingStatusCode(String value) {
        this.ticketingStatusCode = value;
    }

    /**
     * Gets the value of the travelAgency property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgencyType }
     *     
     */
    public TravelAgencyType getTravelAgency() {
        return travelAgency;
    }

    /**
     * Sets the value of the travelAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgencyType }
     *     
     */
    public void setTravelAgency(TravelAgencyType value) {
        this.travelAgency = value;
    }

}
