//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_airshoppingrq;

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
 *         &lt;element name="GrandTotalAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="OrderItemID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrderItemTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AirlineDesigCodeType" minOccurs="0"/&gt;
 *         &lt;element name="OwnerTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}OwnerTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ReusableInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="Service" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTaxonomy" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ServiceTaxonomyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WebAddressURI" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}URI_Type" minOccurs="0"/&gt;
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
    "grandTotalAmount",
    "orderItemID",
    "orderItemTypeCode",
    "ownerCode",
    "ownerTypeCode",
    "reusableInd",
    "service",
    "serviceTaxonomy",
    "webAddressURI"
})
public class OrderItemType {

    @XmlElement(name = "GrandTotalAmount")
    protected AmountType grandTotalAmount;
    @XmlElement(name = "OrderItemID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderItemID;
    @XmlElement(name = "OrderItemTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderItemTypeCode;
    @XmlElement(name = "OwnerCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    @XmlElement(name = "OwnerTypeCode")
    @XmlSchemaType(name = "token")
    protected OwnerTypeCodeContentType ownerTypeCode;
    @XmlElement(name = "ReusableInd")
    protected Boolean reusableInd;
    @XmlElement(name = "Service")
    protected List<ServiceType> service;
    @XmlElement(name = "ServiceTaxonomy")
    protected List<ServiceTaxonomyType> serviceTaxonomy;
    @XmlElement(name = "WebAddressURI")
    @XmlSchemaType(name = "anyURI")
    protected String webAddressURI;

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

    /**
     * Gets the value of the serviceTaxonomy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceTaxonomy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceTaxonomy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceTaxonomyType }
     * 
     * 
     */
    public List<ServiceTaxonomyType> getServiceTaxonomy() {
        if (serviceTaxonomy == null) {
            serviceTaxonomy = new ArrayList<ServiceTaxonomyType>();
        }
        return this.serviceTaxonomy;
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