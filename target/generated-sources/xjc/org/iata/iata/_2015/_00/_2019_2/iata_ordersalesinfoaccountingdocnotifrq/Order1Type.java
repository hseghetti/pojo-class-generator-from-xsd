//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_ordersalesinfoaccountingdocnotifrq;

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
 * A uniquely identified record of the agreement of one party with another to receive products and services under specified terms and conditions. Order supports the sale of a flexible range of airline products and services that are not necessarily Journey based (e.g. subscription services).
 * 
 * <p>Java class for Order1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Order1Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderItem" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInfoAccountingDocNotifRQ}OrderItem1Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrderRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInfoAccountingDocNotifRQ}ID_Type"/&gt;
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInfoAccountingDocNotifRQ}AirlineDesigCodeType"/&gt;
 *         &lt;element name="OwnerTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInfoAccountingDocNotifRQ}OwnerTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="WebAddressURI" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInfoAccountingDocNotifRQ}URI_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order1Type", propOrder = {
    "orderItem",
    "orderRefID",
    "ownerCode",
    "ownerTypeCode",
    "webAddressURI"
})
public class Order1Type {

    @XmlElement(name = "OrderItem")
    protected List<OrderItem1Type> orderItem;
    @XmlElement(name = "OrderRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderRefID;
    @XmlElement(name = "OwnerCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    @XmlElement(name = "OwnerTypeCode")
    @XmlSchemaType(name = "token")
    protected OwnerTypeCodeContentType ownerTypeCode;
    @XmlElement(name = "WebAddressURI")
    @XmlSchemaType(name = "anyURI")
    protected String webAddressURI;

    /**
     * Gets the value of the orderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItem1Type }
     * 
     * 
     */
    public List<OrderItem1Type> getOrderItem() {
        if (orderItem == null) {
            orderItem = new ArrayList<OrderItem1Type>();
        }
        return this.orderItem;
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
     * Gets the value of the ownerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

    /**
     * Gets the value of the ownerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerTypeCodeContentType }
     *     
     */
    public OwnerTypeCodeContentType getOwnerTypeCode() {
        return ownerTypeCode;
    }

    /**
     * Sets the value of the ownerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerTypeCodeContentType }
     *     
     */
    public void setOwnerTypeCode(OwnerTypeCodeContentType value) {
        this.ownerTypeCode = value;
    }

    /**
     * Gets the value of the webAddressURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddressURI() {
        return webAddressURI;
    }

    /**
     * Sets the value of the webAddressURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAddressURI(String value) {
        this.webAddressURI = value;
    }

}
