//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015.easd._00.iata_offersandorderscommontypes;

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
 * Document information for AirDocNotifRQ.
 * 
 * <p>Java class for DocNotifType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocNotifType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactInfoList" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ContactInfoListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Coupon" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DocNotifCouponType" maxOccurs="4"/&gt;
 *         &lt;element name="DatedMarketingSegmentList" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DatedMarketingSegmentListType" minOccurs="0"/&gt;
 *         &lt;element name="DatedOperatingLegList" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DatedOperatingLegListType" minOccurs="0"/&gt;
 *         &lt;element name="DatedOperatingSegmentList" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DatedOperatingSegmentListType" minOccurs="0"/&gt;
 *         &lt;element name="IssueDate" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DateType" minOccurs="0"/&gt;
 *         &lt;element name="Order" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}OrderKeyType"/&gt;
 *         &lt;element name="Pax" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaxType"/&gt;
 *         &lt;element name="TicketDocTypeCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CodeType" minOccurs="0"/&gt;
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
@XmlType(name = "DocNotifType", propOrder = {
    "contactInfoList",
    "coupon",
    "datedMarketingSegmentList",
    "datedOperatingLegList",
    "datedOperatingSegmentList",
    "issueDate",
    "order",
    "pax",
    "ticketDocTypeCode",
    "ticketNumber"
})
public class DocNotifType {

    @XmlElement(name = "ContactInfoList")
    protected List<ContactInfoListType> contactInfoList;
    @XmlElement(name = "Coupon", required = true)
    protected List<DocNotifCouponType> coupon;
    @XmlElement(name = "DatedMarketingSegmentList")
    protected DatedMarketingSegmentListType datedMarketingSegmentList;
    @XmlElement(name = "DatedOperatingLegList")
    protected DatedOperatingLegListType datedOperatingLegList;
    @XmlElement(name = "DatedOperatingSegmentList")
    protected DatedOperatingSegmentListType datedOperatingSegmentList;
    @XmlElement(name = "IssueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "Order", required = true)
    protected OrderKeyType order;
    @XmlElement(name = "Pax", required = true)
    protected PaxType pax;
    @XmlElement(name = "TicketDocTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ticketDocTypeCode;
    @XmlElement(name = "TicketNumber")
    protected String ticketNumber;

    /**
     * Gets the value of the contactInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfoListType }
     * 
     * 
     */
    public List<ContactInfoListType> getContactInfoList() {
        if (contactInfoList == null) {
            contactInfoList = new ArrayList<ContactInfoListType>();
        }
        return this.contactInfoList;
    }

    /**
     * Gets the value of the coupon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coupon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoupon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocNotifCouponType }
     * 
     * 
     */
    public List<DocNotifCouponType> getCoupon() {
        if (coupon == null) {
            coupon = new ArrayList<DocNotifCouponType>();
        }
        return this.coupon;
    }

    /**
     * Gets the value of the datedMarketingSegmentList property.
     * 
     * @return
     *     possible object is
     *     {@link DatedMarketingSegmentListType }
     *     
     */
    public DatedMarketingSegmentListType getDatedMarketingSegmentList() {
        return datedMarketingSegmentList;
    }

    /**
     * Sets the value of the datedMarketingSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedMarketingSegmentListType }
     *     
     */
    public void setDatedMarketingSegmentList(DatedMarketingSegmentListType value) {
        this.datedMarketingSegmentList = value;
    }

    /**
     * Gets the value of the datedOperatingLegList property.
     * 
     * @return
     *     possible object is
     *     {@link DatedOperatingLegListType }
     *     
     */
    public DatedOperatingLegListType getDatedOperatingLegList() {
        return datedOperatingLegList;
    }

    /**
     * Sets the value of the datedOperatingLegList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedOperatingLegListType }
     *     
     */
    public void setDatedOperatingLegList(DatedOperatingLegListType value) {
        this.datedOperatingLegList = value;
    }

    /**
     * Gets the value of the datedOperatingSegmentList property.
     * 
     * @return
     *     possible object is
     *     {@link DatedOperatingSegmentListType }
     *     
     */
    public DatedOperatingSegmentListType getDatedOperatingSegmentList() {
        return datedOperatingSegmentList;
    }

    /**
     * Sets the value of the datedOperatingSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedOperatingSegmentListType }
     *     
     */
    public void setDatedOperatingSegmentList(DatedOperatingSegmentListType value) {
        this.datedOperatingSegmentList = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderKeyType }
     *     
     */
    public OrderKeyType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderKeyType }
     *     
     */
    public void setOrder(OrderKeyType value) {
        this.order = value;
    }

    /**
     * Gets the value of the pax property.
     * 
     * @return
     *     possible object is
     *     {@link PaxType }
     *     
     */
    public PaxType getPax() {
        return pax;
    }

    /**
     * Sets the value of the pax property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxType }
     *     
     */
    public void setPax(PaxType value) {
        this.pax = value;
    }

    /**
     * Gets the value of the ticketDocTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDocTypeCode() {
        return ticketDocTypeCode;
    }

    /**
     * Sets the value of the ticketDocTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDocTypeCode(String value) {
        this.ticketDocTypeCode = value;
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
