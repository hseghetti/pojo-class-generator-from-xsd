//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_servicedeliverynotifrq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An individually priced item within an Order, made up of one or more Services. May or may not be a selected Offer Item (e.g. non-chargeable Services available on request such as a wheelchair).
 * 
 * <p>Java class for OrderItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}DescType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GrandTotalAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="OrderItemID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}ID_Type"/&gt;
 *         &lt;element name="OrderItemTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="PenaltyRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}ID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReusableInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="Service" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}ServiceType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemType", propOrder = {
    "desc",
    "grandTotalAmount",
    "orderItemID",
    "orderItemTypeCode",
    "penaltyRefID",
    "reusableInd",
    "service"
})
public class OrderItemType {

    @XmlElement(name = "Desc")
    protected List<DescType> desc;
    @XmlElement(name = "GrandTotalAmount")
    protected AmountType grandTotalAmount;
    @XmlElement(name = "OrderItemID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderItemID;
    @XmlElement(name = "OrderItemTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderItemTypeCode;
    @XmlElement(name = "PenaltyRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> penaltyRefID;
    @XmlElement(name = "ReusableInd")
    protected Boolean reusableInd;
    @XmlElement(name = "Service", required = true)
    protected List<ServiceType> service;

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescType }
     * 
     * 
     */
    public List<DescType> getDesc() {
        if (desc == null) {
            desc = new ArrayList<DescType>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the grandTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGrandTotalAmount() {
        return grandTotalAmount;
    }

    /**
     * Sets the value of the grandTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGrandTotalAmount(AmountType value) {
        this.grandTotalAmount = value;
    }

    /**
     * Gets the value of the orderItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemID() {
        return orderItemID;
    }

    /**
     * Sets the value of the orderItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderItemID(String value) {
        this.orderItemID = value;
    }

    /**
     * Gets the value of the orderItemTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemTypeCode() {
        return orderItemTypeCode;
    }

    /**
     * Sets the value of the orderItemTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderItemTypeCode(String value) {
        this.orderItemTypeCode = value;
    }

    /**
     * Gets the value of the penaltyRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenaltyRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPenaltyRefID() {
        if (penaltyRefID == null) {
            penaltyRefID = new ArrayList<String>();
        }
        return this.penaltyRefID;
    }

    /**
     * Gets the value of the reusableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReusableInd() {
        return reusableInd;
    }

    /**
     * Sets the value of the reusableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReusableInd(Boolean value) {
        this.reusableInd = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceType }
     * 
     * 
     */
    public List<ServiceType> getService() {
        if (service == null) {
            service = new ArrayList<ServiceType>();
        }
        return this.service;
    }

}
