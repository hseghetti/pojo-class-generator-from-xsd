//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_airdocnotifrq;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The portion of the Passenger Ticket and Baggage Check or Excess Baggage Ticket that indicates particular places between which the coupon is good for carriage.
 * 
 * <p>Java class for CouponType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CouponNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirDocNotifRQ}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="CouponStatusCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirDocNotifRQ}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="FlightDetails" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirDocNotifRQ}PaxSegmentType" minOccurs="0"/&gt;
 *         &lt;element name="OrderItem" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirDocNotifRQ}OrderItemType" minOccurs="0"/&gt;
 *         &lt;element name="RFIC" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirDocNotifRQ}RFIC_Type" minOccurs="0"/&gt;
 *         &lt;element name="RFISC" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirDocNotifRQ}RFISC_Type" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirDocNotifRQ}DateType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirDocNotifRQ}NameType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceQty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirDocNotifRQ}QtyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTypeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirDocNotifRQ}TextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponType", propOrder = {
    "couponNumber",
    "couponStatusCode",
    "flightDetails",
    "orderItem",
    "rfic",
    "rfisc",
    "serviceDate",
    "serviceName",
    "serviceQty",
    "serviceTypeText"
})
public class CouponType {

    @XmlElement(name = "CouponNumber")
    protected BigDecimal couponNumber;
    @XmlElement(name = "CouponStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String couponStatusCode;
    @XmlElement(name = "FlightDetails")
    protected PaxSegmentType flightDetails;
    @XmlElement(name = "OrderItem")
    protected OrderItemType orderItem;
    @XmlElement(name = "RFIC")
    protected String rfic;
    @XmlElement(name = "RFISC")
    protected String rfisc;
    @XmlElement(name = "ServiceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serviceDate;
    @XmlElement(name = "ServiceName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceName;
    @XmlElement(name = "ServiceQty")
    protected BigDecimal serviceQty;
    @XmlElement(name = "ServiceTypeText")
    protected String serviceTypeText;

    /**
     * Gets the value of the couponNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCouponNumber() {
        return couponNumber;
    }

    /**
     * Sets the value of the couponNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCouponNumber(BigDecimal value) {
        this.couponNumber = value;
    }

    /**
     * Gets the value of the couponStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponStatusCode() {
        return couponStatusCode;
    }

    /**
     * Sets the value of the couponStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponStatusCode(String value) {
        this.couponStatusCode = value;
    }

    /**
     * Gets the value of the flightDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaxSegmentType }
     *     
     */
    public PaxSegmentType getFlightDetails() {
        return flightDetails;
    }

    /**
     * Sets the value of the flightDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxSegmentType }
     *     
     */
    public void setFlightDetails(PaxSegmentType value) {
        this.flightDetails = value;
    }

    /**
     * Gets the value of the orderItem property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemType }
     *     
     */
    public OrderItemType getOrderItem() {
        return orderItem;
    }

    /**
     * Sets the value of the orderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemType }
     *     
     */
    public void setOrderItem(OrderItemType value) {
        this.orderItem = value;
    }

    /**
     * Gets the value of the rfic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFIC() {
        return rfic;
    }

    /**
     * Sets the value of the rfic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFIC(String value) {
        this.rfic = value;
    }

    /**
     * Gets the value of the rfisc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFISC() {
        return rfisc;
    }

    /**
     * Sets the value of the rfisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFISC(String value) {
        this.rfisc = value;
    }

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceDate(XMLGregorianCalendar value) {
        this.serviceDate = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the serviceQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceQty() {
        return serviceQty;
    }

    /**
     * Sets the value of the serviceQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceQty(BigDecimal value) {
        this.serviceQty = value;
    }

    /**
     * Gets the value of the serviceTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTypeText() {
        return serviceTypeText;
    }

    /**
     * Sets the value of the serviceTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTypeText(String value) {
        this.serviceTypeText = value;
    }

}
