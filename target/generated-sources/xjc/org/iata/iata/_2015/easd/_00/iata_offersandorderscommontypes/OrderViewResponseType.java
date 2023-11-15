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
import javax.xml.bind.annotation.XmlType;


/**
 * Information related to the response.
 * 
 * <p>Java class for OrderViewResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderViewResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DataListsType" minOccurs="0"/&gt;
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}MetadataType" minOccurs="0"/&gt;
 *         &lt;element name="Order" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}OrderedOrderType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Processing" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ResponseParametersResponseType" minOccurs="0"/&gt;
 *         &lt;element name="PromotionList" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PromotionListType" minOccurs="0"/&gt;
 *         &lt;element name="TicketDocInfo" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}TicketDocInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}WarningType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderViewResponseType", propOrder = {
    "dataLists",
    "metadata",
    "order",
    "processing",
    "promotionList",
    "ticketDocInfo",
    "warning"
})
public class OrderViewResponseType {

    @XmlElement(name = "DataLists")
    protected DataListsType dataLists;
    @XmlElement(name = "Metadata")
    protected MetadataType metadata;
    @XmlElement(name = "Order", required = true)
    protected List<OrderedOrderType> order;
    @XmlElement(name = "Processing")
    protected ResponseParametersResponseType processing;
    @XmlElement(name = "PromotionList")
    protected PromotionListType promotionList;
    @XmlElement(name = "TicketDocInfo")
    protected List<TicketDocInfoType> ticketDocInfo;
    @XmlElement(name = "Warning")
    protected List<WarningType> warning;

    /**
     * Gets the value of the dataLists property.
     * 
     * @return
     *     possible object is
     *     {@link DataListsType }
     *     
     */
    public DataListsType getDataLists() {
        return dataLists;
    }

    /**
     * Sets the value of the dataLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataListsType }
     *     
     */
    public void setDataLists(DataListsType value) {
        this.dataLists = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataType }
     *     
     */
    public MetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataType }
     *     
     */
    public void setMetadata(MetadataType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the order property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderedOrderType }
     * 
     * 
     */
    public List<OrderedOrderType> getOrder() {
        if (order == null) {
            order = new ArrayList<OrderedOrderType>();
        }
        return this.order;
    }

    /**
     * Gets the value of the processing property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParametersResponseType }
     *     
     */
    public ResponseParametersResponseType getProcessing() {
        return processing;
    }

    /**
     * Sets the value of the processing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParametersResponseType }
     *     
     */
    public void setProcessing(ResponseParametersResponseType value) {
        this.processing = value;
    }

    /**
     * Gets the value of the promotionList property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionListType }
     *     
     */
    public PromotionListType getPromotionList() {
        return promotionList;
    }

    /**
     * Sets the value of the promotionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionListType }
     *     
     */
    public void setPromotionList(PromotionListType value) {
        this.promotionList = value;
    }

    /**
     * Gets the value of the ticketDocInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDocInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDocInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketDocInfoType }
     * 
     * 
     */
    public List<TicketDocInfoType> getTicketDocInfo() {
        if (ticketDocInfo == null) {
            ticketDocInfo = new ArrayList<TicketDocInfoType>();
        }
        return this.ticketDocInfo;
    }

    /**
     * Gets the value of the warning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningType }
     * 
     * 
     */
    public List<WarningType> getWarning() {
        if (warning == null) {
            warning = new ArrayList<WarningType>();
        }
        return this.warning;
    }

}
