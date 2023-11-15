//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_ordercancelrs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information corresponding to a group of 1 to 4 Tickets for a single Origin Destination and a single Passenger.
 * 
 * <p>Java class for TicketDocInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketDocInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaggageAllowance" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}BaggageAllowanceType" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="BookingAgency" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}TravelAgencyType" minOccurs="0"/&gt;
 *         &lt;element name="BookingRef" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}BookingRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BookletQty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}QtyType" minOccurs="0"/&gt;
 *         &lt;element name="CarrierFee" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}CarrierFeeType" minOccurs="0"/&gt;
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}CommissionType" minOccurs="0"/&gt;
 *         &lt;element name="EndorsementText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="FareDetail" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}FareDetailType" minOccurs="0"/&gt;
 *         &lt;element name="OrderRef" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}OrderRefType" minOccurs="0"/&gt;
 *         &lt;element name="OriginalIssueInfo" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}TicketIssuanceInfoType" minOccurs="0"/&gt;
 *         &lt;element name="OriginDest" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}OriginDestType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInfo" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}PaymentInfoType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Penalty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}PenaltyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PricingCountryCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="PricingDate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}DateType" minOccurs="0"/&gt;
 *         &lt;element name="PricingTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}TimeType" minOccurs="0"/&gt;
 *         &lt;element name="ServicingAgency" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}TravelAgencyType" minOccurs="0"/&gt;
 *         &lt;element name="Ticket" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}TicketType" maxOccurs="4"/&gt;
 *         &lt;element name="TicketRefIdentification" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}TicketRefIdentificationType" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketDocInfoType", propOrder = {
    "baggageAllowance",
    "bookingAgency",
    "bookingRef",
    "bookletQty",
    "carrierFee",
    "commission",
    "endorsementText",
    "fareDetail",
    "orderRef",
    "originalIssueInfo",
    "originDest",
    "paymentInfo",
    "penalty",
    "pricingCountryCode",
    "pricingDate",
    "pricingTime",
    "servicingAgency",
    "ticket",
    "ticketRefIdentification"
})
public class TicketDocInfoType {

    @XmlElement(name = "BaggageAllowance")
    protected List<BaggageAllowanceType> baggageAllowance;
    @XmlElement(name = "BookingAgency")
    protected TravelAgencyType bookingAgency;
    @XmlElement(name = "BookingRef")
    protected List<BookingRefType> bookingRef;
    @XmlElement(name = "BookletQty")
    protected BigDecimal bookletQty;
    @XmlElement(name = "CarrierFee")
    protected CarrierFeeType carrierFee;
    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "EndorsementText")
    protected String endorsementText;
    @XmlElement(name = "FareDetail")
    protected FareDetailType fareDetail;
    @XmlElement(name = "OrderRef")
    protected OrderRefType orderRef;
    @XmlElement(name = "OriginalIssueInfo")
    protected TicketIssuanceInfoType originalIssueInfo;
    @XmlElement(name = "OriginDest")
    protected OriginDestType originDest;
    @XmlElement(name = "PaymentInfo", required = true)
    protected List<PaymentInfoType> paymentInfo;
    @XmlElement(name = "Penalty")
    protected List<PenaltyType> penalty;
    @XmlElement(name = "PricingCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pricingCountryCode;
    @XmlElement(name = "PricingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pricingDate;
    @XmlElement(name = "PricingTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pricingTime;
    @XmlElement(name = "ServicingAgency")
    protected TravelAgencyType servicingAgency;
    @XmlElement(name = "Ticket", required = true)
    protected List<TicketType> ticket;
    @XmlElement(name = "TicketRefIdentification")
    protected List<TicketRefIdentificationType> ticketRefIdentification;

    /**
     * Gets the value of the baggageAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageAllowanceType }
     * 
     * 
     */
    public List<BaggageAllowanceType> getBaggageAllowance() {
        if (baggageAllowance == null) {
            baggageAllowance = new ArrayList<BaggageAllowanceType>();
        }
        return this.baggageAllowance;
    }

    /**
     * Gets the value of the bookingAgency property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgencyType }
     *     
     */
    public TravelAgencyType getBookingAgency() {
        return bookingAgency;
    }

    /**
     * Sets the value of the bookingAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgencyType }
     *     
     */
    public void setBookingAgency(TravelAgencyType value) {
        this.bookingAgency = value;
    }

    /**
     * Gets the value of the bookingRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingRefType }
     * 
     * 
     */
    public List<BookingRefType> getBookingRef() {
        if (bookingRef == null) {
            bookingRef = new ArrayList<BookingRefType>();
        }
        return this.bookingRef;
    }

    /**
     * Gets the value of the bookletQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBookletQty() {
        return bookletQty;
    }

    /**
     * Sets the value of the bookletQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBookletQty(BigDecimal value) {
        this.bookletQty = value;
    }

    /**
     * Gets the value of the carrierFee property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierFeeType }
     *     
     */
    public CarrierFeeType getCarrierFee() {
        return carrierFee;
    }

    /**
     * Sets the value of the carrierFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierFeeType }
     *     
     */
    public void setCarrierFee(CarrierFeeType value) {
        this.carrierFee = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * Gets the value of the endorsementText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndorsementText() {
        return endorsementText;
    }

    /**
     * Sets the value of the endorsementText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndorsementText(String value) {
        this.endorsementText = value;
    }

    /**
     * Gets the value of the fareDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailType }
     *     
     */
    public FareDetailType getFareDetail() {
        return fareDetail;
    }

    /**
     * Sets the value of the fareDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailType }
     *     
     */
    public void setFareDetail(FareDetailType value) {
        this.fareDetail = value;
    }

    /**
     * Gets the value of the orderRef property.
     * 
     * @return
     *     possible object is
     *     {@link OrderRefType }
     *     
     */
    public OrderRefType getOrderRef() {
        return orderRef;
    }

    /**
     * Sets the value of the orderRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderRefType }
     *     
     */
    public void setOrderRef(OrderRefType value) {
        this.orderRef = value;
    }

    /**
     * Gets the value of the originalIssueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TicketIssuanceInfoType }
     *     
     */
    public TicketIssuanceInfoType getOriginalIssueInfo() {
        return originalIssueInfo;
    }

    /**
     * Sets the value of the originalIssueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketIssuanceInfoType }
     *     
     */
    public void setOriginalIssueInfo(TicketIssuanceInfoType value) {
        this.originalIssueInfo = value;
    }

    /**
     * Gets the value of the originDest property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestType }
     *     
     */
    public OriginDestType getOriginDest() {
        return originDest;
    }

    /**
     * Sets the value of the originDest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestType }
     *     
     */
    public void setOriginDest(OriginDestType value) {
        this.originDest = value;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInfoType }
     * 
     * 
     */
    public List<PaymentInfoType> getPaymentInfo() {
        if (paymentInfo == null) {
            paymentInfo = new ArrayList<PaymentInfoType>();
        }
        return this.paymentInfo;
    }

    /**
     * Gets the value of the penalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PenaltyType }
     * 
     * 
     */
    public List<PenaltyType> getPenalty() {
        if (penalty == null) {
            penalty = new ArrayList<PenaltyType>();
        }
        return this.penalty;
    }

    /**
     * Gets the value of the pricingCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingCountryCode() {
        return pricingCountryCode;
    }

    /**
     * Sets the value of the pricingCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingCountryCode(String value) {
        this.pricingCountryCode = value;
    }

    /**
     * Gets the value of the pricingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPricingDate() {
        return pricingDate;
    }

    /**
     * Sets the value of the pricingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPricingDate(XMLGregorianCalendar value) {
        this.pricingDate = value;
    }

    /**
     * Gets the value of the pricingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPricingTime() {
        return pricingTime;
    }

    /**
     * Sets the value of the pricingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPricingTime(XMLGregorianCalendar value) {
        this.pricingTime = value;
    }

    /**
     * Gets the value of the servicingAgency property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgencyType }
     *     
     */
    public TravelAgencyType getServicingAgency() {
        return servicingAgency;
    }

    /**
     * Sets the value of the servicingAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgencyType }
     *     
     */
    public void setServicingAgency(TravelAgencyType value) {
        this.servicingAgency = value;
    }

    /**
     * Gets the value of the ticket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketType }
     * 
     * 
     */
    public List<TicketType> getTicket() {
        if (ticket == null) {
            ticket = new ArrayList<TicketType>();
        }
        return this.ticket;
    }

    /**
     * Gets the value of the ticketRefIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketRefIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketRefIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketRefIdentificationType }
     * 
     * 
     */
    public List<TicketRefIdentificationType> getTicketRefIdentification() {
        if (ticketRefIdentification == null) {
            ticketRefIdentification = new ArrayList<TicketRefIdentificationType>();
        }
        return this.ticketRefIdentification;
    }

}
